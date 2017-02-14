import java.util.*;
//Contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.event.*;
import java.awt.*;

public class RobotClass{

	public static void main(String[] a) throws AWTException {
		// Robot t = new Robot();
		Robot robot = new Robot();
//		System.out.println(MouseInfo.getPointerInfo().getLocation().getX());
//		System.out.println(MouseInfo.getPointerInfo().getLocation().getY());
		
		
		robot.getPixelColor(500, 500).toString();
		robot.mouseMove(500, 500);
		
	}

	
	
}
