package RaspberryPi;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Socket client;
    ServerSocket server;
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName("192.168.178.75");
        Server r = new Server();
        r.server = new ServerSocket(80,0,address);
        r.client = r.server.accept();
        try(DataInputStream dis = new DataInputStream(r.client.getInputStream())){
            System.out.println(dis.readUTF());
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
