package Streams;

import java.io.*;
import java.util.ArrayList;

public class ByteStream implements Serializable {

    private ArrayList<String> test = new ArrayList<>();

    public static void main(String[] a) throws IOException{
       // new Streams.ByteStream().readFromFile();
        System.out.println(new ByteStream().deepCopySerializing().toString());
        System.out.println(new ByteStream().deepCopyFile().toString());
    }
    public ByteStream deepCopySerializing(){
        byte[] byteArray = null;
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos)){

            //serialize
            oos.writeObject(new ByteStream());
            oos.flush();

            System.out.println("Write done.");

        }catch(IOException e){
            e.printStackTrace();
        }

            //deserialize
            Object temp = null;
        try(ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
            ObjectInputStream ois = new ObjectInputStream(bais)){
            temp =(ByteStream)ois.readObject();
            System.out.println("Read done.");
            return (ByteStream) temp;
        }catch (ClassNotFoundException|IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    public ArrayList<String> deepCopy(){
      ArrayList<String> copy = new ArrayList<>();
      for(int i = 0; i<test.size();i++){
          copy.add(test.get(i));
      }
      return copy;

    }
    public void shallowCopy(){
        ArrayList<String> fake = new ArrayList<>();
        this.test = fake;
    }
    public ByteStream deepCopyFile(){
        try(FileOutputStream fos = new FileOutputStream("tmpObj");
        ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(new ByteStream());
            oos.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
        try(FileInputStream fis = new FileInputStream("tmpObj");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Object newObj = null;
            newObj = (ByteStream) ois.readObject();
            return (ByteStream)newObj;
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public String toString() {
        return "JESS";
    }
}
