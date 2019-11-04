package Tests;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//bevor du anfängst i.was zu lesen, lies das :
//der Server und Klient haben ihre EIGENE port nummer! es ist nciht wie bei TCP, das man sich auf ein port verbindet.
// beide müssen ihre informationen rausfischen können.
public class DatagramServer {
    public static void main(String[] a){
        new DatagramServer();
    }
    public DatagramServer(){

        try(DatagramSocket socket = new DatagramSocket(3121)){
            //receive
            byte[] buffer = "Konoyaro!".getBytes();
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            socket.receive(packet);
            byte[] data = packet.getData();
            System.out.println(new String(data));

            //send
            byte[] buffer2 = "Konoyaro2!".getBytes();
            InetAddress ia = InetAddress.getByName("localhost");
            int port = 3122;
            DatagramPacket send = new DatagramPacket(buffer2,buffer2.length,ia,port);
            socket.send(send);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
