package Klausur;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",3121);
        OutputStream is = socket.getOutputStream();
        is.write(50);
    }
}
