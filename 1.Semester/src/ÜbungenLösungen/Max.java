package ÜbungenLösungen;
public class Max extends Filter {
  public void execute() {
    int max = Integer.MIN_VALUE;
    for (int i : this.input)
      if (i > max)
        max = i;
    this.output[0] = max;
  }
}