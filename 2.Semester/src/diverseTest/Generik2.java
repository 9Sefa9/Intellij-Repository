
public class Generik2<EinDatentyp> {

	private EinDatentyp name;

	public Generik2(EinDatentyp name){
		this.name = name;
	}
	public void setName(EinDatentyp name){
		this.name = name;
	}
	public EinDatentyp getName(){
		return this.name;
	}

}
