package Algorithmen;

//operations: insert, remove, interate, empty(boolean)
//stack : fifo,   queue: lifo
public class LinkedStackOfStrings<Datentyp> {

	Node first = null;
 // beschreibt einen " Quadrat "
	private class Node{
		public Datentyp item;
		public Node next;
	}
	public  boolean isEmpty(){
		return first == null;
	}
	public void push(Datentyp item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
	
	public Datentyp pop()
	{
		//speichere das item aus first
		Datentyp item = first.item;
		//lösche jetzt first, weil wirs nicht mehr brauchen 
		first = first.next; //der first wird auf das nächste gesetzt
		return item;
	}
	public static void main(String[] args){
		 
		LinkedStackOfStrings<String> test = new LinkedStackOfStrings<String>();
		System.out.println("ist es leer ?: "+test.isEmpty());
		test.push("Hallo ");
		test.push("  Mein");
		test.push("  Name");
		System.out.println("ist es leer ?: "+test.isEmpty());
		test.push("  ist");
		test.push(" rgendwas");
		System.out.print(test.pop());
		System.out.print(test.pop());
		System.out.print(test.pop());
		System.out.print(test.pop());
		System.out.print(test.pop());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
