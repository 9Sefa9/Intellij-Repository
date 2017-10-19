package AdapterPatternObject;


public class ObjMainClass {

    public static void main (String[] args) {
        Line l = new Line();
        l.manipulate();
        System.out.println(l.BoundingBox());

        System.out.println("----------");

        TextShape ts = new TextShape();
        ts.manipulate();
        System.out.println(ts.BoundingBox());

    }
}
