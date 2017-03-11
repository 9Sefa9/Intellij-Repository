import java.io.*;
import java.net.*;
public class Server {

    private int port;
    private String host;

    private ServerSocket serverSock;
    public static void main(String[] args){
        Server start = new Server(23,"localhost");
        start.waitForConnection();
    }
    public Server(int port, String host){
        this.port=port;
        this.host=host;
    }
    public void waitForConnection(){
        Socket sock = null;
        InputStream sockInput = null;
        OutputStream sockOutput = null;
        while (true) {
            try {
                // This method call, accept(), blocks and waits
                // (forever if necessary) until some other program
                // opens a socket connection to our server.  When some
                // other program opens a connection to our server,
                // accept() creates a new socket to represent that
                // connection and returns.
                sock = serverSock.accept();
                System.err.println("Have accepted new socket.");

                // From this point on, no new socket connections can be made to our server until we call accept() again.

                sockInput = sock.getInputStream();
                sockOutput = sock.getOutputStream();
            }
            catch (IOException e){
                e.printStackTrace(System.err);
            }

            // Do something with the socket - read bytes from the
            // socket and write them back to the socket until the
            // other side closes the connection.
            handleConnection(sockInput, sockOutput);
            try {
                System.err.println("Closing socket.");
                sock.close();
            }
            catch (Exception e){
                System.err.println("Exception while closing socket.");
                e.printStackTrace(System.err);
            }

            System.err.println("Finished with socket, waiting for next connection.");
        }
    }
    public void handleConnection(InputStream sockInput, OutputStream sockOutput) {
        while(true) {
            byte[] buf=new byte[1024];
            int bytes_read = 0;
            try {
                // This call to read() will wait forever, until the
                // program on the other side either sends some data,
                // or closes the socket.
                bytes_read = sockInput.read(buf, 0, buf.length);

                // If the socket is closed, sockInput.read() will return -1.
                if(bytes_read < 0) {
                    System.err.println("Tried to read from socket, read() returned < 0,  Closing socket.");
                    return;
                }
                System.err.println("Received "+bytes_read
                        +" bytes, sending them back to client, data="
                        +(new String(buf, 0, bytes_read)));
                sockOutput.write(buf, 0, bytes_read);
                // This call to flush() is optional - we're saying go
                // ahead and send the data now instead of buffering
                // it.
                sockOutput.flush();
                // sockOutput.close();

            }
            catch (Exception e){
                System.err.println("Exception reading from/writing to socket, e="+e);
                e.printStackTrace(System.err);
                return;
            }

        }

    }
}
