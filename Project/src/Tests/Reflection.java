package Tests;

import SortStrategies.Mergesort;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//schwieriges Thema... am besten nochmal wiederholen.
public class Reflection {
    private Comparable[] comp={3,1,21,4};
    public static void main(String[] a) throws ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        new Reflection();
    }
    public Reflection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //Konstruktmöglichkeit 1
        Class<?> mergeSortClass = Mergesort.class;
        for(Constructor c : mergeSortClass.getConstructors()){
            System.out.println(c);
        }

        //Konstruktmöglichkeit 2
        for(Method m : mergeSortClass.getMethods()){
            System.out.println(m);
        }

        //Konstruktmöglichkeit 3
        Class<?> loadedPost = Class.forName("SortStrategies.Mergesort");
        for(Method m2 : loadedPost.getMethods())
            System.out.println(",,,,,,,m2"+m2);

        //Objekt erstellung :
        //--> Contructor erstellen mithilfe der vorher definirten Klasse
        //--> mithilfe des Konsturkts instanz erstellen mit instance()
        Constructor<SortStrategies.Mergesort> newi = (Constructor<Mergesort>) mergeSortClass.getConstructor();
        Mergesort m = newi.newInstance();
        m.sort(this.comp);
        m.printArray();
        System.out.println("Just for fun nochmal ausgeben : ");

        //Methode erstellung und ausführung mit invoke
        Method inv = mergeSortClass.getMethod("printArray");
        inv.invoke(m);

    }
}
