package OOP;

public abstract class Filter implements ISource,ISink {

	protected int []input;
	protected int []output;
	
	public abstract void execute();
	
	public void setInput(int [] input){
		this.input = input;
	}
	public int[] getOutput(){
		return this.output;
	}
}
