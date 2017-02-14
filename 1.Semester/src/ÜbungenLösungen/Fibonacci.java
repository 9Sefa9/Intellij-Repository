package ÜbungenLösungen;
public class Fibonacci {

  public static int fibonacci(int n) {
    /*
     * Sture Implementierung der Formel fuer die Fibonacci-Zahlen. Nullte Zahl
     * ist 0, erste Zahl ist 1 und die restlichen ergeben sich aus der Summe der
     * beiden vorangegangenen, die dann rekursiv berechnet werden. 
     * Tipp: Einfach mal aufschreiben und nachvollziehen, was hier passiert!
     */
    switch (n) {
    case 0:
      return 0;
    case 1:
      return 1;
    default:
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    // Lies eine Integer mittels 'Scanner' ein:
    java.util.Scanner scan = new java.util.Scanner(System.in);
    int n = scan.nextInt();
    // Ruf die obige Methode auf und gib ihren Rueckgabewert aus:
    System.out.println(fibonacci(n)); // soll einen integer wert annehmen
  }

}
