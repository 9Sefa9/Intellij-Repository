package diverseTest;


import java.util.*;
import java.lang.*;
import java.io.*;

public class Bomb {

	public static void main(String[] args) throws IOException{
		String PfadEingang;
		Scanner eingabe = new Scanner(System.in);
		BufferedWriter bw;
		Random r;
		
		try{
			System.out.println("Bitte pfad eingeben:> ");
			PfadEingang = eingabe.nextLine();
			
			bw = new BufferedWriter(new FileWriter(PfadEingang));
			
			r = new Random();
			long i=0; 
			while(i<4681523645L){
				
				bw.write(new Integer(r.nextInt(20)).toString()+"\n");
				++i;
			}
			
			bw.flush();
			bw.close();
			
			
		}finally{
			System.out.println("Fertig.");
		}
		
	}
}

