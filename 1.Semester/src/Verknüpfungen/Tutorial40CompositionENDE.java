package Verknüpfungen;

import TutorialFolder.Tutorial39ToSring;

public class Tutorial40CompositionENDE {

	public static void main(String[] args) {
		Tutorial39ToSring info = new Tutorial39ToSring(24, 0); // braucht paramter, denn es beinhaltet irgendwas (alter name)
		Tutorial40Composition sefa= new Tutorial40Composition("Sefa", info);
		System.out.println(sefa);
	}

}
