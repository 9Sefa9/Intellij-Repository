
public class test2<Datentyp> {

	private Datentyp name;
	
	public test2(Datentyp name){
		this.name=name;
	}
	public void setName(Datentyp name){
		this.name = name;
	}
	public Datentyp getName(){
		return this.name;
	}
	
	
	
	public String toString(){
		return "Ich bin eine: "+this.name;
	}
}
