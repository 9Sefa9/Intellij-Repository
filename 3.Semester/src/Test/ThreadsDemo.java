package Test;

public class ThreadsDemo {

	static class Zaehlen implements Runnable {

		public void run() {
			
			for(int i = 0; i<20; i++){
				System.out.println("Zählen:  "+i);
			}
		}
		
	}
	
	public static void main(String[] args){
	Thread bla = new Thread(new Zaehlen());

	}
}
