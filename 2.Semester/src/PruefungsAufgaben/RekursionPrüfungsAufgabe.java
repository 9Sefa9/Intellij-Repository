package PrüfungsAufgaben;
public class RekursionPrüfungsAufgabe{
	public static void main(String[] args){
	int[] array ={3,1,5,4};
	printRec(array,0);
	}
	public static void printRec(int[] array,int j){
		int i = array.length-1;
		//3>3
		if(j>i){
			return;
		}
		else{
			
			printRec(array,j+1);
			System.out.println(array[j]);
		}
	}
}

/*
			printRec(array,3+1);
			printRec(array,2+1);
			printRec(array,1+1);
			printRec(array,0+1);
			System.out.println(array[j]);
			System.out.println(array[j]);
			System.out.println(array[j]);
			System.out.println(array[j]);



*/