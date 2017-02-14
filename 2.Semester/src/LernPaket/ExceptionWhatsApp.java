package LernPaket;

public class ExceptionWhatsApp {
				
	public static void einException(){
		
			try{
				System.out.println("das hier ist der 2te try aufruf");
				thrower();
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("fehler aus 2t try block");
			}
		
		
		
	}
	public static void main(String[] args){
		
		einException();
	}
	
	public static void thrower() throws SelbstErstellterException{
		int zahl1 = 5;
		int zahl2 = 6;
		if(zahl1 == zahl2)	System.out.println("11");
		else throw new SelbstErstellterException();
	}
}

