package Test;

public class GameObject {

	protected double x,y,z;
	protected double gravity;
	protected double speed;
	
	public void setGravitation(double gravity){
		this.gravity = gravity;
	
	}
	public double getGravitation(){
		return this.gravity;
	}
	public void setSpeed(double speed){
		this.speed = speed;
	}
	public double getSpeed(){
		return this.speed;
	}
	public GameObject( double x, double y, double z){
		this.x = x;
		this.y= y;
		this.z = z;
	
	}
}
