package TutorialFolder;

public class Tutorial27ArrayUndParameter {

	public static void main(String[] args) {
		int freude[] = { 2, 3, 4,5,6,7,8,9,10};
		sonnenschein(freude);

		// 3das ganze geben wir noch aus:

		for (int y : freude)
			// enhanced forschleife: y geht durch freude. Der arbeitet alle
			// elemente durch
			System.out.println(y);

	}

	public static void sonnenschein(int x[]) // 2array x wurde erstellt
	{
		for (int i = 0; i < x.length; ++i)
			x[i] += 2;		//                     x[i] = x[i] + 2   	Also: {2+2, 3+2, 4+2}	jede i te position vom array...
		// 1die position i unseres arrays X soll um 2 erhöht
		// werden.

	}

}
		// fazit: arrays können als parameter genutzt werden.
