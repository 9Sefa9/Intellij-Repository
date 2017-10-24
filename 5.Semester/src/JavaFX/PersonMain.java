package JavaFX;

//Kapitel: Anonyme Klassen
public class PersonMain{
    String name = "i";
    public static void main(String[] args){
        PersonMain s = new PersonMain();
      s.test();
    }
    public void test(){
        Person o = new Person(){

            @Override
            public void setName(String str){
                name = str;
            }

            @Override
            public String getName(){
                return name;
            }
        };
    }
}

class Person {
    private String name;

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}