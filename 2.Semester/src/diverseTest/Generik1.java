
public class Generik1 {
	public static void main(String[] args){
		Generik2<String> gen = new Generik2<String>("te");
		gen.setName("Adim Sefa");
		String test = gen.getName();
		System.out.println(test);
	}
}
