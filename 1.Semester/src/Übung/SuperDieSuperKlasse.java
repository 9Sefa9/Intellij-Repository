package ‹bung;

import java.util.Scanner;
import java.io.*;

public class SuperDieSuperKlasse {
	
	private int auto;
	private int motor;

	public SuperDieSuperKlasse(int Auto, int Motor) {
		this.auto = Auto;
		this.motor = Motor;
	}
	public static void main(String[] args){
		SuperAufruf‹bung test1 = new SuperAufruf‹bung(3);
		SuperDieSuperKlasse test2 = new SuperDieSuperKlasse(2, 3);
		System.out.println(test1);
		System.out.println(test2);
		
	}
	public String toString(){
		return "das ist auto: "+auto+"das ist Motor"+motor+"";
	}
}
