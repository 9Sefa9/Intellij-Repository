package Exceptions.Exceptions;

import java.io.*;

public class FileEx {
	static public void openFile1(String path) {
		try {
			FileInputStream stream = new FileInputStream(path);
			System.out.println(path + " is ok"); //falls path nicht gefunden wurde, chatche den Exception!
		} catch (FileNotFoundException exception) {
			System.err.println("Cannot open file: " + path); //kann die angegebene datei nciht öffnen
			exception.printStackTrace();
		}
	}

	static public void openFile2(String path) throws FileNotFoundException {
		FileInputStream stream = new FileInputStream(path);
		System.out.println(path + " is ok");
	}

	public static void main(String[] args) {
		openFile1("FileEx.java");   // try und catch
		openFile1("FileEx.jav");   // try und catch 
		
		
		try {	
			openFile2("FileEx.java");
		} catch (FileNotFoundException e) {		//throw klausel, nach dem werfen muss es gecatched werden.
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			openFile2("FileEx.jav");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}