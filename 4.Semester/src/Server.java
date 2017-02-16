import java.net.*;
import java.lang.*;
import java.io.*;
public class Server {
    private static boolean t = true;
    private static String msg = null;
    public static void main(String[] args) throws IOException{
        ServerSocket anschluss = new ServerSocket(8080);
        while (t) {
            try {
                Socket eavesdropping = anschluss.accept();
                InputStreamReader portreader = new InputStreamReader(eavesdropping.getInputStream());
                BufferedReader input = new BufferedReader(portreader);
                msg = input.readLine();
                System.out.println(":> " + msg);


            }catch(IOException i){
                i.printStackTrace();
            }
    }
    }
}
