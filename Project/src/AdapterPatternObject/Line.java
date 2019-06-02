package AdapterPatternObject;


public class Line implements Shape {

    private int[] boundingBox = {1,1,3,2};

    @Override
    public void manipulate() {
        System.out.println("Linie manipuliert");
    }

    @Override
    public String BoundingBox() {
        return "("+boundingBox[0]+","+boundingBox[1]+","+boundingBox[2]+","+boundingBox[3]+")";
    }
}
