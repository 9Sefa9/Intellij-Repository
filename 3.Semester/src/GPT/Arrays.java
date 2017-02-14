package GPT;

public class Arrays {
	  
	  public static void main(String[] args) {
	    
	    String[] namenSpieler = {"Super Mario", "Luigi", "Yoshi", "Toad"};

	    // Gesamtanzahl der Zeichen in String-Array

        int sum = 0;
        for (int i = 0; i < namenSpieler.length; i++)
  	    	sum += namenSpieler[i].length();
 
        System.out.println(sum);
        System.out.println(sum(namenSpieler));
        System.out.println(sum2(namenSpieler));
	  }

	  public static int sum(String[] s) {
	  	return sum(s,0);
	  }

	  public static int sum(String[] s, int i) {
	  	if (i >= s.length)
	  		return 0;
	  	else
	  		return s[i].length() + sum(s, i+1);

	  }

	  public static int sum2(String[] s) {
	  	if (s.length == 0)
	  		return 0;
	  	else
	  		return s[0].length() + sum2(umDasErsteElementGekuerztesArray(s));
	  }

	  public static String[] umDasErsteElementGekuerztesArray(String[] s) {
	  	String[] neu = new String[s.length-1];
	  	for (int i = 1; i < s.length; i++)
	  		neu[i-1] = s[i];
	  	return neu;
	  }
	}
