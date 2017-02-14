package TutorialFolder;

public class TestArrayErfolgreichVerstanden {

	public static void main(String[] args) {
		
		String array[]={"Sefa","Abdurrahman","Sadin","Arzu"};
		//enhanced for schleife:
		for(String i:array)
		{
			System.out.println("Namen der Familie: "+i);
		}
		//Standard array:
		for(int i=0;i<array.length;++i)//array.größe = array.length
		{
			System.out.println("Positionen der Arrays: "+i); //gibt die positionen des arrays an
		}
		for(int i=0;i<array.length;++i)
		{
			System.out.println("Array Namen: "+array[i]);
			//array[0] = "Sefa"
			//++i
			//array[1] = "Abdurrahman"
			//++i 
			//array[2] = "Sadin"... usw!
		}

	}

}
