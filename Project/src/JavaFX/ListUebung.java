package JavaFX;

import java.util.List;
import java.util.ArrayList;

public class ListUebung {
    public static void main(String[] args){
        //mutlidimensionale Array / Nested ArrayList
        List<ArrayList<Integer>> ls= new ArrayList<ArrayList<Integer>>();

        //eindimensional / normal ArrayList
        ArrayList<String> al = new ArrayList<String>();
        al.add("zero eintrag");
        al.add("first eintrag");

         System.out.println(al.get(0));
        System.out.println(al.size());
        al.set(0,"Rahel");
        
    }
}
