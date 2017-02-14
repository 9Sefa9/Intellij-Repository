package ÜbungenLösungen;
public class Power {

  public static double power(int n, int x, java.util.Scanner scan) {
    // Per definitionem ist n^0=1:
    if (x == 0)
      return 1;
    // Sonst rekursiver Aufruf zur Berechnung von n*n^(x-1):
    else if (x > 0)
      return n * power(n, x - 1, scan);
    // Falls x negativ ist, dann berechne n^(x+1)/n. Cast zu
    // 'double' geht entweder mit '1.0*' oder mit '(double)':
    else
      return (power(n, x + 1, scan) / (1.0 * n));
  }

  public static void main(String[] args) {
    // Lies zwei Integer mittels 'Scanner' ein:
    java.util.Scanner scan = new java.util.Scanner(System.in);
    int x = scan.nextInt();
    int n = scan.nextInt();
    // Ruf die obige Methode auf und gib ihren Rueckgabewert aus:
    System.out.println(power(n, x, scan));
  }

}
