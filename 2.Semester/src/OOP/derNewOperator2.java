
public class derNewOperator2 extends derNewOperator1 {


	public derNewOperator2(int schüler, String name, String fach){
	this.Schüler = schüler;
	this.Name  	= name;
	this.Fach		= fach;
	
	}
	public void setSchüler(int schüler){
		this.Schüler = schüler;
	}
	public int getSchüler(int schüler){
		
		return this.Schüler;
		
	}
	public void setName(String name){
		this.Name = name;
	}
	public String getName(){
		return this.Name;
	}
	public void setFach(String fach){
		this.Fach = fach;
	}
	public String getFach(){
		return this.Fach;
	}
	public String toString(){
		return "Die Klasse besteht aus "+Schüler+" Schülern, Die Lehrerin heißt:"+Name+" und Unterrichtet: "+Fach+"";
	}
}
