import java.net.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Server extends Thread {
    private ArrayList<Object> clientlist = new ArrayList<Object>();
    private Scanner eingabe = new Scanner(System.in);
    private String msg = null;

    public static void main(String[] args){

        new Server().start();
    }

    public void run() {
        ServerSocket Anschluss;
        try {
            Anschluss = new ServerSocket(8080);

            Socket eavesdropping = Anschluss.accept();
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(eavesdropping.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(eavesdropping.getInputStream()));


            clientlist.add(eavesdropping);
            System.out.println("A Client has Logged in on port: " + eavesdropping.getPort());

            while(!Anschluss.isClosed()) {
                receiveFromClient(reader);
                sendToClient(writer);
            }
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void receiveFromClient(BufferedReader br) {
        try {
            msg = br.readLine();
            System.out.println("" + msg);
            System.out.println("");
            msg = null;
        } catch (IOException i) {
            System.out.println("Reading from a Client not possible...");
            new Server().start();
        }

    }

    public void sendToClient(PrintWriter writer) {
        try {
            writer.println("" + eingabe.nextLine());
            System.out.println("");
            writer.flush();
        } catch (Exception e) {
            System.out.println("sending to client failed...");
        }
    }
}
