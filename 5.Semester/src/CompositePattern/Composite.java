package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    int imax = 50;
    List<Component> comp = new ArrayList<>();
    @Override
    public void request(){
        for(Component c: comp)
           c.request();

    }

    @Override
    public void test() {
            System.out.println("test:Composite");
    }

    @Override
    public void add(Component c){
        this.comp.add(c);
    }

}
