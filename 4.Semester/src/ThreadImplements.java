
public class ThreadImplements implements Runnable {
/*
    public static void main(String[] args) {
       Thread t = new Thread(new ThreadImplements());
       t.start();
    }
*/
    @Override
    public void run() {
        for(int i = 0;i<=10; i++)
            System.out.println("Thread Implements");
    }

}
