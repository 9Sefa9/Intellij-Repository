package Algorithms;

public class Main {
    public  static  void  main(String[] args){
        int[] test ={8, 3, 6, 4, 9, 1, 6, 3, 8, 5};
        Splitsort s = new Splitsort(test);
        for(Integer i: test){
            System.out.print(i+", ");
        }
        System.out.println();
        s.split();
        for(Integer i: test){
            System.out.print(i+", ");
        }
    }
}
