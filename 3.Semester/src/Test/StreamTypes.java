package Test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
// so sieht es aus, wenn man den einfachen try catch verwendet
public class StreamTypes {

	public static void main(String[] args){
		try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("G:/Users/Progamer/Desktop/test.txt"))){

			
			out.write(80);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}
}
