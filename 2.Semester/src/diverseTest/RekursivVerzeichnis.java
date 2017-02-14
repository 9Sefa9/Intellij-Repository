package diverseTest;

import java.io.File;

public class RekursivVerzeichnis {
	public static String path;
	public static void main(String[] args){
		path = "D:\\Users\\Progamer\\Desktop";
		File f = new File(path);
		rekursiv(f,path);
		
	}
	public static void rekursiv(File f, String p){
		int i=0;
		char [] array = new char[p.length()];
		File array[i] = (File) new File(p);
		
		if(array[i].getAbsoulutePath() != "D:\\"){
			i++;
			rekursiv(f,f.getParent());
		}else System.out.println(f.getAbsolutePath());
	}
}
