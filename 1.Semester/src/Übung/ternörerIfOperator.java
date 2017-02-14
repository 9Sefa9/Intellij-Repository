package Übung;

public class ternörerIfOperator {

	public static void main(String[] args) {

		  boolean bedingung;
		  int  zahlInt  = 100;
		  long zahlLong = 200l;
		  int ergebnisInt;
		  long ergebnisLong;

		  bedingung = zahlInt < zahlLong;
		  System.out.println("\nbedingung:    " + bedingung);

		  			// musste gecastet werden, da 32 --> 64 bit nicht funktioniert.  62 --> 32 bit schon, weil überlappt sich
		  ergebnisInt = (int) (bedingung ? zahlInt : zahlLong);
		  System.out.println("\nergebnisInt:  " + ergebnisInt);
		  				// hier wird ncihts gecastet, da wertebereich von long 64 bit int überdeckt(32 bit)
		  ergebnisLong = bedingung ? zahlInt : zahlLong;
		  System.out.println("\nergebnisLong: " + ergebnisLong);


		  
		  String refStr = new String("Hallo PLGQ.");
		  Object refObj = new Object();
		  Object result;
		  
		  //result ist gleich rrefStr, wenn Bedingung false ist, ansonsten refObj!  
		  bedingung = true;
		  result = (!bedingung) ? refStr : refObj;
		  System.out.println("\nresult:       " + result);


		  String result2;

		  //result2 = (String) ((!bedingung) ? refStr : refObj);
		  // Laufzeitfehler, da Object nicht zu String umgewandelt werden kann
		 }
		}

