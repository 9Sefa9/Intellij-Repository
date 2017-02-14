package Test;

import java.util.Random;

public class Player extends GameObject {


	public Player(double x, double y, double z) {
		super(0,1,0);
		setGravitation(3.0);
		setSpeed(2.0);
	}
	public void PlayerMovement(){
		Random r = new Random();
		while(x<100){
		  x+=r.nextInt(100)+speed;
		System.out.println(x);
		}
	}
	
	public static void main(String[] args){
		Player player = new Player(0,1,0);
		player.PlayerMovement();
	}
}
