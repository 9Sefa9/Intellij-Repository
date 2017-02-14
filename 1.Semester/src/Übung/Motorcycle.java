package Übung;

public abstract class Motorcycle extends Fahrzeug {

	public Motorcycle(float speed) {
		//super.speed = speed würde nicht funktionieren, da speed private ist.   es müsste protected sein oder getter und setter verwenden !
		super(speed);
	}

	public float get_speed() {
		return super.getSpeed();
	}

	public float num_wheels() {
		super.setNumWheels(2);
		return super.getNumWheels();
		
	}
}
