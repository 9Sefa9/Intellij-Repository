package Network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    ServerSocket server;
    public void runServer(){
        try {
            server = new ServerSocket(25, 100, InetAddress.getByName("0.0.0.0"));

            Socket s = server.accept();
            try(DataInputStream dis = new DataInputStream(s.getInputStream())){
                System.out.print(dis.readUTF());
            }catch(IOException i){
                i.printStackTrace();
            }
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public static void main(String[] a) throws InterruptedException {
        new ServerTCP().runServer();
    }
}
