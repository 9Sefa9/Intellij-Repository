<<<<<<< HEAD
package Algorithms;
import SortStrategies.*;

public class OneMillionArray {
    public static void main(String[] a){
        Comparable[] mil = new Comparable[100];
        for(int i = 0; i<mil.length;i++){
            mil[i] = mil.length-i;
        }
        Sortable s= new Insertionsort();
        long past = System.currentTimeMillis();
       // s.sort(mil);
        long present = (System.currentTimeMillis() - past) / 1000;
        System.out.println("Es hat: "+present+" sekunden gedauert um eine Liste mit der länge "+mil.length+" zu sortieren!");
        System.out.println();
      //  for(Comparable t:mil){
       //     System.out.println(t);
      //  }
    }

}
=======
package Algorithms;
import SortStrategies.*;

public class OneMillionArray {
    public static void main(String[] a){
        Comparable[] mil = new Comparable[100];
        for(int i = 0; i<mil.length;i++){
            mil[i] = mil.length-i;
        }
        Sortable s= new Insertionsort();
        long past = System.currentTimeMillis();
       // s.sort(mil);
        long present = (System.currentTimeMillis() - past) / 1000;
        System.out.println("Es hat: "+present+" sekunden gedauert um eine Liste mit der länge "+mil.length+" zu sortieren!");
        System.out.println();
      //  for(Comparable t:mil){
       //     System.out.println(t);
      //  }
    }

}
>>>>>>> d12784ef7f60633b1800e75a56e0c7e08b3d3c5d
