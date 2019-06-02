package SerializingStrategies;

public interface Saveable {
    public void write(String path,Object msg);
    public Object read(String path);
    public void clos();
}
