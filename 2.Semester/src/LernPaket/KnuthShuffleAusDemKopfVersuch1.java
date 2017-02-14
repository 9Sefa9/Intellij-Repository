package LernPaket;
import java.text.StringCharacterIterator;
import  java.util.Random;
public class KnuthShuffleAusDemKopfVersuch1 {
public void shuffle(Object[]a){
	int hi = a.length;
	Random random = new Random();
	for(int i=0; i<hi; i++){
	
		int r = random.nextInt(i+1);
		exchange(a, i,r);
		
	}
}
	public void exchange(Object[]a, int i, int j){
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	public static void main(String[] a){
		KnuthShuffleAusDemKopfVersuch1 objekt = new KnuthShuffleAusDemKopfVersuch1();
		Comparable[] array = {3,1,2,1,3};
		objekt.shuffle(array);
		 for(Object ab: array){
			 System.out.print(ab);
		 }
	}

}
