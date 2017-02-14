package Generics;

public class RingBuffer<E> {
	private int size;
	private Object[] elements;

	public RingBuffer(int size) {
		this.size = size;
		elements = new Object[size];
	}

	

	public E get(int index) {
		index = mod(index);
		return (E) elements[index];
	}

	private int mod(int index) {
		while (index < 0) {
			index += size;
		}
		return index % size;
	}

	public int getSize() {
		return size;
	}

	public void add(int index, E element) {
		index = mod(index);
		elements[index] = element;
	}
	public static void main(String[] args) {
		RingBuffer<Integer> r = new RingBuffer<Integer>(4);
		r.add(0, 0);
		r.add(1, 1);
		r.add(2, 2);
		r.add(3, 3);	
		r.add(4, 4);
		r.add(5, 5);
		System.out.println(r.get(0));
		System.out.println(r.get(7));
		System.out.println(r.get(-42));
		
		RingBuffer<String> s = new RingBuffer<String>(4);
		
		s.add(0, "a");
		s.add(1, "b");
		s.add(2, "c");
		s.add(3, "d");
		s.add(4, "e");
		s.add(5, "f");
		System.out.println(s.get(0));
		System.out.println(s.get(7));
		System.out.println(s.get(-42));
	}
}
