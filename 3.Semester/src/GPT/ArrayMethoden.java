package GPT;
public class ArrayMethoden{
	public static void main(String[] args){
	if(args.length != 0){
	//create an integer array which saves the digits from args
	int[] digits = new int[args.length];
	
	//deep copy from args to digits Array
	for(int i = 0; i<=args.length-1; i++){		
		digits[i] = Integer.parseInt(args[i]);
	}	
	//print(digits);
    sort(digits);
	System.out.println(digits[0]);
	
	}else {
			int[] empty = new int[0];
	}
	
  }
  public static void print(int[]array){
	  for(int i : array)
		System.out.print(i+", ");   
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
