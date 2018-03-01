package Tests;

import SortStrategies.Mergesort;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//schwieriges Thema... am besten nochmal wiederholen.
public class Reflection {
    public static void main(String[] a){
        new Reflection();
    }
    public Reflection(){
        Class<?> mergeSortClass = Mergesort.class;
        for(Constructor c : mergeSortClass.getConstructors()){
            System.out.println(c);
        }

        for(Method m : mergeSortClass.getMethods()){
            System.out.println(m);
        }

    }
}
