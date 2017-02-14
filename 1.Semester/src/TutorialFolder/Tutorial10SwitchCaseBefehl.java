package TutorialFolder;

public class Tutorial10SwitchCaseBefehl {

	public static void main(String[] args) {
		int alter = 15;
		 
        switch (alter) {
        case 15: 
        {
        	System.out.println("Minderjährig, was?");
        	break;
        }
        case 25: 
        {
            System.out.println("Werd mal erwachsen");
            break;
        }
        default: 
        {
            System.out.println("Wie alt bist du eigentlich");
            break;
        }
 

        }
	}
}
