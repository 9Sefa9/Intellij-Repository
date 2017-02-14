package �bungenL�sungen;
/*
 * Diese Klasse implementiert komplexe Zahlen
 * http://de.wikipedia.org/wiki/Komplexe_Zahl
 */
public class Complex {
	// r und i repräsentieren den Real- und Imaginärteil einer komplexen Zahl
	private double r, i;

	// Getter für den Realteil
	public double getR() {
		return r;
	}

	// Setter für den Realteil
	public void setR(double r) {
		this.r = r;
	}

	// Getter für den Imaginärteil
	public double getI() {
		return i;
	}

	// Setter für den Imaginärteil
	public void setI(double i) {
		this.i = i;
	}

	// Standardkonstruktor soll das Nullelement einer komplexen Zahl erzeugen
	public Complex() {
		this.i = this.r = 0.0;
	}

	// Konstruktor mit Parameterliste des Imaginär- und Realteils
	public Complex(double r, double i) {
		this.setI(i); // Aufruf des Setters für den Imaginärteil
		this.setR(r); // Aufruf des Setters für den Realteil
	}

	// Quadrat einer komplexen Zahl (Multiplikation mit sich selbst)
	// Die aktuelle Instanz (this) soll nicht verändert werden.
	// Das Ergebnis (return) soll eine neue Instanz sein.
	public Complex square() {
		Complex obj = new Complex();
		obj.r = (this.r * this.r - this.i * this.i);
		obj.i = (this.r * this.i + this.r * this.i);
		return obj;
	}

	// Quadrat des Betrages einer komplexen Zahl
	public double squaredNorm() {
		return this.r * this.r + this.i * this.i;
	}

	// Betrag einer komplexen Zahl
	public double norm() {
		return Math.sqrt(squaredNorm());
	}

	// Zwei Instanzen werden zu einer neuen addiert
	public Complex add(Complex other) {
		Complex object = new Complex();
		object.r = this.r + other.r;
		object.i = this.i + other.i;
		return object;
	}
}