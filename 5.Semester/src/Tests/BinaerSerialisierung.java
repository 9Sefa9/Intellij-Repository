package Tests;

import java.beans.Expression;
import java.beans.XMLEncoder;
import java.io.*;

public class BinaerSerialisierung implements Serializable {

    public static final long serialVersionUID = 2348763240L;

    public  BinaerSerialisierung(){

    }
    public static void main(String[]a){
     BinaerSerialisierung test = new BinaerSerialisierung();
        test.xmlstreammitbean("C:/Users/Sefa/Desktop/hakan.txt");
    }
    public void serialisiere(String path){

        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(path));

            oos.writeObject("biseyler at, gucken ob das klappt");
            
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(oos != null){
                    oos.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void deserialisiere(String path){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void xmlstreammitbean(String path){
        try(FileOutputStream fis = new FileOutputStream(path);
            XMLEncoder encoder = new XMLEncoder(fis)){

            encoder.writeObject("hi");
            encoder.setOwner("Hakaaan");
            System.out.println(encoder.getOwner());

            encoder.flush();

        }catch(IOException i){
            i.printStackTrace();
        }
    }
    public void xstream(){
       // try(XStream xStream = new XStream(new DomDriver())){

     //   }
    }
}
