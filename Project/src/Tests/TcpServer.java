package Tests;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TcpServer extends Thread{
    private static final Logger LOGGER = Logger.getLogger(TcpServer.class.getName() );
    ServerSocket socket;
    Socket client;

    public static void main(String[] args){
        TcpServer service = new TcpServer();
    }
    public TcpServer(){

        try{
            socket = new ServerSocket(3121);
            LOGGER.log(Level.INFO,"Socket initial on port 3121");
            while(true) {
                LOGGER.log(Level.INFO,"Listening...");
                client = socket.accept();
                LOGGER.log(Level.INFO,client.getRemoteSocketAddress()+" has connected...");
                Thread socketWorker = new Thread(new Worker(client));
                LOGGER.log(Level.INFO,"Start worker for "+client.getRemoteSocketAddress()+" ...");
                socketWorker.start();
            }
        }catch (IOException ex){
            LOGGER.log( Level.SEVERE, ex.toString(), ex );
        }
    }
    @Override
    public void run() {

    }
    private class Worker implements Runnable{
        DataInputStream br=null;
        Socket socket;
        public Worker(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {

            try{

                br = new DataInputStream(this.socket.getInputStream());
                while(true) {
                    try {
                        String tmp = br.readUTF();
                        System.out.println(tmp);
                    }catch (EOFException eof){
                        LOGGER.log(Level.WARNING,"End of File");
                        break;
                    }
                }

            }catch (IOException ex){
                LOGGER.log( Level.SEVERE, ex.toString(), ex );
            }
            /*finally {
                if(br!= null){
                    try {
                        socket.close();
                        br.close();
                    } catch (IOException e) {
                        LOGGER.log( Level.SEVERE, e.toString(), e);
                    }
                }
            }*/
        }
    }
}
