package OOP;

import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

public class Einstellungen {
	 
	protected String[] loot;
	protected String Terrain,Wetter,Schwierigkeit, Monster;
	protected int entscheidungWelt,entscheidungLaden,ChordX,ChordY,lootInhalt,arrayDigit;
	
	public Einstellungen(){
		
	}
	public void WeltErstellung(){
		//initialisierungsvorgang
		java.util.Scanner eingabe = new java.util.Scanner(System.in);
		
		System.out.print("setTerrain: ");
		Terrain = eingabe.nextLine();
		setTerrain(Terrain);
		
		System.out.print("setWetter: ");
		Wetter = eingabe.nextLine();
		setWetter(Wetter);
		
		System.out.print("setSchwierigkeit: ");
		Schwierigkeit = eingabe.nextLine();
		setSchwierigkeit(Schwierigkeit);
		
		System.out.print("setMonster: ");
		Monster = eingabe.nextLine();
		setMonster(Monster);
		
		System.out.print("SetLoot(Anzahl): ");
		arrayDigit = eingabe.nextInt();
		
		System.out.println("SetLoot: ");
		setLoot(loot);
		System.out.println("==========================================GENERATING WORLD==========================================");
		
		createWorld();
		
		eingabe.close();
	}
	
	
	public void createWorld(){
		// discover the world
		RPGWelt generateWorld = new RPGWelt(getTerrain(), getWetter(), getSchwierigkeit(), getMonster());
		
	}
	public void setLoot(String [] loot){
		java.util.Scanner eingabe = new java.util.Scanner(System.in);
		Random random = new Random();
		
		loot = new String[arrayDigit];
		for(int i= 0; i<loot.length; ++i){
			loot[i] = eingabe.nextLine();
		}
		
		lootInhalt = random.nextInt(loot.length);
		eingabe.close();
	}
	public void setWetter(String wetter){
		this.Wetter = wetter;
	}
	public void setTerrain(String terrain){
		this.Terrain = terrain;
	}
	public void setSchwierigkeit(String schwer){
		this.Schwierigkeit = schwer;
	}
	public void setMonster(String monster){
		this.Monster = monster;
	}
	
	public String getLoot(){
		return loot[lootInhalt];
	}
	public String getWetter(){
		return this.Wetter;
	}
	public String getTerrain(){
		return this.Terrain;
	}
	public String getSchwierigkeit(){
		return this.Schwierigkeit; 
	}
	public String getMonster(){
		return this.Monster;
	}
	
	
	
	
	
}
