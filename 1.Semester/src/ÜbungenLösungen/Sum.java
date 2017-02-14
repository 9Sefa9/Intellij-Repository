package ÜbungenLösungen;
public class Sum extends Filter {
  
	public void execute() {
    int sum = 0;
    for(int i : this.input)
      sum += i;
    this.output[0] = sum;
  }
}