package Streams;

import java.io.*;
public class StreamUebung{
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("C:/"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/"));
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new FileWriter("C:/"));
            FileWriter fw = new FileWriter("C:/");
            FileReader fr =new FileReader("C:/")){
            File f = new File("C:/");

            //BufferedReader (Aus Datei lesen)
            br.read();
            br.readLine();

            //BufferedWriter
            bw.write("");
            bw.flush();
            bw.close();

            //BufferedReader(System.in)
            read.readLine();
            read.read();
            read.close();

            //PrintWriter
            pw.close();
            pw.flush();
            pw.write("");
            pw.print("");

            //FileReader
            fr.read();
            fr.close();

            //FileWriter
            fw.flush();
            fw.close();
            fw.write("");

            //File
            f.createNewFile();
            f.delete();
            f.exists();         //->boolean
            f.getAbsolutePath();
            f.isDirectory();  //-->boolean
            f.isAbsolute();   // -> boolean
            f.mkdir(); // -> boolean

        }catch(IOException i){
            i.printStackTrace();
        }
    }

}
