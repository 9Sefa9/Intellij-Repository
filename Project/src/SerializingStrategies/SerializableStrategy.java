package SerializingStrategies;

import java.io.IOException;

public interface SerializableStrategy<T> {


    /*
      Setup Serializing the Playlist
     */
    void setupWriteableObject() throws IOException;

    /*
      Setup Deserializing the Playlist
     */
    void setupReadableObject() throws IOException;

    /*
      Write a song
     */
    void writeObject(T s) throws IOException;

    /*
     Read a song
     */
    T readObject() throws IOException, ClassNotFoundException;

    /*
     Finish writing/reading by closing all Streams
     */
    void closeReadable();

    void closeWriteable();

}
