package ÜbungenLösungen;
public class Minimum {

  public static int minimum(int current, java.util.Scanner scan) {
    // Lies die zu vergleichende Zahl ein:
    int next = scan.nextInt();

    // Brich ab, wenn sie 0 ist:
    if (next == 0)
      return current;
    // Wenn sie kleiner als die momentan groesste Zahl ist, nimm
    // sie als neue kleinste Zahl an, falls sie positiv ist:
    else if (next < current && next > 0)
      return minimum(next, scan);
    // Sonst aendert sich nichts:
    else
      return minimum(current, scan);
  }

  public static void main(String[] args) {
    // Lies eine Integer mittels 'Scanner' ein:
    java.util.Scanner scan = new java.util.Scanner(System.in);
    /*
     * Ruf die obige Methode auf und gib ihren Rueckgabewert aus. Dabei wird das
     * aktuelle Minimum auf den maximalen Wert fuer Integer gesetzt, sodass jede
     * eingegebene Zahl kleiner sein muss. Moegliches Problem: Wenn direkt eine 0
     * eingegeben wird, wird der maximale Integer-Wert ausgegeben. Davon sehen
     * wir hier aber ab, da das Minimum von keiner Zahl nicht definiert ist und
     * daher auch nicht getestet werden darf.
     */
    System.out.println(minimum(Integer.MAX_VALUE, scan));
  }

}
