package LernPaket;
import java.util.Arrays;

public class BinarySearchAusDemKopf {

	public static void main(String[] args){
		//wichtig: Unsortiert, arbeitet er nicht ! es muss vorher sortiert sein ( egal durch Array.Sort oder durch was anderes
		int a[] = {8,5,18,12,10,15,17,26,25,778,800,832,845,8,957,1000,2,1000346};
		
		Arrays.sort(a);
		for(int i: a){
			System.out.print(i+",");
		}
	
		System.out.println(search(a,2));
	}
	public static int search(int []a, int key){
		int hi = a.length-1;
		int lo = 0;
		while(lo<=hi){
			int mid = lo+(hi-lo)/2;
				 if(key < a[mid]) 		hi = mid-1;
			else if (key > a[mid]) 		lo = mid+1;
			else return mid;		
		}
		return -1;	
	}
}
