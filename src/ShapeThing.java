import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ShapeThing {
public static void main(String[] args) {
String theSides = JOptionPane.showInputDialog(null, "How many sides do you want?");
String TheLength = JOptionPane.showInputDialog(null, "How long do you want the sides?");
int Sides2 = Integer.parseInt(theSides);
int Length2 = Integer.parseInt(TheLength);
	
	drawShape(Sides2,Length2);
}
static void drawShape(int sides, int length){
	Robot r2d3 = new Robot();
	r2d3.setSpeed(10);
	r2d3.penDown();
	for (int i = 0; i < sides; i++) {
	    r2d3.setPenColor(255-i, 249, 255-i);
	    r2d3.setPenWidth(3);
		r2d3.move(length-i);
		r2d3.turn(360/sides+i);
	}
	r2d3.penUp();
	r2d3.move(100);
	
}
}
