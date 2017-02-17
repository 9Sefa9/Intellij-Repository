import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientA extends Thread {
    public Scanner eingabe = new Scanner(System.in);
    public String msg = null;

    public static void main(String[] a) {
        new ClientA().start();
    }

    public void run() {
        try {
            Socket Anschluss = new Socket("localhost", 8080);
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(Anschluss.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(Anschluss.getInputStream()));


            sendMsgToServer(writer);
            receiveMsgFromServer(reader);


        } catch (Exception e) {
            System.out.println("Error in run(); method...");
            e.printStackTrace();
        }
    }

    //sendet die eingabe an den Server
    public void sendMsgToServer(PrintWriter writer) {
        try {
            writer.println("Client A:> " + eingabe.nextLine());
            System.out.println("");
            writer.flush();
        } catch (Exception i) {
            System.out.println("Sending Message to Server failed...");

        }
    }

    //empfängt msg aus dem Server
    public void receiveMsgFromServer(BufferedReader br) {
        try {
            msg = br.readLine();
            System.out.println("" + msg);
            System.out.println("");
            msg = null;
        } catch (IOException i) {
            System.out.println("Receiving Message from Server failed...");
        }
    }

}
