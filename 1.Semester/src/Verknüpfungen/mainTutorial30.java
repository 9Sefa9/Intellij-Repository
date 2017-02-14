package Verknüpfungen;

public class mainTutorial30 {

	public static void main(String[] args) {
		AutoTutorial30 auto1 = new AutoTutorial30("Blau", 200);	// von einer Klasse können mehrere Objekte erstellt werden.
		AutoTutorial30 auto2 = new AutoTutorial30("Rot",150);	// jeder dieser objekte haben ihre eigene Eigenschaften. Je nach konstruktor.
		AutoTutorial30 auto3 = new AutoTutorial30("Weiß",120);
		
		System.out.println(auto1.getNavi());
		System.out.println(auto2.getNavi());
		System.out.println(auto3.getNavi());
		
		auto1.updateNavi(5);	//auto 1 wurde upgedated um 5
		System.out.println(auto1.getNavi());
		System.out.println(auto2.getNavi());
		System.out.println(auto3.getNavi());
	}
   // Statisch: wenn es in einem Objekt verwendet wird, wird es auch in allen
   // Objekten verändert. So müsste z.b auto2 und auto3 wieder 0 sein, ist es aber nicht !
	
	//die Variable ist „statisch“ im Sinne von, "in allen Objekten gleich".
}
	//Static : 000 555 
    //nur Int: 000 500  --> beeinflusst NICHT die anderen Objekte! also: update Navi ist für alles zugänglich, da statisch!
