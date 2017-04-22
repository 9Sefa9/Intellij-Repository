package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    Socket socket;
    String typingmsg, comingmsg;
    static Client client;

    static Thread t1 = null;

    public Client(String host, int port) {
        try {
            socket = new Socket(host, port);
        } catch (Exception e) {
            System.out.println("fehler");
        }
    }

    public static void main(String[] args) throws Exception {

        client = new Client("localhost", 8080);
        client.connectToServer();
        t1 = new Client("localhost", 8080);
        t1.start();
    }

    public void connectToServer() {
        PrintStream writetoserver = null;
        Scanner eingabe;

        try {

            eingabe = new Scanner(System.in);
            writetoserver = new PrintStream(socket.getOutputStream(), true);

            System.out.println("Connected successfully...");

            while ((typingmsg = eingabe.nextLine()) != "end") {
                writetoserver.println(typingmsg + "\n");
                writetoserver.flush();
            }
            if (typingmsg.equals("end"))
                System.out.println("Das programm wird beendet!");

        } catch (Exception e) {
            System.out.println("Unknown Host...");
            e.printStackTrace();
        } finally {
            if (socket != null)
                try {
                    socket.close();
                    System.out.println("Socket geschlossen...");
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Override
    public void run() {
        BufferedReader readfromserver = null;
        try {
            while (true) {
                readfromserver = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                comingmsg = readfromserver.readLine();
                System.out.println(comingmsg);
            }

        } catch (IOException o) {
            System.out.println("thread error");
        }
    }
}

