package OOP;

import java.util.*;

public class Konkatenation {

	private ArrayList<Character> alphabet = new ArrayList<Character>();
	private String wort;
	private char buchstabe;

	public Konkatenation() {

	}
	public void setAlphabet(char buchstabe){
		this.buchstabe = buchstabe;
	}
	public char getAlphabet(){
		return this.buchstabe;
	}
	public void insert(char buchstabe){
		
		this.alphabet.add(buchstabe);
	}
	public void delete(char buchstabe){
		//complexity : N
		for(int i=0; i<alphabet.size(); i++){
			if(this.alphabet.get(i) == buchstabe)				
					this.alphabet.remove(i);
		}
	}
	
	public String word(){
		return "Das entstandene Wort ist : "+this.alphabet.toString();
	}
}
