package ÜbungenLösungen;
import java.util.Arrays;

public class Sort extends Filter {
  // + execute()
  public void execute() {
    int[] tmp = Arrays.copyOf(this.input,this.input.length);
    Arrays.sort(tmp);
    this.output = tmp;
  }
}