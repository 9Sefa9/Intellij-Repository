import java.util.*;
import java.io.*;

public class ByteStream {
    public static void main(String[] a) throws IOException{

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:/Users/Progamer/Desktop/test.txt"));
        byte b[] = new byte[1024];
        int leer;
        while((leer = bis.read())!= -1)
        bis.read();

        for(Byte c: b)
            System.out.println(c);


    }
}
