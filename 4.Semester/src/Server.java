import java.net.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Server extends Thread {
    private ArrayList<Object> clientlist = new ArrayList<Object>();
    private String msg = null;

    public static void main(String[] args) throws IOException {
            new Server().start();
    }

    public void run() {
        ServerSocket anschluss = null;

            try {
                anschluss = new ServerSocket(8080);

                Socket eavesdropping = anschluss.accept();

                clientlist.add(eavesdropping);

                InputStreamReader portreader = new InputStreamReader(eavesdropping.getInputStream());
                BufferedReader input = new BufferedReader(portreader);


                while(true) {

                    msg = input.readLine();
                    System.out.println("" + msg);
                    System.out.println("");
                }
            } catch (IOException i) {
                i.printStackTrace();
        }
    }
}
