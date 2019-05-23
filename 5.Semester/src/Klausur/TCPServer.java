package Klausur;

import Tests.Hund;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket cat = new ServerSocket(3121);
        Socket dog = cat.accept();
        InputStream hund = dog.getInputStream();
        int number = hund.read();
        System.out.println(number);
    }
}
