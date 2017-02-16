import java.net.*;
import java.io.*;

public class ClientA {

    public static void main(String[] a){
        try{
            Socket Anschluss = new Socket("localhost",8080);
            PrintWriter dos = new PrintWriter (Anschluss.getOutputStream(),true);
            dos.println("Guten Tag und viel Spass!");
            dos.flush();
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}
