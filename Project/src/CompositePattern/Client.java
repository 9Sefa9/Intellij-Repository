package CompositePattern;

public class Client {
    public static void main(String[] args){
        Leaf l1 = new Leaf();
        Leaf l2 = new Leaf();
        Leaf l3 = new Leaf();

        Composite c1 = new Composite();

        c1.add(l1);
        c1.add(l2);
        c1.add(l3);

        c1.request();
        c1.test();
        System.out.println();
        //Eigentlich ist es so:
        Component comp1 = new Composite();
        comp1.add(l1);
        comp1.request();

        // im grunde ist es das Hinzufügen von kindern aus dem Interface zu einer Sammlung(Composite)
        //der Composite hat die nötigen implementierungen.
    }
}
