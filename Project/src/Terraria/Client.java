<<<<<<< HEAD
package Terraria;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        new Client().start();
    }
    private void start(){
        try {
            Socket server = new Socket("localhost", 23);
            try(DataOutputStream dos = new DataOutputStream(server.getOutputStream())){
                dos.writeUTF("aköööf");
            }catch (IOException i){
                i.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        }
}
=======
package Terraria;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        new Client().start();
    }
    private void start(){
        try {
            Socket server = new Socket("localhost", 23);
            try(DataOutputStream dos = new DataOutputStream(server.getOutputStream())){
                dos.writeUTF("aköööf");
            }catch (IOException i){
                i.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        }
}
>>>>>>> d12784ef7f60633b1800e75a56e0c7e08b3d3c5d
