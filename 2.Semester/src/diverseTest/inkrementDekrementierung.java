package diverseTest;


public class inkrementDekrementierung {
	static int index=5;
	
	public static void main(String[] args){
		System.out.println("vorher: "+index);
		index--;
		System.out.println("nachher: "+index);
		System.out.println("jetzt mit i-1 oder i+1");
		// es gibt unterschiede zwischen i-- und i-1!!
		//index-1 ändert nur den wert innerhalb!
		// i++ oder i-- erniedrigt es aber vollig um 1 !
		System.out.println("index-1: "+(index-1));
		System.out.println("index --: "+index--);
		System.out.println("endgültiger index: "+index);
		
	}
	
}
