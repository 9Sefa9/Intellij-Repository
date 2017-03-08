import java.util.*;
import java.io.*;

public class ByteStream {
    // byte array declared
    private byte[] buf = new byte[848029];

    public static void main(String[] a) throws IOException{
        new ByteStream().readFromFile();
    }
    public void readFromFile() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:/Users/Progamer/Desktop/Bilder/..jpg"));

        // read number of bytes available
        int numByte = bis.available();
        System.out.println(numByte);

        // read byte into buf , starts at offset 0, buf.length bytes to read
        int read = 0;
        while ((read = bis.read(buf)) != -1)
        bis.read(buf, 0, buf.length);

        // for each byte in buf
        for (byte b : buf) {
            System.out.println((char)b+": " + b);
        }
    }
}
