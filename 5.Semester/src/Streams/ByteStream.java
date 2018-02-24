package Streams;

import java.io.*;

public class ByteStream {
    // byte array declared
    private byte[] buf = new byte[848029];

    public static void main(String[] a) throws IOException{
       // new Streams.ByteStream().readFromFile();
        new ByteStream().copyFile("G:/users/Progamer/Desktop/gitbefehle.pdf","G:/users/Progamer/Desktop/aaa.pdf");
    }
    public void copyFile(String from, String to)throws IOException{
        BufferedInputStream bis = new BufferedInputStream((new FileInputStream(from)));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));

        //how much is the byte of the File ?
        int numbytes = bis.available();

        //create array till that byte
        byte[] buffer = new byte[numbytes];

        //store every byte in the buffer(byte array), start at given offset, maximum number of bytes to read.
        bis.read(buffer,0,numbytes);

        bos.write(buffer);
        bos.flush();

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
