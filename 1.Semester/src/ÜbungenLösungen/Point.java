package �bungenL�sungen;
public class Point {
	// x, y, z repräsentieren eure Koordinaten in einem kartesischen
	// (drei dimensionalen) Koordinatensystem
	private double x, y, z;

	// Getter für die x-Koordinate
	public double getX() {
		return x;
	}

	// Setter für die x-Koordinate
	public void setX(double x) {
		this.x = x;
	}

	// Getter für die y-Koordinate
	public double getY() {
		return y;
	}

	// Setter für die y-Koordinate
	public void setY(double y) {
		this.y = y;
	}

	// Getter für die z-Koordinate
	public double getZ() {
		return z;
	}

	// Setter für die z-Koordinate
	public void setZ(double z) {
		this.z = z;
	}

	// Standardkonstruktor soll einen Punkt im Koordinatenursprung erzeugen
	public Point() {
		this.x = this.y = this.z = 0.0;
	}

	// Konstruktor mit Parameterliste für alle drei Koordinaten
	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// Addition von zwei Punkten miteinander, dabei wird ein neuer Punkt erzeugt
	public Point add(Point other) {
		Point addiert = new Point();
		addiert.x = this.x + other.x;
		addiert.y = this.y + other.y;
		addiert.z = this.z + other.z;
		return addiert;
	}

	// Komponentenweise Multiplikation von zwei Punkten, dabei wird ein neuer
	// Punkt erzeugt
	public Point mul(Point other) {
		Point multipliziert = new Point();
		multipliziert.x = this.x * other.x;
		multipliziert.y = this.y * other.y;
		multipliziert.z = this.z * other.z;
		return multipliziert;
	}

	// Komponentenweise Division von zwei Punkten, dabei wird ein neuer
	// Punkt erzeugt
	public Point div(Point other) {

		Point dividiert = new Point();
		dividiert.x = this.x / other.x;
		dividiert.y = this.y / other.y;
		dividiert.z = this.z / other.z;
		return dividiert;
	}

	// Komponentenweise Subtraktion eines skalaren Wertes von einem Punkt
	public Point sub(double d) {
		Point subScalar = new Point();
		subScalar.x = this.x - d;
		subScalar.y = this.y - d;
		subScalar.z = this.z - d;
		return subScalar;
	}

	// Komponentenweise Addition eines skalaren Wertes mit einem Punkt
	public Point add(double d) {
		Point addScalar = new Point();
		addScalar.x = this.x + d;
		addScalar.y = this.y + d;
		addScalar.z = this.z + d;
		return addScalar;
	}

	// Komponentenweise Multiplikation eines skalaren Wertes mit einem Punkt
	public Point mul(double d) {
		Point mulScalar = new Point();
		mulScalar.x = this.x * d;
		mulScalar.y = this.y * d;
		mulScalar.z = this.z * d;
		return mulScalar;
	}

	// Komponentenweise Division eines skalaren Wertes mit einem Punkt
	public Point div(double d) {
		Point divScalar = new Point();
		divScalar.x = this.x / d;
		divScalar.y = this.y / d;
		divScalar.z = this.z / d;
		return divScalar;
	}
/*
	// ignore this
	public Direction sub(Point other) {
		return new Direction(x - other.x, y - other.y, z - other.z);
	}

	// ignore this
	public Point add(Direction other) {
		return new Point(x + other.x, y + other.y, z + other.z);
	}

	// ignore this
	public Point sub(Direction other) {
		return new Point(x - other.x, y - other.y, z - other.z);
	}

	// ignore this
	private double clamp(double val, double minVal, double maxVal) {
		return Math.min(Math.max(val, minVal), maxVal);
	}

	// ignore this
	public Point clamp(double minVal, double maxVal) {
		return new Point(clamp(x, minVal, maxVal), clamp(y, minVal, maxVal),
				clamp(z, minVal, maxVal));
	}
	*/
}
