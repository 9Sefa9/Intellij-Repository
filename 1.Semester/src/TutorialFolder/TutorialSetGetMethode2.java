package TutorialFolder;

public class TutorialSetGetMethode2 {

	public static void main(String[] args) {
		TutorialSetGetMethode jetzt = new TutorialSetGetMethode();
		
		jetzt.setTest1(10);
		System.out.println(jetzt.getTest1());
		
		// Zusammengefasst: 
		// Setter = Methode zum verändern von Instanzvariablen
		// Getter = Methode zum returnen von Instanzvariablen
		// Hilfe ? siehe hier: 
	}
/*class DatenEingabe
{
    private String KontoInhaber;
    private double KontoPassword;         
    
    public DatenEingabe()
    {
        
    }
    public void setKontoInhaber(String inhaber)
    {
       this.KontoInhaber = inhaber; 
    }
    public void setKontoPassword (double password)
    {
        this.KontoPassword = password;        
    }        
    public String getKontoInhaber()           //keine parameter bei GETTER!!
    {
        return KontoInhaber;
    }
    public double getKontoPassword()
    {
        return KontoPassword;
    }  
}

*/
}
