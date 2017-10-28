package MP3Downloader;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.*;

public class Model{
    public static int ID = 9;
    public  Socket client = null;
    public  View view;
    public  DirectoryChooser dirChooser;
    public File fileSave;
    public  String choosenPath = new String();
    public ListView<String> downloadList,convertList;
    public DataInputStream disFromServer;
    public DataOutputStream dosFromServer,dosFromLocal;
    public Path currentPath;
    public int serverID;
    public String currentLocation;

    public ObservableList<String> urllist;

    public Model(View view) throws Exception {

        //mp3 initialisierung
        urllist = FXCollections.observableArrayList();
        this.view = view;
    }

   //attached to add to mp3 list

    public void setUrlToList(String url, ListView<String> downloadList) {

        if (!url.isEmpty() && url.startsWith("https://www.youtube")) {
            try {

                for(int i = 0; i<downloadList.getItems().size(); i++){
                    if(downloadList.getItems().get(i).equals(url)){
                        return;
                    }
                }


                this.urllist.add(url);
                downloadList.getItems().add(url);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void processDownloadFromList(ListView<String> convertList, ListView<String> downloadList){
        this.downloadList = downloadList;
        this.convertList = convertList;
        if (this.choosenPath != null && !this.choosenPath.equals("")) {

            for(String url:this.urllist){
                this.downloadList.getItems().add("Downloading "+url);
                this.convertList.getItems().remove(url);
            }

            new innerProcessClass(this.choosenPath,this.urllist,downloadList,convertList).start();
            this.urllist = FXCollections.observableArrayList();


        } else {
            savePath();
            processDownloadFromList(convertList, downloadList);
        }
    }
    //attached to paste
    public void ctrlv(TextField urlfield) {
        urlfield.setText(null);
        urlfield.paste();

        if (!urlfield.getText().startsWith("https://www.youtube")) {
            urlfield.setText(null);
            urlfield.setStyle("-fx-prompt-text-fill: red");
            urlfield.setPromptText("Copied URL is not a valid Youtube link !");
        }
    }
    //attached to save path
    public void savePath() {
    try {
        dirChooser = new DirectoryChooser();

        //zeigt den "save" Fenster

        fileSave = dirChooser.showDialog(new Stage());
        //solange fenster offen
        if (fileSave != null) {
            //speichere den Ordner ab
            this.choosenPath = fileSave.getAbsolutePath();
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

}
    //attached to save path as well
    public void openSavepathExplorer(){
        try {
            Runtime.getRuntime().exec("explorer.exe " + this.choosenPath);
        }catch(IOException i){
            i.printStackTrace();
        }

    }

    public void replaceTitleWith(String defaultTitle,String titleFromView){
        File oldF,newF;
        try{
            oldF = new File(this.choosenPath+"/"+defaultTitle+".mp3");
            newF =  new File(this.choosenPath+"/"+titleFromView+".mp3");
            if(oldF.exists()){
                oldF.renameTo(newF);
            }
            else{
                throw new Exception("Could not change name!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //check if it has Updates. if yes, the if condition in Controller will be active.
    public boolean hasUpdate() throws IOException,ExecutionException,InterruptedException{
        try{
            client = new Socket();
            client.connect(new InetSocketAddress("rudralovesparo.ddns.net",23),3000);

            if(client.isConnected()){
                dosFromServer = new DataOutputStream(client.getOutputStream());
                disFromServer = new DataInputStream(client.getInputStream());
                serverID = disFromServer.readInt();
                System.out.println("CURRENT ID:"+this.ID);
                System.out.println("RECEIVING ID:"+serverID);
                    if(serverID>this.ID){

                        currentPath = Paths.get("");
                        currentLocation = currentPath.toAbsolutePath().toString()+"\\DonutDownloaderV1."+this.serverID+".jar";
                        dosFromLocal = new DataOutputStream(new FileOutputStream(currentLocation));
                        dosFromServer.writeBoolean(true);
                        dosFromServer.flush();
                        return true;
                    }else {
                        dosFromServer.writeBoolean(false);
                        dosFromServer.flush();
                        return false;
                    }

            }else if(client.isInputShutdown() || client.isOutputShutdown() || client.isClosed()){
                dosFromServer.writeBoolean(false);
                dosFromServer.flush();
                return false;
            }else return false;
        }catch(SocketTimeoutException s){
            System.out.println("CONNECTION TIMEOUT!");
            if(this.view.dialog.isShowing())
            Platform.runLater(() -> this.view.dialog.close());

        }catch(IOException i){
            System.out.println("NO CONNECTION FOUND!");

            if(this.view.dialog.isShowing())
                Platform.runLater(() -> this.view.dialog.close());

            i.printStackTrace();
        }

        return false;
    }
    //retrieve lastVersion and download it.
    public void processUpdate(){
        new UpdateClass(this.disFromServer,this.dosFromLocal).start();
    }
}

class innerProcessClass extends Thread{
        private ObservableList<String> urllist;
        private ListView<String> convertList,downloadList;
        private String choosenPath;


    public innerProcessClass(String path,ObservableList<String> urllist,ListView<String> downloadList,ListView<String> convertList){
        this.urllist = urllist;
        this.convertList = convertList;
        this.downloadList = downloadList;
        this.choosenPath = path;
    }
    @Override
    public void run(){
       ObservableList<CompletableFuture<String>> temp = FXCollections.observableArrayList();

       for(String youtubeUrl: this.urllist){

            System.out.println("Thread gestartet!");
            temp.add(CompletableFuture.supplyAsync(new MP3(youtubeUrl,this.choosenPath)));

           //musste so hässlig sein, weil er irgendwas mit not fx thread labert...
           Platform.runLater(new Runnable() {
               @Override
               public void run() {
                   for (int j = 0; j < temp.size(); j++) {
                       try {
                           downloadList.getItems().remove(j);
                           downloadList.getItems().add(""+temp.get(j).get());
                           temp.remove(j);
                       }catch(Exception e) {
                           e.printStackTrace();
                       }
                   }
               }
           });
        }
    }
}
class UpdateClass extends Thread{

    private DataOutputStream dosFromLocal;
    private DataInputStream disFromServer;
    public UpdateClass(DataInputStream disServer,DataOutputStream dosLocal){
        this.disFromServer= disServer;
        this.dosFromLocal = dosLocal;
    }

    @Override
    public void run(){
        System.out.println("PROCESS UPDATE");
        try{
            // Get length of the FIle
            long fileSizeInBytes =  disFromServer.readLong();
            // Convert the bytes to Kilobytes (1 KB = 1024 Bytes)
            long fileSizeInKB = fileSizeInBytes / 1024;
            // Convert the KB to MegaBytes (1 MB = 1024 KBytes)
            long fileSizeInMB = fileSizeInKB / 1024;

            System.out.println("RECEIVING "+fileSizeInMB+" MB DATA FROM SERVER");

            byte[] buffer = new byte[(int)fileSizeInBytes+8192];
            int temp;

            while((temp = disFromServer.read(buffer)) != -1){
                dosFromLocal.write(buffer,0,temp);
            }
            System.out.println("DONE!\n\n");
            //Exit the Current program and kill every running Thread.
            final ExecutorService exec = Executors.newCachedThreadPool();
            exec.shutdown();
            System.out.println("BACKGROUND TASKS WERE EXECUTED");

            Platform.exit();

        }catch (Exception i){
            System.out.println("PROCESS UPDATE FAILED");
            i.printStackTrace();
        }finally {

            try{
                if(dosFromLocal != null)
                    dosFromLocal.close();
                if(dosFromLocal!= null)
                    dosFromLocal.close();

                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}