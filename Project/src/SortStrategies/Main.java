package SortStrategies;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Sortable sortable = new Midsort();
		Comparable[] comp = new Comparable[5000];
		Random random = new Random();
		System.out.println("START");
		for(int i = 0; i<comp.length; i++){
			//System.out.println(i);
			comp[i] = random.nextInt(10)*10;
		}
		long time = System.currentTimeMillis();
		System.out.println("SORT\n\n\n\n");
		sortable.sort(comp);
		System.out.println("SORT DONE!");
		long finalTime = (System.currentTimeMillis()-time);
		System.out.println("benötigte Zeit: "+(finalTime)); 
		for(int i = 0 ; i<comp.length; i++){
			//System.out.println("SORTED:" +comp[i]);
		}
		
	}

}
