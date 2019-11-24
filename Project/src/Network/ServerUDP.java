package Network;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//Schritte:
/*
1. DatagramSocket objeckt erstellen mit port
2. datagram Packet erstellen mit byte und dessen länge
3. receive wartet auf eingehende Pakete
4. Daten Auslesen mit InetAdress
 */
public class ServerUDP {
    DatagramSocket server;
    DatagramPacket packet;
    public void runServer(){
        try{
            server = new DatagramSocket(60000);
            packet = new DatagramPacket(new byte[10],10);

            //empfange Packet:
            server.receive(packet);
            String s = new String(packet.getData());
            System.out.println("Client sagt: "+s);

            //filtere information aus dem Packet:
            InetAddress add = packet.getAddress();
            int pb = packet.getPort();

            //sende packet zurück:
            String zurück = "thats baad!!";
            packet = new DatagramPacket(new byte[zurück.getBytes().length],zurück.getBytes().length,add,pb);
            server.send(packet);

        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public static void main(String[] a) throws InterruptedException {
        new ServerUDP().runServer();
    }
}
