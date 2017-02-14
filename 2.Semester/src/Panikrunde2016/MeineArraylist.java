package Panikrunde2016;
// SCHAU DIR DIE LÖSUNG AN, DIE GESCHICKT WURDE
public class MeineArraylist {
	public int N = 0;
	public Object []array;
	
	
	public static void main(String[] args){
		MeineArraylist liste = new MeineArraylist();
		if(liste.size() != 0) 
			System.out.println("Liste muss am Anfang länge 0 haben ");
		liste.add("Kevin");
		liste.add("Max");
		System.out.println(liste.size());
		if(liste.size() !=2)
			System.out.println("Das Array soll immer so lang sein wie die Anzahl der elemente");
	
		String s = (String) liste.get(0);
		liste.remove(s);
		if(liste.size() != 1)
			System.out.println("Löschen funktioniert nicht richtig");
	
	}
	
	public MeineArraylist(){
		array = new Object[0];
	}
	public Object get(int index){
		return array[index];
	}
	public void add(Object object){
			resize((array.length+1));
		
			array[N-1] = object;
			
	}
	public void remove(Object object){
		if(N == array.length/4){
			resize(array.length/2);
			for(int i = 0; i<array.length-1; i++){
				if(array[i].equals(object))
					array[i] = null;
			}
		}
		else {
			for(int i = 0; i<array.length; i++){
				if(array[i].equals(object))
					array[i] = null;
			}		
		}
	}
	public void remove(int index){
		for(int i = 0; i<N; i++){
			// lücke entsteht
			if(i == index){
				array[i] = null;
			}
		}
	}	
	public int size(){
	// fehler nicht aray.length
		return N;
	}
	public void resize(int s){
		Object []copy = new Object[s];
		for(int i = 0; i<s; i++){
			copy[i] = array[i];
		}
		array = copy;
	}
	
}
