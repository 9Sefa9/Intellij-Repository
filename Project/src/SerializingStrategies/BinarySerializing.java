package SerializingStrategies;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
//Konstruktor:      nicht nötig
//getter/setter:    nicht nötig
//Serializeable:    nötig
//Identifikation:   public static final int serialVersionUID
//
public class BinarySerializing<T> implements SerializableStrategy,Serializable{

   private static final long serialVersionUID = 232323L;

    ObjectOutputStream oos;
    ObjectInputStream ois;
    FileInputStream fis;
    FileOutputStream fos;

    @Override
    public void setupWriteableObject() throws IOException {
        try{
            fos = new FileOutputStream("C:/Users/Sefa/Desktop/test.txt");
            oos = new ObjectOutputStream(fos);
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    @Override
    public void setupReadableObject() throws IOException {
        try{
            fis = new FileInputStream("C:/Users/Sefa/Desktop/test.txt");
            ois = new ObjectInputStream(fis);
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    @Override
    public void writeObject(Object s) throws IOException {
        oos.writeObject(s);
    }


    @Override
    public T readObject() throws IOException, ClassNotFoundException {
        T obj = null;
        obj = (T)ois.readObject();
        return obj;
    }

    @Override
    public void closeReadable() {
        try{
            fis.close();
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void closeWriteable() {
        try{
            fos.close();
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
