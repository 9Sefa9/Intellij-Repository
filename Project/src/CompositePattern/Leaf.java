package CompositePattern;


public class Leaf implements Component {

    @Override
    public void request(){
            System.out.println("ich bin ein leaf");
   }
    @Override
    public void test() {
        System.out.println("test:Leaf");
    }
    @Override
    public void add(Component c){

    }

}
