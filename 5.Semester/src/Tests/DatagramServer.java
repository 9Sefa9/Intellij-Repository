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
            while(true) {
                byte[] buffer = new byte[5];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                try {
                    socket.receive(packet);
                }catch (IOException e){
                    e.printStackTrace();
                }

                InetAddress address = packet.getAddress();
                byte[] incomingPacket = packet.getData();
                int port = packet.getPort();

                System.out.println("Client sagt: "+(new String(incomingPacket)));
                DatagramPacket clientPacket = new DatagramPacket("Mugiwara!".getBytes(),"Mugiwara!".getBytes().length,address,port);

                socket.send(clientPacket);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
