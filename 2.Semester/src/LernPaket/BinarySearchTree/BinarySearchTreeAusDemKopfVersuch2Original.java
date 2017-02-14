package LernPaket.BinarySearchTree;

import LernPaket.Queue;

///fehler 1: konstruktor variablen gehören in die tiefenklasse rein! root variable nicht
//fehler 2: node beinhaltet left, right, count, key, value. left right, werden nciht ko0nstruktiv übergeben!
//fehler 3: rank hat eine int ausgabe, wenn garkein if fall vorliegt: einfach die größe aus der linken Seite nehmen, als letzten else befehl
//fehler 4: Bei Size, gibt es 2 methoden, der erste übergibt sofort den root, der zweite checkt die größe
/// fehler 5: get braucht eine while schleife , mit der bedingung, dass root ungleich null ist. Zudem muss Node x erstellt werden. Am ende eine Null returnen
// fehler 6: floor returned einen Node ! es übergibt einen Node root und key key. am anfang checken, ob der root null ist, wenn cmp <0 check floor links,  erstelle Node T mit floor rechts. wenn t nicht null sein sollte, dann returne t ansonsten den root
// fehler 7: put hat auch 2 funktionen. in der ersten hat es nur 2 parameter key value und es wird nur root = definiert. die zweite funktion bearbeitet den rest! es gibt Node aus. x.left = put(x.left,key,value) muss definiert werden auch für rechts.
// floor und ceiling sind fast die ein und die selben sachen also brauchen wir es nciht implementieren
// fehler 8 : die deletes implementieren bzw. initilaiseren root. da wiederum referenziert auf eine ander Funktion
// fehler 9 : deleteMin ist eine ekelhafte funktion, es nutzt keinen compare. 
//Fehler 10 : RIESEN PROBLEM MIT HIBBARD DELETION!
///Fehler11: count wird in folgenden funktionen verwendet : rank size put delete deletemin
public class BinarySearchTreeAusDemKopfVersuch2Original<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		private Key key;
		private Value value;
		private Node left;
		private Node right;
		private int count;

		public Node(Key key, Value value, int count) {
			this.key = key;
			this.value = value;
			this.count = count;
		}
	}

	public Iterable<Key> keys() {
		Queue<Key> q = new Queue<Key>();
		inorder(root, q);
		return q;
	}

	private void inorder(Node x, Queue<Key> q) {
		if (x == null)
			return;
		inorder(x.left, q);
		q.enqueue(x.key);
		inorder(x.right, q);
	}

	// while
	public Value get(Key key) {
		Node x = root;
		while (x != null) {

			int cmp = key.compareTo(x.key);
			if (cmp == 0)
				return x.value;
			else if (cmp < 0)
				x = x.left;
			else if (cmp > 0)
				x = x.right;
			else
				return x.value;
		}
		return null;
	}

	// cmp rechts ist 1+sizeleft+rankright ansonsten return sizeleft
	public int rank(Node root, Key key) {
		if (root == null)
			return 0;
		int cmp = key.compareTo(root.key);
		if (cmp < 0)
			return rank(root.left, key);
		else if (cmp > 0)
			return 1 + size(root.left) + rank(root.right, key);
		else
			return size(root.left);

	}

	// 2xSize
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
	public Node floor(Node root, Key key) {
		if (root == null)
			return null;
		int cmp = key.compareTo(root.key);

		if (cmp == 0)
			return root;

		if (cmp < 0)
			return floor(root.left, key);

		Node t = floor(root.right, key);
		if (t != null)
			return t;
		else
			return root;

	}

	// pute einen neuen node, es beinhaltet, key und value
	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

	public Node put(Node x, Key key, Value value) {

		if (x == null)
			return new Node(key, value, 1);
		int cmp = key.compareTo(x.key);

		if (cmp < 0)
			x.left = put(x.left, key, value);
		else if (cmp > 0)
			x.right = put(x.right, key, value);
		else if (cmp == 0)
			x.value = value;

		x.count = 1 + size(x.left) + size(x.right);
		return x;

	}// sucht minimum node das ist selbstverständlich !

	public Node searchMin(Node root) {
		if (root == null)
			return root;
		else
			return searchMin(root.left);
	}

	// löscht ein Node
	public void delete(Key key) {
		root = delete(root, key);
	}

	public Node delete(Node root, Key key) {
		if (root == null)
			return null;
		int cmp = key.compareTo(root.key);
		if (cmp < 0)
			root.left = delete(root.left, key);
		else if (cmp > 0)
			root.right = delete(root.right, key);
		else {

			// kann nicht mehr durchforcen, da links recht null sein können.
			if (root.right == null)
				return root.left;
			if (root.left == null)
				return root.right;

			// ACHTUNG:
			// ab sofort wird t gespeichert in x.
			// Dann sucht er den keinsten node von t.right BIS er einen linken
			// NULL gefunden hat
			//
			Node t = root;
			root = searchMin(t.right);
			root.right = deleteMin(t.right);
			root.left = t.left;
		}
		root.count = size(root.left) + size(root.right) + 1;
		return root;
	}

	public void deleteMin() {
		root = deleteMin(root);
	}

	// geh nach links bis du ein node findest mit einem null link.
	// ersetze diesen node mit seinem rechten link
	// update die counts
	public Node deleteMin(Node root) {

		if (root.left == null)
			return root.right;

		else
			root.left = deleteMin(root.left);
		root.count = 1 + size(root.left) + size(root.right);
		return root;
	}

}
