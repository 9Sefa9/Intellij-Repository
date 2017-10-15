package RaspberryPi;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Server{
    private Socket client;
    private ServerSocket server;
    private InetAddress address;
    public final int SERVERID = 2;
    public static void main(String[] args) throws IOException {
        Server r = new Server();
        r.Server();
    }
    public void Server(){

        //192.168.178.75
        try{
            address = InetAddress.getByName("localhost");
            server = new ServerSocket(8080,0,address);
            while(true) {
                client = server.accept();
                new Thread(new innerThreadClass(client,this.SERVERID)).start();
            }
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
class innerThreadClass implements Runnable{
    public int SERVERID;
    Socket client;
    DataInputStream fileReaderLocal ;
    DataInputStream disClient;
    DataOutputStream dosClient;

    public innerThreadClass(Socket client, int SERVERID){
        this.client = client;
        this.SERVERID = SERVERID;
    }

    @Override
    public void run() {
        Path currentPath = Paths.get("");
        String currentLocation = currentPath.toAbsolutePath().toString();
        System.out.println("Read new Version from:" + currentLocation);
        try {
            dosClient = new DataOutputStream(client.getOutputStream());
            disClient = new DataInputStream(client.getInputStream());
            FileInputStream f = new FileInputStream(currentLocation + "\\DonutDownloader.jar");
            fileReaderLocal = new DataInputStream(f);

            System.out.println("Sending: " + SERVERID);

            dosClient.writeInt(SERVERID);
            dosClient.flush();

            System.out.println("bytes: "+f.getChannel().size());

            dosClient.writeLong(f.getChannel().size());
            dosClient.flush();
            byte[] buffer = new byte[(int)f.getChannel().size()];
            int temp;
            System.out.println("CONNECTION ESTABLISHED. SENDING DATA");

            while ((temp = fileReaderLocal.read(buffer)) != 0) {
                dosClient.write(buffer, 0, temp);
            }
            System.out.println("DONE!");
        } catch (IOException i) {
            i.printStackTrace();
        }finally {
            try {
                if (dosClient != null)
                    dosClient.close();

                if(disClient != null)
                    disClient.close();

                if(fileReaderLocal != null)
                    fileReaderLocal.close();

            } catch (Exception i) {
                i.printStackTrace();
            }
        }

    }
}