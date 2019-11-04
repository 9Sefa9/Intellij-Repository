package Network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {


    public void runClient(){
        try(DatagramSocket socket= new DatagramSocket(40000)){
            InetAddress addresse = InetAddress.getByName("localhost");
            String hi = "hi";
            DatagramPacket packet = new DatagramPacket(new byte[hi.getBytes().length],hi.getBytes().length,addresse,40000);

            socket.send(packet);
            //auf antwort warten:
            packet = new DatagramPacket(new byte[1024],1024);
            socket.receive(packet);
            System.out.println(new String(packet.getData()));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] a) throws InterruptedException {
        new ClientUDP().runClient();
    }
}
