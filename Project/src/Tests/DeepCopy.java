package Tests;

import java.io.*;

public class DeepCopy {
    public static void main(String[] args){
        new DeepCopy();
    }

    public DeepCopy(){
        byte[] buffer = null;
        //serialize
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos)){

            oos.writeObject(new Object());
            oos.flush();
            buffer = baos.toByteArray();
        }catch (IOException e){
            e.printStackTrace();
        }
        //deserialize
        try(ByteArrayInputStream baos = new ByteArrayInputStream(buffer);
            ObjectInputStream oos = new ObjectInputStream(baos)){

            Object tmp = (Object) oos.readObject();
        }catch (IOException|ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
