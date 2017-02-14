package LernPaket;

public class BalancedSearchTree<Key extends Comparable<Key>, Value> {

	// komischerweise schaut er immer nach links bis null..
	private Node root;

	private static final boolean RED = true;
	private static final boolean BLACK = false;

	private class Node {
		public Key key;
		public Value value;
		public Node left, right;
		public int count;
		public boolean color; // color of parent link

		public Node(Key key, Value value, int count, boolean color) {
			this.key = key;
			this.value = value;
			this.count = count;
			this.color = color;
		}
	}
		private void flipColors(Node h){
		assert !isRed(h);
		assert isRed(h.left);
		assert isRed(h.right);
		h.color = RED;
		h.left.color = BLACK;
		h.right.color = BLACK;
		}
	public Node rotateLeft(Node h) {
		assert isRed(h.right);
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	public Node rotateRight(Node h) {
		assert isRed(h.left);
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	private Node putBezüglichBalancedTrees(Node h, Key key, Value value) {
		if (h == null)
			return new Node(key, value, 1, RED);
		int cmp = key.compareTo(h.key);
		if (cmp < 0)
			h.left = putBezüglichBalancedTrees(h.left, key, value);
		else if (cmp > 0)
			h.right = putBezüglichBalancedTrees(h.right, key, value);
		else  if (cmp == 0) 
			h.value= value;
		
		if (isRed(h.right) && !isRed(h.left))
			h = rotateLeft(h);
		if (isRed(h.left) && isRed(h.left.left))
			h = rotateRight(h);
		if (isRed(h.left) && isRed(h.right))
			flipColors(h);
		
		h.count = 1+ size(h.left) + size(h.right);
		return h;
	}
	public void put(Key key, Value val) {
		root = putBezüglichBalancedTrees(root, key, val);
	}

	private Node put(Node x, Key key, Value val) {
		
		if (x == null)
			return new Node(key, val, 1,RED);

		int cmp = key.compareTo(x.key);

		if (cmp < 0)
			x.left = putBezüglichBalancedTrees(x.left, key, val);
		else if (cmp > 0)
			x.right = putBezüglichBalancedTrees(x.right, key, val);

		else if (cmp == 0)
			x.value = val;

		x.count = 1 + size(x.left) + size(x.right);
		return x;
	}

	private boolean isRed(Node x) {
		if (x == null)
			return false;
		return x.color == RED;
	}

	private Node min(Node x) {
		if (x.left == null)
			return x;
		else
			return min(x.left);
	}

	public int rank(Key key, Node x) {
		if (x == null)
			return 0;
	
		int cmp = key.compareTo(x.key);
	
		if (cmp < 0)
			return rank(key, x.left);
		
		else if (cmp > 0)
			
			return 1 + size(x.left) + rank(key, x.right);
		else
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
	
		Node x = root;
	
		while (x != null) {
		
			int cmp = key.compareTo(x.key);
			
			if (cmp < 0)
				x = x.left;
		
			else if (cmp > 0)
				x = x.right;
			
			else if (cmp == 0)
				return x.value;
		}

		return null;
	}


	
}

