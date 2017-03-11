import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    private String serverHostname = null;
    private int serverPort = 0;
    private byte[] data = null;
    private Socket sock = null;
    private InputStream sockInput = null;
    private OutputStream sockOutput = null;

    public Client(String serverHostname, int serverPort, byte[] data) {
        this.serverHostname = serverHostname;
        this.serverPort = serverPort;
        this.data = data;
    }

    public void sendSomeMessages(int iterations) {
        System.err.println("Opening connection to " + serverHostname + " port " + serverPort);
        try {
            sock = new Socket(serverHostname, serverPort);
            sockInput = sock.getInputStream();
            sockOutput = sock.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            return;
        }

        System.err.println("About to start reading/writing to/from socket.");

        byte[] buf = new byte[data.length];
        int bytesread = 0;
        for (int loopi = 1; loopi <= iterations; loopi++) {
            try {
                sockOutput.write(data, 0, data.length);
                bytesread = sockInput.read(buf, 0, buf.length);
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
            if (bytesread < data.length) {
                System.err.println("run: Sent " + data.length + " bytes, server should have sent them back, read " + bytesread + " bytes, not the same number of bytes.");
            } else {
                System.err.println("Sent " + bytesread + " bytes to server and received them back again, msg = " + (new String(data)));
            }

            // Sleep for a bit so the action doesn't happen to fast - this is purely for reasons of demonstration, and not required technically.
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
            ;
        }
        System.err.println("Done reading/writing to/from socket, closing socket.");

        try {
            sock.close();
        } catch (IOException e) {
            System.err.println("Exception closing socket.");
            e.printStackTrace(System.err);
        }
        System.err.println("Exiting.");
    }
}