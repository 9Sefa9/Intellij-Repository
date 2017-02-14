package UltimateGPTLearn;

//Die Abstrakte Klasse 
//2 arten von Methoden: abstrakte Methode ohne body und normale Methode mit Body
//Konstruktoren sind erlaubt
//Kann einen Interface implementieren und muss dabei keine Methoden überschreiben
//sobald eine Methode abstrakt ist, wird die ganze Klasse abstrakt
//es ist möglich ein objekt zu erstellen
public abstract class TheAbstract extends TheMainClass implements TheInterface {
	private String name;
	private String[] nameArray;

	public TheAbstract(String s) {
		super(s);
		this.name = s;
		nameArray = new String[name.length()];
		
	}

	public String[] abstractMethodArray() {
		return this.nameArray;
	}

	// sollte ich mich mal ein wenig mehr befassen
	public abstract int abstractMethod();

	public void setStringArray(String[] nameArray){
		this.nameArray = nameArray;
	}
	public String[] getStringName(){
		return this.nameArray;
	}
	public String toString(){
		return "Die Abtrakte Klasse heißt: "+getStringName();
	}
}
