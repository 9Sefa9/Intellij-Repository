package Verknüpfungen;

import TutorialFolder.Tutorial39ToSring;

public class Tutorial40Composition {

	private String name;
	private Tutorial39ToSring info;
	
	public Tutorial40Composition(String name,Tutorial39ToSring info){
		this.name=name;
		this.info= info;
	}//das hier ist klar... setter 
	
	
	public String toString()
	{
		return String.format("%s ist %s", name, info);
		// erste prozent ist name, zweite prozent info
	}
}
