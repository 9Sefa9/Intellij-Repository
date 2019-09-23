package Tests;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer extends Thread{
    ServerSocket socket;
    Socket client;
    public static void main(String[] args){
            new TcpServer();
    }
    public TcpServer(){

        try{

            socket = new ServerSocket(3121);
            client = socket.accept();
            start();
        }catch (IOException i){
            i.printStackTrace();
        }
    }
    @Override
    public void run() {
        DataInputStream br=null;
        try{
            System.out.println("process");
                br = new DataInputStream(this.client.getInputStream());

                String tmp = br.readUTF();
               System.out.println(tmp);


        }catch (IOException i){
            i.printStackTrace();
        }finally {
            try{
                if(br!=null)
                    br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
