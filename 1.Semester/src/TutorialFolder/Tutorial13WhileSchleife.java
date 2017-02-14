package TutorialFolder;

public class Tutorial13WhileSchleife {

	public static void main(String[] args) {
		
		int alter=0;
		while(alter<=10)	//solange
		{ 		//achte darauf, dass die While bedingung beendet/erreicht wird ! sonst endlos schleife !
							
		System.out.println(alter);	
		alter++;//solange zähler kleiner als 10 ist, sollst du diesen code abspielen! 
		
		if(alter == 9)
		{
			System.out.println("versuchs erst garnicht!");
		}
		}							//while befehl endet, wenn 10 erreicht wurde!! also nimm dich in acht!
								
	}

}
