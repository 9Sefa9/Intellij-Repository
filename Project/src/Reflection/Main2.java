package Reflection;

import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main2 {
    private static ClassA newClassA;
    public static void main(String[] args){
        //MÖGLICHKEIT 1
        //für test1 darf es keine private konstruktore in ClassA geben.
        Class<ClassA> test1 = ClassA.class;
        System.out.println(test1);
        System.out.println(test1.getConstructors()[0]+"\n\n");

        //MÖGLICHKEIT 2
        //für test2 darf es keine private konstruktore in ClassA geben.
        Class<?> test2 = new ClassA("test").getClass();
        System.out.println(test2);
        System.out.println(test2.getMethods()[0]);
        System.out.println(test2.getConstructors()[0]+"\n\n");

        //MÖGLICHKEIT 3
        //wenn zur laufzeit nicht bekannt ist, wie die Klasse hieß /heißt
        try {
            Class<?> test3 = Class.forName("Reflection.ClassA");
            System.out.println(test3);
            System.out.println(test3.getConstructors()[0]+"\n\n");
        } catch( ClassNotFoundException e ) {
            e.printStackTrace();
        }

        //ERSTELLE EIN NEUES OBJEKT MIT SAMMT KONSTRUKTOR
        //erstelle ein neues Objekt und manipuliere einfach alles!
        try {
            Constructor<?> newConstruct = test1.getConstructor(String.class);
            newClassA = (ClassA) newConstruct.newInstance("ClassX");
            System.out.println(newClassA.getTest());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //ERSTELLE METHODE UND FÜHRE SIE AUS!!
        try {
            Method newMethod = test2.getMethod("getTest");
            newMethod.invoke(newClassA);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
