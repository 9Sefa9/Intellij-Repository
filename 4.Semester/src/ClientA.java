import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ClientA extends Thread {
    public static Scanner eingabe = new Scanner(System.in);
    public static void main(String[] a){
    new ClientA().start();

    }
    public void run(){
        try{
            Socket Anschluss = new Socket("localhost",8080);
            PrintWriter dos = new PrintWriter (Anschluss.getOutputStream(),true);
            while(true) {
                dos.println("Client A:> "+eingabe.nextLine());
                dos.flush();

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
