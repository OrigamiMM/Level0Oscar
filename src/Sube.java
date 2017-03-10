import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Sube {

	public static void main(String[] args) {
		String sides = JOptionPane.showInputDialog(null, "How long do you want the sides?");
		int sidees = Integer.parseInt(sides);
		Drawsquare(sidees);
	}

	static void Drawsquare(int length) {
		Robot r2d3 = new Robot();
		r2d3.setSpeed(10);
		r2d3.penDown();
		for (int i = 0; i < 4; i++) {
			r2d3.turn(90);
			r2d3.move(length);
		}
		r2d3.turn(30);
		r2d3.move(length/2);
		r2d3.turn(-30);
		for (int i = 0; i < 2; i++) {
			r2d3.turn(90);
			r2d3.move(length);
		}
		r2d3.turn(30);
		r2d3.move(length/2);
		r2d3.turn(150);
		r2d3.move(length);
		r2d3.turn(30);
		r2d3.move(length/2);
	}
}