package MP3Downloader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("MP3Downloader v1.0");
        Scanner input = new Scanner(System.in);
        System.out.print("URL: ");
        String urlYoutube = input.nextLine();
        System.out.print("SAVEPATH: ");
        String savepath = input.nextLine();

        MP3 mp3 = new MP3(urlYoutube,savepath);
        try {
            mp3.createWebsite("http://convert2mp3.net/");
            mp3.processYoutubeLink();
            mp3.downloadMp3FromServer();
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
}
