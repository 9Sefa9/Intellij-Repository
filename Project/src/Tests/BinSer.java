package Tests;

import java.io.*;

public class BinSer {
    public static void main(String[] args){
        try(FileOutputStream fos = new FileOutputStream("tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(new Hund());
            oos.flush();
        }catch(IOException e){
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("tmp");
        ObjectInputStream ois = new ObjectInputStream(fis)){

            Hund tmp = null;

            tmp = (Hund)ois.readObject();

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
