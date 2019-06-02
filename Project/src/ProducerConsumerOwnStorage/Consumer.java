package ProducerConsumerOwnStorage;

public class Consumer extends Thread {
	  Depot depot;

	  public Consumer(Depot depot) {
	    this.depot = depot;
	  }

	  public void run() {
	    for (int i = 0; i < 10; i++) {
	      // Aufruf einer der synchronisierten Methode
	      depot.get();
	      try {
	        sleep((int)(Math.random()*1000));
	      }
	      catch (InterruptedException e) {}
	    }
	  }
	}