package Panikrunde2016;

public class Blume extends Pflanze {
	private String blütenfarbe;
	
	public Blume(String art){
		super.art = art;
	}
	
	public void setBluetenfarbe(String blütenfarbe){
		this.blütenfarbe = blütenfarbe;
	}
	public String getBluetenfarbe(){
		return this.blütenfarbe;
	}
	/*public String toString(){
		return "Deine Blütenfarbe ist "+getBluetenfarbe()+" und du bist eine : "+super.art+"";
	}
	*/
}
