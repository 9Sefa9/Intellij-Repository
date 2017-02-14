import java.util.*;
import java.io.*;
public class Streaming {

	public static void main(String[] args){
		try( PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
			PrintWriter pw2 = new PrintWriter("test.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/Progamer/Desktop/Tevfik.txt")));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Progamer/Desktop/Tevfik.txt"))){


			System.out.println(br.readLine());
			
			
			
			
			
			
		
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
