package Algorithmen;

public class Bubblesort {

	public static void main(String[] args){
		int [] array = {1,8,2,10,7,5};
		sort(array);
		for(int b : array){
			System.out.print(b);
		}
	}
	
	public static void sort(int[] a){
		boolean done;
		do{
		done = true;
		for(int i=1; i<a.length; i++){
			if(a[i-1] > a[i]){
				int temp = a[i-1];
				a[i-1] = a[i];
				a[i] = temp;
				done = false;
			}
		}
			
		}
		while(!done);
	}
}
