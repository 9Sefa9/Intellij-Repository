package Algorithms;

public class Main {
    public  static  void  main(String[] args){
        int[] test ={1, 5, 2, 3, 10, 6, 8, 9, 7,4};
        Splitsort s = new Splitsort(test);
        for(Integer i: test){
            System.out.print(i+", ");
        }
        System.out.println();
        s.split();

            for (Integer i : test) {
                System.out.print(i + ", ");
            }

    }
}
