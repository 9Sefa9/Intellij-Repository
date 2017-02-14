package TutorialFolder;

public class Tutorial25ArraysVeränderungen {

	public static void main(String[] args) {
		String[] tierArray = { "Hund", "Katze", "Maus", "Elefant" };

		for (String index : tierArray) {
			System.out.println(index);
		}
		tierArray[0] = "Amaise";			//erklärt sich von selbst ! 
//		tierArray[2] = "Löwer";				//tierArray soll position 0 und 2 amaise und löwer sein.

		for (String index : tierArray) {		//arrays funktionieren mit Strings doubles integers etc.
			System.out.println(index);
		}

	}

}
