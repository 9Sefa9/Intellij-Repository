package Tests;

public class StackWaitNotifyMain {
    public static void main(String[] ar){
        Stack swn = new Stack();
        Putter p1 = new Putter(swn);
        Putter p2 = new Putter(swn);
        Putter p3 = new Putter(swn);
        Putter p4 = new Putter(swn);
        Remover r1 = new Remover(swn);

        p2.start();
        p3.start();
        p4.start();
        p1.start();
        r1.start();

    }
}
