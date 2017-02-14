package Übung;

public class MeaningOfLife {
	public static void main(String[] args) {
		try{ //versuche
		func();	//methoden aufruf wirft einen exception DontPanic
		}catch(DontPanic e){ // catche dont panic und behandle!
			e.printStackTrace();
		}
	}

	public static void func() throws DontPanic {
		throw new DontPanic(); //funx wirft ein DOntPanic, was wiederrum ein neuer DOntPanic ist.
		// die neue Excpetion Klasse extenes DontPanic zur Exception Klasse!

	}
//entweder man wirft eine exception oder man behandelt sie !
}
