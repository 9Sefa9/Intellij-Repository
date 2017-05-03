package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Server extends Thread {
    Socket socket;
    ServerSocket server;
    Scanner eingabe = null;

    static Thread t1,t2;
    String typingmsg,incomingmsg;


    public Server(int port) throws Exception {
        server = new ServerSocket(port);
    }

    public static void main(String[] args) {
        try {
            Server server = new Server(8080);
            server.start();

            t1 = new Thread(new Server(8080));
            t1.start();

            t2 = new Thread(new Server(8080));
            t2.start();

        } catch (Exception e) {
            System.out.println("Waiting to connect1...");
        }
    }
    public void start() {
        try {
            eingabe = new Scanner(System.in);
        while (true) {

                socket = server.accept();
                System.out.println("verbunden");

               // if (socket.isConnected()) {
                    handleConnection(socket);

               // }
        }
        } catch (Exception e) {
            System.out.println("Waiting to connect2...");
        }
    }

    public void handleConnection(Socket socket) {
        BufferedReader ReadFromSocket = null;

        try {
            while (true) {
                ReadFromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                incomingmsg = ReadFromSocket.readLine();
                System.out.println(incomingmsg);

                if(socket.isClosed()) {
                    System.out.println("Client hat sich ausgeloggt...");
                    this.socket = null;
                    incomingmsg = null;
                    break;
                }
            }
        } catch (IOException i) {
            System.out.println("Waiting to connect3...");

        }
    }

    @Override
    public void run() {
        PrintWriter WriteToSocket = null;
        try {
            while(true) {
                WriteToSocket = new PrintWriter(socket.getOutputStream(), true);
                while ((typingmsg = eingabe.nextLine()) != "end") {
                    WriteToSocket.println(typingmsg + "\n");
                    WriteToSocket.flush();
                }
            }
        } catch (IOException i) {
        System.out.print("Thread Problem4");
        }
    }
}

