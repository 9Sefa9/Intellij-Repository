package Tests;

import java.beans.*;
import java.io.*;

public class XMLSer {
    public static void main(String[] args) throws IntrospectionException {

       BeanInfo test = Introspector.getBeanInfo(Hund.class);
       PropertyDescriptor[] test2 = test.getPropertyDescriptors();

       for(int i = 0 ; i<test2.length;i++){
           PropertyDescriptor test3 = test2[i];
           if(test3.getName().equals("test")){
               test3.setValue("transient",true);
           }
       }
        try(FileOutputStream fos = new FileOutputStream("tmp.xml");
            XMLEncoder oos = new XMLEncoder(fos)){

            oos.writeObject(new Hund());
            oos.flush();
        }catch(IOException e){
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("tmp.xml");
            XMLDecoder ois = new XMLDecoder(fis)){

            Hund tmp = null;

            tmp = (Hund)ois.readObject();

            System.out.println(tmp.getTest());
        }catch (IOException e){

            e.printStackTrace();
        }
    }
}
