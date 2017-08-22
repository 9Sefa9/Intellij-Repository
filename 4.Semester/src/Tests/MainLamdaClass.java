package Tests;

public class MainLamdaClass {
    public static void main (String[] args){
        AnInterface test = (x,y)-> x+y;
        System.out.println(test.addition(2,3));

        LamdaExpression test2 = new LamdaExpression();
       test2.lamda2((x,y)->x*y);
    }
}
