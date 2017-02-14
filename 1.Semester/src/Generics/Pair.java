package Generics;

// X und y werden als referenzvariable in der klasse angesehen.
public class Pair<X, Y> {
	public X first; // public int I;
	public Y second;

	// Konstruktor, mit den Variablen first und second die ien Objekt von X und
	// Y sind.
	public Pair(X first, Y second) {
		this.first = first;
		this.second = second;

	} // public int first(){
		// }

	public X first() {
		return first;
	}

	public Y second() {
		return second;
	}
}
