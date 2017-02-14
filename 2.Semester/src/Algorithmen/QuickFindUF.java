package Algorithmen;

import java.util.*;
import java.lang.*;
import java.io.*;

public class QuickFindUF {
	private static int[] id;

	//set id of each object to itself
	public static void QuickFindUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i; 						//quasi ist der index 0 1 2 3 4 und der array dann auch 0 1 2 3 4

	}

	public static int find(int p) {				// die Find methode gibt den inhalt aus, an der Indexstelle p 
		return id[p];	
	}

	public static void union(int p, int q) {		// verbinden -> change all entries with id[p] to id[q]
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++)
			if (id[i] == pid)
				id[i] = qid;
	}

	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		
		int quf;
		int zahl1;
		int zahl2;
		
		
		System.out.println("QuickFindUF" + "(" + (quf = eingabe.nextInt()) + ")");
		QuickFindUF(quf);
		System.out.println("union"+ "("+ (zahl1=eingabe.nextInt()) +","+( zahl2=eingabe.nextInt())+")");
		union(zahl1,zahl2);
		
		
		
		for(int a : id){
			System.out.print(" "+a+" ");
		}
	}

}
