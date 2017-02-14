package Übung;

public class Fahrzeug {
	private float speed;
	private int NumWheels;

	public Fahrzeug(float geschwindigkeit) {
		this.speed = geschwindigkeit;
	}

	public float getSpeed() {
		return this.speed;
	}

	public void setNumWheels(int rad) {
		this.NumWheels = rad;
	}

	public int getNumWheels() {
		return this.NumWheels;
	}

	public static void main(String[] args) {
	}

}