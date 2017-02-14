package TutorialFolder;

import java.util.Random;

public class Tutorial29Random {

	public static void main(String[] args) {
		Random würfel = new Random();
		int augenzahl;
		
		for(int i=0; i<10; ++i)
		{
			augenzahl = 1+würfel.nextInt(6);		// ein würfel hat keine 0 augen. deshalb +1
			System.out.println(augenzahl);			// 6 ist die obergrenze. Siehe übungsmaterial falls nciht verstanden!
		
		}
		
		
	}
}
