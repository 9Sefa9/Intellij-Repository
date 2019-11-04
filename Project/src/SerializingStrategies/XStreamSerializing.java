package SerializingStrategies;
/*
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//BENÖTIGT EXTERNES BIBLIOTHEK!
//Konstruktor:      nicht nötig
//getter/setter:    nicht nötig
//Serializeable     nicht nötig
//Nachträglich gelöscht Attribute führen zu einer Exception. Vorbeugung: transient

public class XStreamSerializing implements SerializableStrategy {

    FileWriter fw = null;
    FileReader fr = null;
    XStream xs = null;
    Object obj;

    @Override
    public void setupWriteableObject() throws IOException {
        try{
            try{
                xs = new XStream(new DomDriver());
                fw = new FileWriter("Path.xml");


            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setupReadableObject() throws IOException {
        try{
            xs = new XStream(new DomDriver());
            fr = new FileReader("Path.xml");
        }
    }

    @Override
    public void writeObject(Object s) throws IOException {
        xs.toXML(s,fw);
    }

    @Override
    public Object readObject() throws IOException, ClassNotFoundException {

        this.obj = (Object) this.xs.fromXML(this.fr);

        return this.obj;
    }

    @Override
    public void closeReadable() {
        try{
            if(this.fr!= null)
                fr.close();

            if(this.xs != null)
                xs.close();
        }catch(Exception e ){
            e.printStackTrace();
        }
    }

    @Override
    public void closeWriteable() {
        try{
            if(this.fw!= null)
                fw.close();

            if(this.xs != null)
                xs.close();
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
}
*/