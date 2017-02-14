package diverseTest;
import java.io.*;
import java.lang.*;
public class RekursionFilePfad {

	public static void main(String[] args) throws IOException{
		
		String path = "C:\\Users\\Sefa\\Desktop";
		File f = new File(path);
		rekursiv(f);
		
//		System.out.println(f.getParent());
//		f = new File(f.getParent());
//		System.out.println(f.getParent());
//		f = new File(f.getParent());
//		System.out.println(f.getParent());
	
	}
	public static void rekursiv(File f){
		if(f.getAbsolutePath() == "C:\\"){
			System.out.println(f.getAbsolutePath());
			
		}else{
			f.getParent();
			rekursiv(f);
		}
	}
	
	
	
	
}
