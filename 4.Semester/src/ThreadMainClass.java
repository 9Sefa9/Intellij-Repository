/**
 * Created by Progamer on 18.03.2017.
 */
public class ThreadMainClass {
    public static void main(String[] ar) {

        Thread t = new Thread(new ThreadImplements());
        t.start();

        Thread te = new Thread(new ThreadExtends());
        te.start();


    }
}
