package SerializingStrategies;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class XMLSerializing implements Saveable,Serializable {
    @Override
    public void write(String path, Object msg) {
        try(XMLEncoder xml = new XMLEncoder(new FileOutputStream(path))){
            xml.writeObject(msg);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public Object read(String path) {
        Object o = null;
       try(XMLDecoder xml = new XMLDecoder(new FileInputStream(path))){
        o = (Object)xml.readObject();
        }catch(IOException e){
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public void close() {

    }
}
