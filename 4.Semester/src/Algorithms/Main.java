package Algorithms;

public class Main {
    public  static  void  main(String[] args) throws InterruptedException {
        int[] test ={23, 13, 2, 22, 10, 6, 8, 26, 7,4,30,1,21,19,27,17,5,12,18,15,16,20,3,25,24,9,29,14,28,11};
        int[] test2 = {20,18,50,7, 3, 4, 2, 9, 10, 8, 6, 5, 0, 8, 2, 11, 6, 12, 15, 14, 100, 20, 28, 29, 21, 60, 30, 50, 0, 7, 78,266};
        Splitsort s = new Splitsort(test);
        for(Integer i: test){
            System.out.print(i+", ");
        }
        System.out.println();
        int b = 1;

               s.split();
               for (Integer i : test) {
                   System.out.print(i + ", ");
               }
               System.out.println("Anzahl Schritt: "+(b++));

               Thread.sleep(3000);

    }
}