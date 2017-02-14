package ÜbungenLösungen;
public class Main {

	// hier wird spaeter das Modul der pipeline ausgewaehlt
  private static Filter f;

  public static void main(String[] args) {
  
    int[] numbers = new int[0];
    boolean first = true;
    
    // durchlauft alle Argumente (args)
    for (String arg : args) {
    
      if (isNumber(arg)) {
      	// zahl -> wird an das Array numbers angefuegt
        numbers = extendArray(numbers, Integer.parseInt(arg));
      } else if (first) {
      	// erstes pipeline Modul nimmt das numbers Array
        processPipeline(arg, numbers);
        first = false;
      } else {
      	// alle weiteren Module nehmen das Array aus dem letzten Modul
        processPipeline(arg, f.getOutput());
      }
      
    }
  }

	/*
	 *  Ueberprueft, ob der String eine Zahl ist
	 */
  public static boolean isNumber(String s) {
    char z;
    for (int i = 0; i < s.length(); i++) {
      z = s.charAt(i);
      if ((z < '0' || z > '9') && z != '-') {
        return false;
      }
    }
    return true;
  }

	/*
	 *  Fuegt dem Array toExtend ein weiteres Element hinzu (number)
	 */
  public static int[] extendArray(int[] toExtend, int number) {
    int[] temp = new int[toExtend.length + 1];
    for (int i = 0; i < toExtend.length; i++) {
      temp[i] = toExtend[i];
    }
    temp[temp.length - 1] = number;
    return temp;
  }

	/*
	 *  Uebergibt das Array an die pipeline, je nach "mode" durch
	 *  switch-case an das richtige Modul
	 */
  public static void processPipeline(String mode, int[] numbers) {
    switch (mode.toLowerCase()) {
    case "max":
      f = new Max();
      f.setInput(numbers);
      f.execute();
      break;
    case "min":
      f = new Min();
      f.setInput(numbers);
      f.execute();
      break;
    case "sort":
      f = new Sort();
      f.setInput(numbers);
      f.execute();
      break;
    case "sum":
      f = new Sum();
      f.setInput(numbers);
      f.execute();
      break;
    case "printer":
      Printer p = new Printer();
      p.setInput(numbers);
      p.print();
      break;
    }
  }

}
