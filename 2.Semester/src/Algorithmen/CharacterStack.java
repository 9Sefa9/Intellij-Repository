package Algorithmen;

public class CharacterStack{
	
	private char[] stack = new char[1];
	private int index = 0;

	//returns the current used memory of the stack in byte
//	public int usedMemory(){
//		
//	}
	
	public CharacterStack(){
		
	}
	
	//checks if the stack is empty
	public boolean isEmpty(){
		return index == 0;
	}

	//returns the elements on the stack;
		public int size(){
			return index;
		}
	
	//returns the top item without removing it
	public char top(){
		
		char top = stack[index-1];
		return top;
	}

	
	private void resize(int size){
		char [] copy = new char[size];
		for(int i=0; i<index; i++){
			copy[i] = stack[i];
		}
		stack = copy;
	}
	public void push(char i){
		if(index == stack.length)
			resize(stack.length*2);
		
		stack[index++] = i;
		
	}
	public char pop(){ // pop nachfragen
				
		if(index>0 && index ==stack.length/4)
			resize(stack.length/2);
		//push erhöht am ende nochmal um 1.  desshalb muss es um 1 erndiedrigt werden
		index--;												//
		char item = stack[index];
		return item;
		
	}

	//this main method will test the stack
	public static void main(String[] args){
		CharacterStack stack = new CharacterStack();
		System.out.println("## testing push and pop ##\n");
		stack.push('K');
		stack.push('C');
		stack.push('A');
		stack.push('T');
		stack.push('S');
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("\n## testing top and empty ##\n");
		stack.push('A');
		stack.push('B');
		stack.push('C');

		System.out.println("Elements on this stack : "+ stack.size());
		System.out.println("Is this stack empty : " + stack.isEmpty());

		System.out.println("What is the TOP element : " + stack.top());

		System.out.println("Elements on this stack : "+ stack.size());
		

		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println("\n## testing resize ##\n");
		for(int i = 0; i < 100;++i){
			stack.push('a');
		}
//		System.out.println("Memory used by the stackarray : " + stack.usedMemory());
//		for(int i = 0; i < 1000;++i){
//			stack.push('b');
//		}
//		System.out.println("Memory used by the stackarray : " + stack.usedMemory());
//		for(int i = 0; i < 800;++i){
//			stack.pop();
//		}
//		System.out.println("Memory used by the stackarray : " + stack.usedMemory());
//	}

	}
}
