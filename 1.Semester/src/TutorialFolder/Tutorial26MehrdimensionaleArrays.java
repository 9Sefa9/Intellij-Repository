package TutorialFolder;

public class Tutorial26MehrdimensionaleArrays {

	public static void main(String[] args) {
		//zweidimensionaler Array:
/*
	[Zeile 0 Position 0] [Zeile 0 Position 1] [Zeile 0 Position 2]
	[Zeile 1 Position 0] [Zeile 1 Position 1] [Zeile 1 Position 2]
	[Zeile 2 Position 0] [Zeile 2 Position 1] [Zeile 2 Position 2]

			Ihr seht also, Eine Zeile kann unterschiedlich viele Positionen/Spalten haben.
*/
		
		String zweiDimensionalerArray[][] = {{"Premium0","Premium1"},{"Standard0","Standard1","Standard2"},{"Basic0"}};
		
		// {  {}  ,  {}  ,  {}  } = drei Zeilen!
		//     0  	  1      2    = Positionen!
		// {{Pos01,bla01}, {Pos10,Pos11}, {Pos20, Pos21}}
		// Bsp:  Pos20=   [2][0]
		// Bsp2: bla01=   [0][1]	okey ?
		System.out.println(zweiDimensionalerArray[1][0]);
		
		//usw.. undsofort...
		
		
		
	}

}
