package AdapterPatternObject;

import java.awt.Point;
//ADAPTER
public class TextShape implements Shape {
    //Erstellt Adaptee Objekt
    private TextWrite tw;

    public TextShape() {
        tw = new TextWrite(new Point(1,4),new Point(2,2));
    }

    @Override
    public void manipulate() {
        tw.textManipulate();
    }

    @Override
    public String BoundingBox() {
        return "("+tw.getOrigin().x+","+tw.getOrigin().y+","+tw.getExtend().x+","+tw.getExtend().y+")";
    }
}

