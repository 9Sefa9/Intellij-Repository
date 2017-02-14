package Panikrunde2016;

public class Rekursion {
	// zar zor yaptim... gine ögren

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println("Die summe lautet: " + sum(a));
	}

	public static int sum(int zahl) {
		if (zahl <= 0)
			return zahl;
		else {
			return zahl + sum(zahl - 1);
		}

	}
}
