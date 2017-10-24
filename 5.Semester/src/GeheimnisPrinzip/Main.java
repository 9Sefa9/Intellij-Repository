
public class Main {

	public static void main(String[] args) {
		
		NuclearReactor reactor = new NuclearReactor();
		reactor.setTemperature(500);
		reactor.runReactor();
		reactor.setTemperature(1200);
		reactor.runReactor();	
		
		System.out.println("===============");
		
		BadNuclearReactor badReactor = new BadNuclearReactor();
		badReactor.coreTemperature = 500;
		badReactor.runReactor();
		badReactor.coreTemperature = 1200;
		badReactor.runReactor();
		
		System.out.println("===============");
		
		BadNuclearReactor2SubClass badReactor2 = new BadNuclearReactor2SubClass();
		badReactor2.setTemperature(500);
		badReactor2.runReactor();
		badReactor2.superPowerMode(); 
		badReactor2.runReactor();		
		badReactor2.superPowerMode(); 
		badReactor2.runReactor();	
	
		
	}

}
