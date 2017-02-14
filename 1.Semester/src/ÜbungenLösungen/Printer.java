package ÜbungenLösungen;
public class Printer implements ISink {
  // # src: int[]
  protected int[] src;

  // + setInput(input: int[])
  public void setInput(int[] input){
    this.src = input;
  }

  //+ print()
  public void print() {
    for (int i : this.src)
      System.out.print(i + " ");
    System.out.println();
  }
}