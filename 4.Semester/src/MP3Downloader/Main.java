package MP3Downloader;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application{
    /*
    private static Stack<String> list = new Stack<>();
    private static String urlYoutube,savepath;

    public static void main(String[] args){
        System.out.println("MP3Downloader v1.0");
        Scanner input = new Scanner(System.in);

        System.out.print("SAVEPATH: ");
        savepath = input.nextLine();

        System.out.print("ENTER YOUTUBE URL'S, HIT ZERO IF YOU ARE DONE!.: ");
        System.out.println();
        while(!(urlYoutube = input.nextLine()).equals("0")){
            list.add(urlYoutube);
        }

        int index = 0;
        while(!list.isEmpty()) {
            MP3 mp3 = null;
            try {
                    mp3 = new MP3(list.pop(), savepath + "/music" + index + ".mp3");
                    mp3.createWebsite("http://convert2mp3.net/");
                    mp3.processYoutubeLink();
                    mp3.downloadMp3FromServer();
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                index+=1;
            }
        }
    }
    */
    @Override
    public void start(Stage primaryStage) throws Exception {
        View view = new View();
        Scene scene = new Scene(view);
        Model model = new Model();
        Controller controller = new Controller(view,model);
        controller.link();

        primaryStage.setTitle("MP3Downloader v1.0");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
