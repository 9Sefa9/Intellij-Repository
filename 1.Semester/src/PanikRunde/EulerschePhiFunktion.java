package PanikRunde;

public class EulerschePhiFunktion {
	public static void main(String[] args) {
		int p = phi(67);
		System.out.println("das ist p:" + p);
	}

	public static int phi(int a) {
		int counter = 0;
		for (int i = 0; i <= a; ++i) {
			if (GrößterGemeinsamerTeiler.ggt(i, a) == 1) {
				++counter;
			}
		}
		return counter;
	}

}
