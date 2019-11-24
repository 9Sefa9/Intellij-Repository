<<<<<<< HEAD
package Terraria;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.start();
    }
    private void start(){

            try {
                ServerSocket socket = new ServerSocket(23);
                Socket client = socket.accept();

                System.out.println("BAGLANDI");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }

}
=======
package Terraria;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.start();
    }
    private void start(){

            try {
                ServerSocket socket = new ServerSocket(23);
                Socket client = socket.accept();

                System.out.println("BAGLANDI");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }

}
>>>>>>> d12784ef7f60633b1800e75a56e0c7e08b3d3c5d
