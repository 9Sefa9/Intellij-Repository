package TutorialFolder;

public class Tutorial24EnhancedArray {

	public static void main(String[] args) {
		int array1[] = {0,1,2,3,4,5,6,7,8,9};
		int array2[] = {0,2,4,6,8,9,6,7,8,9};

		for (int i = 0; i < array1.length; ++i)  // i = 0 ist die 0.te Array1 position !!!
		System.out.println(array1[i]);	//wir möchten die I-te position ausgeben also array1[i]
									// bei eingabe NUR von i, nimmt er die anzahl der arrays nur wahr. 
		  //bsp: 0  1   2   3   4   5   6   7   8 	--> nur i
		  //     01 12  23  34  45  56  67  78  89	--> array1[i] die i-te position vom array!
//_____________________________________________________________________________________________________
		//enhanced-for-Loop schleife:	
		
		 
		//Diese sind sehr nützlich, wenn man einen Forloop hat, 
		//in dem man alle Inhalte des Arrays der Reihe nach verwenden möchte.
		
		for(int durchlauf:array2)
		System.out.println(array2[durchlauf]);
		
		}
			
	/* Der Platzhalter ist also eine Variable die 
	 * mit jedem Durchlauf der Variable der Position 
	 * in unserem Array entspricht. 
	 * Da es sich um eine Schleife handelt, 
	 * entspricht dies beim nächsten Durchlauf der nächste Position in unserem Array.
    */
		

}

