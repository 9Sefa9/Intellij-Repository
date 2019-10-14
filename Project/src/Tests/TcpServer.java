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
        TcpServer service = new TcpServer();
    }
    public TcpServer(){

        try{
            socket = new ServerSocket(3121);
            while(true) {

                client = socket.accept();
                this.start();
            }
        }catch (IOException i){
            i.printStackTrace();
        }
    }
    @Override
    public void run() {
        DataInputStream br=null;
        try{

                br = new DataInputStream(this.client.getInputStream());
                while(true) {
                    if(br.available()>0) {
                        String tmp = br.readUTF();
                        System.out.println(tmp);
                    }
                }


        }catch (IOException i){
            i.printStackTrace();
        }finally {
            if(br!= null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
