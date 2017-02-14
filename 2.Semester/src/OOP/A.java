package OOP;

import java.util.ArrayList;

public class A extends Konkatenation{

	public static void main(String[] args){
		Konkatenation test = new Konkatenation();
		test.insert('s');
		test.insert('e');
		test.insert('f');
		test.insert('a');
		test.insert('s');
		test.insert('g');
		test.delete('s');
		
		System.out.println(test.word());
	}
} 
