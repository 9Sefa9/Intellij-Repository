package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    int imax = 50;
    List<Component> comp = new ArrayList<>();
    @Override
    public void request(){
        for(int i = 0; i<=imax; i++){
            Component c = comp.get(i);
            c.request();
        }
    }

}
