package AdapterPatternObject;

import java.awt.*;
//ADAPTEE

public class TextWrite {

    private Point origin;
    private Point extend;

    public TextWrite(Point origin, Point extend) {
        this.origin = origin;
        this.extend = extend;
    }

    public void textManipulate() {
        System.out.println("TextWrite manipuliert");
    }

    public Point getOrigin() {
        return origin;
    }

    public Point getExtend() {
        return extend;
    }
}
