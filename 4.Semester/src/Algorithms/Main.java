package Algorithms;

public class Main {
    public  static  void  main(String[] args) throws InterruptedException {
        int[] test ={23, 13, 2, 22, 10, 6, 8, 26, 7,4,30,1,21,19,27,17,5,12,18,15,16,20,3,25,24,9,29,14,28,11};
        Splitsort s = new Splitsort(test);
        for(Integer i: test){
            System.out.print(i+", ");
        }
        System.out.println();
        int b = 1;
        while (true) {

               s.alternateSplitSort();
               for (Integer i : test) {
                   System.out.print(i + ", ");
               }
               System.out.println("Anzahl Schritt: "+(b++));

               Thread.sleep(3000);
           }
    }
}
