package Klausur;

import java.io.IOException;
import java.net.*;

public class DatagramAufgabe {
    public static void main(String[]a) throws IOException {
        InetAddress ia = InetAddress.getByName("localhost");
        DatagramSocket dog = new DatagramSocket(5556);

        String command = "Hello";
        byte [] buffer = new byte[5];
        buffer = command.getBytes();
        DatagramPacket  cat = new DatagramPacket(buffer, buffer.length,ia,6669);
        dog.send(cat);
    }
}
