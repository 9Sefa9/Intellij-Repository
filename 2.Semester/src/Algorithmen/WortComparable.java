//implementation des INterface spiel eine groﬂe rolle
public class WortComparable implements Comparable<WortComparable> {
	public String inhalt = "Hallo Welt";
	
	// Das programm vergleicht 2 Strings mit den letzten Buchstaben.
	// wenns richtig ist, gibt es eine 0   falls nicht, dann eine -1
	public int compareTo(WortComparable other){
		char i = this.inhalt.charAt(this.inhalt.length()-1); 		// letztes Zeichen im Inhalt:  t 
		char o = other.inhalt.charAt(other.inhalt.length()-1); 		// letztes zeichen in dem PARAMETER: i 
		if(i<o)														// wenn t < o  return -1
			return -1;
		
		if(i == 0) 
			return 0;
		
		else return 1;
	}
	
	
	
	public static void main(String[] args) {	
	String a = "tes";
	String b = "test";
	System.out.println(a.compareTo(b));
	}

}
