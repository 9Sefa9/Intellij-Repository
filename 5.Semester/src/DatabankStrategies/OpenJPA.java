package DatabankStrategies;

import SerializingStrategies.SerializableStrategy;

import java.io.IOException;

public class OpenJPA implements SerializableStrategy {



    @Override
    public void setupWriteableObject() throws IOException {

    }

    @Override
    public void setupReadableObject() throws IOException {

    }

    @Override
    public void writeObject(Object s) throws IOException {

    }

    @Override
    public Object readObject() throws IOException, ClassNotFoundException {
        return null;
    }

    @Override
    public void closeReadable() {

    }

    @Override
    public void closeWriteable() {

    }
}
