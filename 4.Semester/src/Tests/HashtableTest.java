package Tests;
import java.util.Hashtable;
public class HashtableTest {
         public static void main(String[] arg){
            Hashtable<Integer,Integer> test = new Hashtable<>();
            test.put(2,3);
            test.put(1,5);
            test.put(0,4);
            for(int i=0;i<test.size();i++){
                System.out.println(test.get(i));
            }
            test.put(2,6);
             System.out.println();
             for(int i=0;i<test.size();i++){
                 System.out.println(test.get(i));
             }
         }
}
