package ProducerConsumerOwnStorage;

public class Producer extends Thread {
	Depot depot;

	public Producer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			// Aufruf einer der synchronisierten Methode
			depot.put(i);
			try {
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
	}
}
