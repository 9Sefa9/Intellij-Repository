package HuffmanCodierung;

public class Pair{

    Integer i;
    boolean visited;
    int bit;
    Pair parent;
    String mergedString="";

    //bei fortlaufender tracert.
    public Pair(Integer mergedI,String mergedString){
        this.mergedString = mergedString;
        this.i = mergedI;
        visited = false;
    }

    @Override
    public String toString() {
        return i+"  |  "+mergedString+"  |  "+visited;
    }
}
