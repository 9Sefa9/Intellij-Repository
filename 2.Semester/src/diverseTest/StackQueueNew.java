package diverseTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackQueueNew {
	public static ArrayList<Integer> stack = new ArrayList<Integer>();
	public static void main(String [] args){

		
		stack.add(3);
		stack.add(1);
		stack.add(2);
		stack.add(1);
		stack.add(3);
		
		
		//wenn man einen Iterator nutzt, sollte man diese erst mit iterator() initialisieren. Dann eine While schleife machen, und ausgeben
		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//alternative : 
		System.out.println(iterator(stack));
		
		
		
		// Iterable sollte man wie unten aufgeführt , so aufschreiben : er returned den ganzen inhalt:
	}
	public static Iterable<Integer> iterator(ArrayList<Integer> stack){
		
		return stack; 
	}
	
	// Vorsicht: Iterable ist != Iterator ! siehe hier : 
	/*
	 * public interface Iterable<T>{
    	Iterator<T> iterator();
		}
	 */
	
	/*
	 * An Iterable is a simple representation of a series of elements that can be iterated over. It does not have any iteration state such as a "current element".
	 * Instead, it has one method that produces an Iterator.
	 * An Iterator is the object with iteration state. It lets you check if it has more elements using hasNext() and move to the next element (if any) using next().
	 * Typically, an Iterable should be able to produce any number of valid Iterators.
	 */

}
