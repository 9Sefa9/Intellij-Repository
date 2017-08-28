package Network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientTCP {
    Socket socket;
    public void runClient(){
        try{
            socket = new Socket("213.202.229.142",25);

            try(DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
            dos.writeUTF("i");
            }catch (IOException i){
                i.printStackTrace();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] a) throws InterruptedException {
        new ClientTCP().runClient();
    }
}
