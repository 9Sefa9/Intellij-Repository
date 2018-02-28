package Tests;

import java.beans.*;
import java.io.*;

public class XMLSer {
    public static void main(String[] args) throws IntrospectionException {

        BeanInfo info = Introspector.getBeanInfo(Hund.class);
        PropertyDescriptor []descriptor = info.getPropertyDescriptors();

        for(PropertyDescriptor i : descriptor){
            if(i.getName().equals("test"))
                i.setValue("transient",true);
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
