package Tests;

public class Hund{


    private String test="Hund";
    public Hund(){

    }


    public String getTest(){
        return this.test;
    }

    public void setTest(String test){
        this.test = test;
    }

    @Override
    public String toString() {
        return this.test;
    }
}
