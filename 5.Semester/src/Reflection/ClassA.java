package Reflection;
//private konstruktor wird nicht erkannt(siehe test2)
public class ClassA {

    private String test;
    public ClassA(String test){
        this.test = test;
    }


    public String getTest(){
        return this.test;
    }
    public void setTest(String test){
        this.test = test;
    }


    @Override
    public String toString() {
        return "class A";
    }
}
