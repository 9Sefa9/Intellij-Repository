package OOP;

public class SafeMethod {

	public static void main(String[] args){
		int [] array1  = {2,3,4};
		int [] array2  = {2,3,4};
		for(int i: safeAddition(array1,array2)){
			System.out.print(i);
		}
	}
	
	public static int[] safeAddition(int[] array1, int[] array2){
		int [] array3 = new int[array1.length];
		try{
			
			for(int i=0; i<array1.length; i++){
				array3[i] = (array1[i] + array2[i]);
			}
		}
		catch(NumberFormatException e){
			System.err.print("Fehler !");
			e.printStackTrace();
		}
		return array3;
		
	}
}
