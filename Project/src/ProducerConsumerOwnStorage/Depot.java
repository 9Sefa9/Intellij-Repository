package ProducerConsumerOwnStorage;

public class Depot {
	
	int buffer;
	boolean empty = true;
	
	// Befindet sich ein Thread in dieser Methode darf kein anderer Thread ein
	// synchronized-Methode aufrufen
	public synchronized void put(int data) {

		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println("Eingetragen: " + data);
		buffer = data;
		empty = false;
		notify();
	}

	// Befindet sich ein Thread in dieser Methode darf kein anderer Thread ein
	// synchronized-Methode aufrufen
	public synchronized int get() {
		
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println("Abgeholt: " + buffer);
		empty = true;
		notify();
		return buffer;
	}

}
