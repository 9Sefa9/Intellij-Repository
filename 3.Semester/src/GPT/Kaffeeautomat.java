package GPT;
//fakt ist: wenn ein Exception vorliegt, dann muss es tatsächlich genau in dieser Methode weiter geworfen werden, oder es muss direkt dort gecatched und auch dort  behandelt werden.
//beides zugleich funktioniert nicht.   Wenn es gethrowed wird, muss es in der Main Methode gecatched werden. 

public class Kaffeeautomat {
	private float kaffeepulverGramm=11;

	public void machKaffee() {
		if (kaffeepulverGramm < 12)
			try {
				throw new KaffeevorratLeerException();
			} catch (KaffeevorratLeerException e) {

				e.printStackTrace();
				try{
				throw new Exception();
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}
		kaffeepulverGramm -= 12;
	}

	public static void main(String[] args) {

		Kaffeeautomat automat = new Kaffeeautomat();	
		automat.machKaffee();
		System.out.println(automat.kaffeepulverGramm);
		
	}
}
class KaffeevorratLeerException extends Exception{
	public KaffeevorratLeerException(String s){
		System.out.print(s);
	}
	public KaffeevorratLeerException(){
		
	}
}