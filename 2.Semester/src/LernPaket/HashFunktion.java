package LernPaket;

public class HashFunktion {
/* INT
	private static final int value=0;
	
	
	public int hashCode(){
		return value;
	}
*/
	
/* DOUBLE
	private static final double value = 0;
	public int hashCode(){
		long bits = doubleToLongBits(value);
		return (int) bits ^ (bits >>> 32));		
	}
	*/
/*
	private static final boolean value=true;
	public int hashCode(){
		if(value) return 1231;
		else return 1237;
	}
*/
	/*MODULAR HASHING
	 * private int hash(Key key){ 
	 * return (key.hashCode() & 0x7fffffff) % M; 
	 * }
	 */
	public static void main(String[] args){
	String a = "t";
	String b = "s";
	if((a.hashCode()) == (b.hashCode()))
	System.out.println(a.hashCode());
	
	}
}


