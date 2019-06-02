package SerializingStrategies;

import java.io.Serializable;

public class TestClass implements Serializable {
    public TestClass(){

    }
    @Override
    public String toString(){
        return "Dies ist eine Test Klasse!";
    }
}
