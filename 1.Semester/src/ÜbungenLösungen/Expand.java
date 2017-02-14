package �bungenL�sungen;
import java.util.Scanner;

public class Expand {

  public static String expandString(String line) {
    // Erstellen eines leeren String - gleichbedeutend mit String result = "";
    String result = new String();

    // Dieser String beinhaltet die Zahl, um die wir den jeweiligen
    // Buchstaben expandieren wollen
    String expandNumber = new String();

    // Um tatsächlich mit Zahlen zu arbeiten, parsen wir den String in eine
    // Integervariable,
    // die wir als Zähler fuer eine Schleife nutzen können
    int expandNumberInt = 1;

    // zu Deutsch: solange i nicht über die Indizes unseres Strings
    // hinausgeht, erhöhe i
    // wichtig: Indizes fangen bei 0 an, daher von i = 0 bis i <
    // line.length()
    for (int i = 0; i < line.length(); i++) {

      // Handelt es sich bei dem Character an Stelle i um eine Ziffer?
      if (Character.isDigit(line.charAt(i))) {
        // wenn ja, fügen wir die Ziffer zu unserem Ziffern-String hinzu
        expandNumber += line.charAt(i);
        // und parsen ihn schließlich in eine Integervariable
        expandNumberInt = Integer.parseInt(expandNumber);

      // am aktuellen Index i stand KEINE Ziffer
      } else {
        // nun nutzen wir die zuletzt eingelesene Zahl als Zähler in
        // einer for-Schleife, die expandNumberInt-mal durchlaufen wird
        // und somit den Buchstaben so oft wie nötig ausgibt
        for (int j = 0; j < expandNumberInt; j++) {
          // dazu konkatenieren wir den gefundenen Buchstaben an Stelle i an
          // unseren Ergebnis-String
          result += "" + line.charAt(i);
        }
        // damit nicht jede eingelesene Zahl noch zusätzlich an
        // expandNumber konkateniert wird, ist es wichtig, den String
        // auf einen leeren String zurückzusetzen
        expandNumber = "";
        // ähnlich hier: setzen wir den Zähler nicht zurück, werden
        // u.a. auch Buchstaben, vor denen keine Zahl steht (die also
        // nur 1mal ausgegeben werden sollen), so oft ausgegeben, wie es
        // der alte Wert von expandNumberInt vorgibt
        expandNumberInt = 1;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner localScanner = new Scanner(System.in);
    System.out.println(expandString(localScanner.nextLine()));
    localScanner.close();
  }
}