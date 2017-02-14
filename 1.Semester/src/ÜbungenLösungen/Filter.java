package ÜbungenLösungen;
public abstract class Filter implements ISink, ISource {
  // # input: int[]
  protected int[] input;
  // # output: int[]
  protected int[] output = new int[1]; // 0 und 1 

  public abstract void execute();

  // + setInput(input: int[])
  public void setInput(int[] input){
    this.input = input;
  }

  // + getOutput(): int[]
  public int[] getOutput() {
    return this.output;
  }
}