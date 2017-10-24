// final class -> no subclass possible
public final class NuclearReactor {
	
	// private property -> no change from outside/subclass possible
	private double coreTemperature=200;
	final double maxTemp=1000;
	
	
	void setTemperature(double targetTemp){
		if (targetTemp <= maxTemp) {
			this.coreTemperature = targetTemp;
		} else {
			System.out.println("Warning: Requested temperature exceeds maximum.");
		}
	}
	
	void runReactor(){
		if (this.coreTemperature <= maxTemp) {
			System.out.println("Reactor Power Production: "+coreTemperature*100+" Watts.");
		} else {
			System.out.println("Reactor Explosion!!!!!!!!!!");
		}
	}
	
	
}
