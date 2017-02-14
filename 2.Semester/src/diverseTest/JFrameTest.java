package diverseTest;

import java.awt.*;

import javax.swing.*;

public class JFrameTest {
	
	//Frame bedeuted Fenster
	//Panel : Standard layout
	//button --> ist klar !  der Pannel muss aber einen Button adden ! siehe unten!
	public static void main(String[] args) {
		JButton button = new JButton("eiNbutton");
		JPanel panel = new JPanel( new GridLayout(1,1));
		
		JFrame test = new JFrame();
		test.setTitle("Das ist mein Test!");
		test.setSize(640, 900);
		test.setLocation(500, 400);
		test.setVisible(true);// notwendig um das Fenster sehen zu können
		button.setSize(50, 50);
		panel.add(button);
		// returned den Layout + fügt den panel hinzu
		test.getContentPane().add(panel);
	
		
	}
}
