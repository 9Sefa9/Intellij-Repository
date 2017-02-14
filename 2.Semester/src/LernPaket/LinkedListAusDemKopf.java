package LernPaket;

import java.util.*;

public class LinkedListAusDemKopf {
	public static void main(String[] args) {
		LinkedListAusDemKopf liste = new LinkedListAusDemKopf();
		liste.push("Teest");
		liste.push("Teest2");
		liste.push("Teest3");
		liste.push("Teest4");	
	}
	
	private Node first;
	private class Node {
		String item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String item) {
		Node Oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = Oldfirst;
	}
	public String pop() {
		try {
			String item = first.item;
			first = first.next;
			return item;
		} catch (NullPointerException e) {
			return "Keine Elemente mehr drinne !";
	}
 }
}
