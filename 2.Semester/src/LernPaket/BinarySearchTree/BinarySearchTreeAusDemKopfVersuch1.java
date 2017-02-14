package LernPaket.BinarySearchTree;

public class BinarySearchTreeAusDemKopfVersuch1<Key extends Comparable<Key>, Value> {
	private Node root;
	
	private class Node {
		private Key key;
		private Value value;
		private Node left, right;
		private int count;

		public Node(Key key, Value val, int count) {
			this.key = key;
			this.value = val;
			this.count = count;
		}
	}

	public void delete(Key key) {
		root = delete(root, key);
	}
	private Node delete(Node x, Key key) {
		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			x.left = delete(x.left, key);
		else if (cmp > 0)
			x.right = delete(x.right, key);
		else {
			if (x.right == null)
				return x.left;
			if (x.left == null)
				return x.right;
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		x.count = 1+size(x.left)+size(x.right);
		return x;
	}
	
	public void deleteMin() {
		root = deleteMin(root);
	}
	private Node deleteMin(Node x) {
		if (x.left == null)
			return x.right;
		x.left = deleteMin(x.left);
		x.count = 1 + size(x.left) + size(x.right);
		return x;
	}
	
	
	//komischerweise schaut er immer nach links bis null..
	private Node min(Node x) { 
        if (x.left == null) return x; 
        else                return min(x.left); 
    }
	
	public int rank(Key key, Node x) {
		if (x == null)
			return 0;
		//vergleicht diesen key mit dem key des roots
		int cmp = key.compareTo(x.key);
		// wenn key kleiner als rootschlüssel , schau nach links
		if (cmp < 0)
			return rank(key, x.left);
		//wenn key  größer als rootschlüssel, 
		else if (cmp > 0)
			// addiere größe von links mit dem 1. schaue nach rechts 
			return 1 + size(x.left) + rank(key, x.right);
		else //ansonsten gib die größe links aus
			return size(x.left);
	}

	public int size() {
		return size(root);
	}

	private int size(Node x) {
		if (x == null)
			return 0;
		return x.count;
	}

	public Key floor(Key key) {
		Node x = floor(root, key);
		if (x == null)
			return null;
		return x.key;
	}

	public Node floor(Node x, Key key) {
		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);
		if (cmp == 0)
			return x;
		if (cmp < 0)
			return floor(x.left, key);

		Node t = floor(x.right, key);
		if (t != null)
			return t;
		else
			return x;
	}
	
	public Value get(Key key) {
		// Definiere den Node x als den Root
		Node x = root;
		// solange der root nicht leer ist
		while (x != null) {
			// vergleiche den schlüssel mit dem schlüssel aus root
			int cmp = key.compareTo(x.key);
			// wenn schlüssel kleiner als der schlüssel vom root, dann ist x =
			// x.left;
			if (cmp < 0)
				x = x.left;
			// ansonsten x = x.right
			else if (cmp > 0)
				x = x.right;
			// ansonsten wenn der schlüssel und der schlüssel aus root, gleich
			// sind, returne x.val;
			else if (cmp == 0)
				return x.value;
		}
		// wenn überhautp garnichts eintritt, er also nichts gefunden hat: null!
		return null;
	}

	// DIESER KASTEN IST WICHTIG UND VERWIRREND !///////////////
	public void put(Key key, Value val) {
		root = put(root, key, val);
	}

	private Node put(Node x, Key key, Value val) {
		// erstellt einen neuen Node, mit dem neuen key und value, wenn es am
		// ende angelangt ist
		if (x == null)
			return new Node(key, val, 1);

		int cmp = key.compareTo(x.key);
		// eine einzige if bedingung reicht schon aus, um rekursiv aufzurufen.
		if (cmp < 0)
			x.left = put(x.left, key, val);
		else if (cmp > 0)
			x.right = put(x.right, key, val);
		// falls der gewünschte value bereits in dem baum ist, ersetze es
		// einfach. Das gleiceh auch für Count. 
		else if (cmp == 0)
			x.value = val;
		// für den Count benötigen wir die obigen initialisierung x.left = und x.right =
		x.count = 1 + size(x.left) + size(x.right);
		return x;
	}
}