package SerializingStrategies;

import java.io.*;

public class BinarySerializing implements Saveable,Serializable{


    private static final long serialVersionUID = 34128347L;
    @Override
    public void write(String path,Object msg) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

            oos.writeObject(msg);
            oos.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object read(String path) {
        Object o = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            o = (Object)ois.readObject();
        }catch (IOException | ClassNotFoundException i){
            i.printStackTrace();
        }
        return o;
    }

    @Override
    public void close() {
        //Closen der Streams.
    }
}
