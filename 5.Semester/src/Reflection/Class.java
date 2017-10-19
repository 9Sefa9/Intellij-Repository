package Reflection;

import SortStrategies.Mergesort;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class {
    public static void main(String[]args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        java.lang.Class<Mergesort> c1 = Mergesort.class;
        System.out.println(c1) ;
        java.lang.Class<?> c2 = new Mergesort().getClass() ;
        System.out.println(c2);

        for(Constructor<?> i: c2.getConstructors()){
            System.out.println(i);
        }
        System.out.println();
        for(Method i: c2.getMethods()){
            System.out.println(i);
        }

        Constructor<Mergesort> test123 = c1.getConstructor(Comparable[].class);
        Comparable[] a = {3,1,2,5,3,67,7};
        Mergesort sss = test123.newInstance((Object)a);
        sss.printArray();


    }


}
