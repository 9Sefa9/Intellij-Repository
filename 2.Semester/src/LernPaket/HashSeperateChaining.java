package LernPaket;

public class HashSeperateChaining<Key, Value> {
	private int M = 50;
	public Node[] st = (Node[]) new Object [M];

	private class Node {
		public Node next;
		public Object key;
		public Object value;

		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
			

		}

	}

	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public void put(Key key, Value val) {
		int i = hash(key);
		for (Node x = st[i]; x != null; x = x.next)
			if (key.equals(x.key)) {
				x.value = val;
				return;
			}
		st[i] = new Node(key, val, st[i]);
	}

	public Value get(Key key) {
		int i = hash(key);
		for (Node x = st[i]; x != null; x = x.next)
			if (key.equals(x.key))
				return (Value) x.value;
		return null;
	}
}
