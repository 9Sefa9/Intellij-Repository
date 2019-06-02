package WaitNotify;

import java.util.ArrayList;

public class Main {
    public static void main(String[]s){
        ArrayList<String> nameList = new ArrayList<>();
        ClassA arbeitgeber = new ClassA(nameList);
        ClassB arbeiter = new ClassB(nameList);

        arbeitgeber.start();
        arbeiter.start();
        arbeiter.start();
        arbeiter.start();
        arbeiter.start();
    }
}
