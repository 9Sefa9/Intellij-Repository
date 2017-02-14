package TutorialFolder;
import javax.swing.JOptionPane;

public class Tutorial17ConfirmUndMessageDialog {

	public static void main(String[] args) {
		
		int beziehung	=	JOptionPane.showConfirmDialog(null, "willst du mit mir gehen?");
		//1ein dialog mit ja nein abbrechen hat 0,1,2 also drei möglichkeiten!
		System.out.println(beziehung); // wird genutzt, um zu sehen, welche zahlen die "beziehung" enthält! aber wie oben schon gesagt gibt es nur drei möglichkeiten ja nein abbrechen!
		
		//beziehung speichern wir in showMessageDialog ! das was in der klammer steht ist der Message.
		
		if (beziehung == 0)	//die Taste JA gibt 0 aus ! also stellen wir eine If bedingung mit : falls beziehung 0, dann..
		{
			JOptionPane.showMessageDialog(null,"ja ich will!");
		}
		else if (beziehung == 1)
		{
			JOptionPane.showMessageDialog(null,"nein ich will nicht !verzieh dich!");
		}
		else if (beziehung == 2)
		{
			JOptionPane.showMessageDialog(null,"vielleicht??");
		}
		else if (beziehung == -1)
		{
			JOptionPane.showMessageDialog(null,"X geklickt!");
			System.out.println("beendet!");
		}
	}

}
