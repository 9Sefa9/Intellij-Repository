public class DequeTest{
	
	//This class schould test your implemented Deque
	public static void main(String[] args){

		//first we will test a Deque of Strings
		Deque<String> deque = new Deque<String>();

		//our input is a messy input array which should build a sentance afterwards
		String[] input = {"test","will","your","This","deque"};

		//now we will push the array into the deque
		System.out.println("Mixed insert test output :");
		for(int i = 0; i < input.length;++i){
			if(i%2 == 0){
				deque.pushRight(input[i]);
			}else{
				deque.pushLeft(input[i]);
			}
		}

		//now the deque will get poped from left to right
		for(int i = 0; i < input.length;++i){
			System.out.print(deque.popLeft()+ " ");
		}

		//testing a integer deque now
		System.out.println("\nNow testing Integer :");
		Deque<Integer> integerDeque = new Deque<Integer>();
		System.out.println("deque size after initialization : " + integerDeque.size());

		//inserting numbers from 20-0 from big to low
		for(int i = 20; i >= 0;--i){
			integerDeque.pushRight(new Integer(i));
		}

		//try to print it now in correct order
		System.out.println("deque size after insert : " + integerDeque.size());
		for(int i = 0; i <= 20; ++i){
			System.out.print(integerDeque.popRight() + " ");
		}
		
		System.out.println("");

		System.out.println("deque size after pop : " + integerDeque.size());
	}

	/*	-------- RESULTING OUTPUT

	Mixed insert test output :
	This will test your deque 
	Now testing Integer :
	deque size after initialization : 0
	deque size after insert : 21
	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
	deque size after pop : 0

	------------------------- */
}