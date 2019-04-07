package ProducerConsumer.ProducerConsumer;

import java.util.Vector;

public class Producer extends Thread {
	private Vector v;

	public Producer(Vector v) {
		this.v = v;
	}

	public void run() {
		String s;

		while (v.size()>=0) {

			// intrinsischen Lock von v setzen
			synchronized (v) {
				s = "Wert " + Math.random();
				v.addElement(s);
				System.out.println(this.getName() + " Produzent erzeugte " + s);
				v.notify();
			} // Ende des kritischen Bereiches

			// Sleep um ggf. den Thread zu verz�gern

			 try {
			 	System.out.println("Notify");
				 Thread.sleep((int) (10000 * Math.random()));
			
			 } catch (InterruptedException e) {
			
			 }
		}
	}
}
