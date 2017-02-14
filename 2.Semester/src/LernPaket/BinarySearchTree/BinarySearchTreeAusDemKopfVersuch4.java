package LernPaket.BinarySearchTree;

public class BinarySearchTreeAusDemKopfVersuch4<Key extends Comparable<Key>, Value> {
	private Node root;
	// die konstanten Farben fehlen !
	private final boolean RED = true;
	private final boolean BLACK = false;

	private class Node {
		public boolean color;
		public int count;
		public Node left, right;
		
		public Key key;
		public Value value;

		//balanced search tree
		public Node(Key key, Value value, boolean color) {
			this.color = color;
			this.key = key;
			this.value = value;
		}
		//binary search tree
		public Node(Key key, Value value, int count) {
			this.count = count;
			this.key = key;
			this.value = value;
		}
	}
// GET DU KLEINER WHILEGÖT !
	public Value getKey(Key key) {
		Node x = root;
		while(x != null){
			int cmp = key.compareTo(root.key);
			if(cmp<0) x = x.left;
			else if(cmp>0) x = x.right;
			else if (cmp == 0) return x.value;
			
		}
		return null;
	}

	public int rank(Node root, Key key) {
		if(root == null) return 0;
		int cmp = key.compareTo(root.key);
		if(cmp<0) return rank(root.left,key);
		else if(cmp>0) return 1+size(root.left)+rank(root.right,key);
		else return size(root.left);
		/*
		 * cmp<0 return ranklinks, wenn cmp>0 return 1+ size(x.left) +
		 * rank(x.right,key); ansonsten returne size(x.left);
		 */
	}

	public int size() {
		return size(root);
	}

	public int size(Node root) {
		if (root == null)
			return 0;
		else
			return root.count;
	}
	// ist der Key, größer gleich dem gescuhten key ?
//	häßlige if abfrage von node t = floor.root.right,key);
	public Node floor(Node root, Key key) {
		if(root == null) return null;
		int cmp = key.compareTo(root.key);
		if(cmp<0) return floor(root.left,key);
		else if (cmp>0) return floor(root.right,key);
		else{
			Node t = floor(root.right,key);
			if(t != null) return t;
			else return root;
			
		}
	}

	// Key key fehlt im parameter!
	public void delete(Key key) {
			root = delete(root,key);
	}

	public Node delete(Node root, Key key) {
		if(root == null) return null;
		int cmp = key.compareTo(root.key);
		if (cmp<0) root.left = delete(root.left,key);
		else if(cmp>0) root.right = delete(root.right,key);
		// ab hier ist es immer diese hässlige while schleife
		else{
			if(root.right == null) return root.left;
			if(root.left == null) return root.right;
			
			Node t = root;
			root = deleteMin(t.right);
			root.right = searchMin(t.right);
			root.left = t.left;
		}
		root.count = 1+size(root.left)+size(root.right);
		return root;
	}
	// parameter Node root ist falsch. Es muss leer bleiben
	public void deleteMin() {
		root = deleteMin(root);
	}

	// Key key gehört hier nicht hin!
	public Node deleteMin(Node root) {
		if(root.left == null) return root.right;
		else {
			root.left = deleteMin(root.left);
			root.count = 1+size(root.left) +size(root.right);
			return root;
		}
	}

	// signatur faslch, es wird der MINIMUM root gesucht
	public Node searchMin(Node root) {
		if(root.left == null) return root;
		else searchMin(root.left);
		
		return root;
		
	}

	public Node rotateLeft(Node root){
		assert(isRed(root.right));
		Node x = root.right;
		root.right = x.left;
		x.left = root;
		x.color = root.color;
		root.color = RED;
		return x;
			
	}

	// stink normal ! überprüft ob root.color == RED ist oder nicht
	public boolean isRed(Node root) {
		if (root == null)
			return false;
		return root.color == RED;

	}

	public Node rotateRight(Node root) {
		assert (isRed(root.left));
		// zuerst vertauschen
		Node x = root.left;
		root.left = x.right;
		x.right = root;
		x.color = root.color;
		root.color = RED;
		return x;

	}

	public Node colorFlip(Node root) {
		assert(isRed(root.right));
		assert(isRed(root.left));
		assert(!isRed(root));
		root.right.color = BLACK;
		root.left.color = BLACK;
		root.color = RED;
		return root;
	}
	
	public Node put(Node root, Key key, Value value, boolean color) {
				if(root == null) return new Node(key,value,RED);
				int cmp = key.compareTo(root.key);
				if(cmp<0) root.left = put(root.left,key,value,color);
				else if(cmp>0) root.right = put(root.right,key,value,color);
				else root.value = value;
				
				if(isRed(root.left) && isRed(root.right)) colorFlip(root);
				if(!isRed(root.left) && isRed(root.right)) root = rotateLeft(root);
				if(isRed(root.left) && isRed(root.left.left)) root = rotateRight(root);

				
				return root;
	}

}
