package SerializingStrategies;

import java.io.*;

public class BinarySerializationWithoutFiles implements Serializable{
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        ByteArrayOutputStream boss = new ByteArrayOutputStream();
        ObjectOutputStream bos2 = new ObjectOutputStream(boss);

        bos2.writeObject(new BinarySerializationWithoutFiles());
        bos2.flush();
        bos2.close();

        byte [] b = boss.toByteArray();
        ObjectInputStream bis2 = new ObjectInputStream(new ByteArrayInputStream(b));


        BinarySerializationWithoutFiles obj = (BinarySerializationWithoutFiles) bis2.readObject();
        System.out.println(obj.toString());
        bis2.close();

    }
    public String toString(){
        return "BinarySerializationWithoutFiles";
    }
}
