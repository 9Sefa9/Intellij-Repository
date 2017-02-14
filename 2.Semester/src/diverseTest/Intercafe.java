package diverseTest;

public interface Intercafe extends akstrabt{

	public void laufen2();

	
}

// impolements Interface
//extends Abstract  / normale klasse
/*
			SUPER					KIND						RESULTAT										EIGENTSCHAFTEN
		Interface                    Normal 				 implements               
		Normal						Interface  			 Funktioniert nicht !				a superinterface must be an interface --> Interface darf nicht Kind sein!
		
		Abstrakt						Normal				 extends									Unimplementierte Methoden aus Super , in der Kindklasse implementieren!
		Normal						Abstrakt             extends 								garnichts ( normale eifnachvererbung)
		
		Abstrakt						Interface			Funktioniert nicht !				a superinterface must be an interface --> Interface darf nicht Kind sein!
		Interface					Abstrakt	   			funktioniert							allerdings MÜSSEN die methoden NICHT implementiert werden
		
		Abstrakt						Abstrakte 			extends									Methoden müssen NICHT implementiert werden!
		Interface					Interface			extends(SPEZIALSPEZIALFALL)	kindklasse kann nichts implementieren, da kindmethode mit semikolon abgeschlossen wird.								
				
*/
