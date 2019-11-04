package SerializingStrategies;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class XMLSerializing implements SerializableStrategy,Serializable {

    FileOutputStream fos = null;
    FileInputStream fis = null;
    XMLEncoder xmle = null;
    XMLDecoder xmld = null;

    @Override
    public void setupWriteableObject() throws IOException {
        try{
            fos = new FileOutputStream("Path.xml");
            xmle = new XMLEncoder(fos);
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    @Override
    public void setupReadableObject() throws IOException {
        try{
            fis = new FileInputStream("Path.xml");
            xmld = new XMLDecoder(fis);
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    @Override
    public void writeObject(Object s) throws IOException {
        xmle.writeObject(s);
    }

    @Override
    public Object readObject() throws IOException, ClassNotFoundException {

        Object obj = (Object)xmld.readObject();

        return obj;
    }

    @Override
    public void closeReadable() {
        try{
            if(this.fis != null)
                fis.close();
            if(this.xmld != null)
                this.xmld.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void closeWriteable() {
        try{
            if(this.fos != null)
                fos.close();
            if(xmle!=null)
                xmle.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
