package ÜbungenLösungen;
public class Min extends Filter {

	public void execute() {
		
    int min = Integer.MAX_VALUE;
    for (int i : this.input) // der geht die schleife durch 
      if (i < min)			// wenn schleife kleiner als input.length
        min = i;			// dann ist input.length = die schleife
    this.output[0] = min;
  
	}
}