package Übung;
import java.util.Arrays;
public class BreakContinue {
//final: du kannst mich JETZT nicht überschreiben!
	    private static final int maxNum = 12;
	    private static final char space = ' ';

	    public static void main(final String[] args) {

	        final int maxWert = (int) Math.pow(maxNum, 2);
	        final int feldLänge = String.valueOf(maxWert).length();

	        for (int i = 1; i <= maxNum; i++) {
	            for (int j = 1; j <= maxNum; j++) {
	                System.out.print(space); // Leerzeichen zwischen 2 Werten
	                System.out.print(getIntAlsString(i * j, feldLänge)); // Liefert den Wert als immer gleich langen String mit führenden Leerzeichen
	            }
	            System.out.println(); // Zeilenumbruch
	        }
	    }

	    private static String getIntAlsString(final int wert, final int stringLaenge) {
	        final String wertAlsString = String.valueOf(wert);
	        final char[] pre = new char[stringLaenge - wertAlsString.length()];
	        Arrays.fill(pre, space);
	        return new String(pre) + wertAlsString;
	    }
	}