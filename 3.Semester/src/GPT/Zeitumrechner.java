package GPT;

public class Zeitumrechner {

		public static void main(String[] args){
		
			//erstmal minuten, stunden, tage und jahre umrechnen
			int sek = Integer.parseInt(args[0]);
			
			int sek1 = 1;
			int min = (60*sek1);
			int std = (60*min);
			int tag = (24*std);
			int jah = (365*tag);
					
			//Anschließend Modulo nehmen für die restlichen, übrig gebliebenen sekunden/minuten usw.
			int jaherg = sek/(tag)/365;
			int tagerg = (sek%jah)/(tag);
			int stderg = (sek%tag)/(std);
			int minerg = (sek%std)/(min);
			int sekerg = (sek%min*sek1);
			
			System.out.println(sek+" Sekunden sind, "+jaherg+" Jahr(e), "+tagerg+"Tag(e), "+stderg+" Stunden(n), "+ minerg +"Minute(n), "+ sekerg+" Sekunden");

			 
		}
}
