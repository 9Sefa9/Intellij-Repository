package Tests;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import static java.net.InetAddress.getByName;

public class DatagramClient {
    public static void main(String[]a){
        new DatagramClient();
    }
    public DatagramClient(){
        try(DatagramSocket socket = new DatagramSocket(3122)){
            //send
            byte[] buffer = new String("Konoyaro!").getBytes();

            InetAddress ia = InetAddress.getByName("localhost");

            DatagramPacket packet = new DatagramPacket(buffer,buffer.length,ia,3121);

            socket.send(packet);

            //receive
            DatagramPacket serverPacket = new DatagramPacket(new byte[1024],1024);
            try{
                socket.receive(serverPacket);
            }catch (IOException e){
                e.printStackTrace();
            }
            byte[] serverBytes = serverPacket.getData();
            int port = serverPacket.getPort();
            InetAddress i = serverPacket.getAddress();
            System.out.println("Server sagt: "+new String(serverBytes)+i+port);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
