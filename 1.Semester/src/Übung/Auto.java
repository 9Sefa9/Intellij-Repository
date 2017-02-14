package Übung;

public class Auto extends Fahrzeug {

	public Auto(float speed) {
		super(speed);
	}

	public float getSpeed() {
		return super.getSpeed();

	}

	public int numWheels() {
		super.setNumWheels(4);
		return super.getNumWheels();
	}
}
