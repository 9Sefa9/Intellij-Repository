package TutorialFolder;

public class Tutorial39ToSring {

		private int alter;
		private int verdienst;
		
		public Tutorial39ToSring(int alter, int verdienst)
		{
			this.alter = alter;
			this.verdienst = verdienst;
		}
		
		public String toString()//so muss es aussehen !
		{
			return String.format("Alter %s und Verdienst %s und alter %s", alter,verdienst,alter);	//alter muss immer stehen. nach komma
		}//formatiere das ganze in ein String        %s bedeuted das 1.argument			Verdienst 2. argument.
}

//was ist das ? nunja, das ist einfach nur, eine ganze Klasse als String darstellen 
