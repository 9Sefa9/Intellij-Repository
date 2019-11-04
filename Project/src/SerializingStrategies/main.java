package SerializingStrategies;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        SerializableStrategy test = new BinarySerializing();
        test.setupWriteableObject();
        test.writeObject(new TestClass());
        test.closeWriteable();

        test.setupReadableObject();
        System.out.println(test.readObject());
        test.closeReadable();

    }
}
