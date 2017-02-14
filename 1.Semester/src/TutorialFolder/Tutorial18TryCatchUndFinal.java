package TutorialFolder;
import javax.swing.JOptionPane;
public class Tutorial18TryCatchUndFinal {

	public static void main(String[] args) {
		{
			
		}
		String input = JOptionPane.showInputDialog(null, "Kiro wie alt biste denn ?");
		
		try		//1versuche..
		{
				
			int alter = Integer.parseInt(input); // 2hier wird die eingabe Input in ein Integer "geparset"
			JOptionPane.showMessageDialog(null, "Du bist.. " + alter + "Jahre alt!");	
		}	
		catch(Exception e)	//3der catch(fangen) sagt aus: was passieren soll wenn try nicht funktioniert! 
							//4ein variable alter wurde erstellt indem der String Input in ein Integer umgewandelt wurde!
		{					
			JOptionPane.showMessageDialog(null, "du schlingel hast keine zahl eingegeben! return!");	
							//5wenn aber der benutzer ein buchstabe eingibt, dann ist das nicht der alter ! 
			
		}
	
		finally	//was soll passieren, wenn der try oder catch funktioniert hat?
		{
			JOptionPane.showMessageDialog(null, "Das Programm ist nicht abgestürzt!");
		}
		
	
	
	}

}
