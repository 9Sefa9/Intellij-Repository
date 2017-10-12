package RaspberryPi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Socket client;
    ServerSocket server;
    public final int SERVERID = 2;
    public static void main(String[] args) throws IOException {
        //192.168.178.75
        InetAddress address = InetAddress.getByName("localhost");
        Server r = new Server();
        r.server = new ServerSocket(8080,0,address);
        r.client = r.server.accept();
        try(DataOutputStream dis = new DataOutputStream(r.client.getOutputStream())){
            dis.writeInt(r.SERVERID);
            System.out.println("Sending: "+r.SERVERID);
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
