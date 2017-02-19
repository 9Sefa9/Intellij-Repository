import com.sun.deploy.util.SessionState;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientA{
    public Scanner eingabe = new Scanner(System.in);
    public String msg = null;

    public Socket Anschluss;

    private BufferedReader reader = null;
    private PrintWriter writer = null;

    public static void main(String[] args) {

        new ClientA().run();

    }
    public ClientA() {
        try {
            Anschluss = new Socket("localhost", 8080);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void run(){
    new Send().start();
    new Receive().start();
    }


    public class Send extends Thread {

        public Send() {
            try {
                writer = new PrintWriter(new OutputStreamWriter(Anschluss.getOutputStream()));
            }catch(IOException i){
                System.out.print("send constructor error...");
            }
        }
        public void run() {
            try {
                writer.println("Client A:> " + eingabe.nextLine());
                System.out.println("");
                writer.flush();
            } catch (Exception i) {
                System.out.println("Sending Message to Server failed...");

            }
        }
    }

    public class Receive extends Thread {

        public Receive() {
            try {
                reader = new BufferedReader(new InputStreamReader(Anschluss.getInputStream()));
            }catch(IOException i){
                System.out.print("error while receiving...");
            }
        }
        public void run() {
            try {
                msg = reader.readLine();
                System.out.println("" + msg);
                System.out.println("");
                msg = null;
            } catch (IOException i) {
                System.out.println("Receiving Message from Server failed...");
            }
        }
    }


}
