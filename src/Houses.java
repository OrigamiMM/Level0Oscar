import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	static Tortoise r2d3 = new Tortoise();

	public static void main(String[] args) {
		
		r2d3.setSpeed(6);
		r2d3.setX(5);
		r2d3.setY(440);
		for (int i = 0; i < 10000; i++) {
			String sizee = JOptionPane.showInputDialog(null, "What size house do you want?");
			String Color = JOptionPane.showInputDialog(null, "What Color you need breh \n Red, Blue, or Black");
			String Ruuf = JOptionPane.showInputDialog(null, "Whould you like a pointed roof or flat roof?");
			DrawHouse(sizee, Color, Ruuf);
		}

	}

	static void DrawHouse(String height, String Colour, String Roof) {
		int Size = 0;
		if (height.equalsIgnoreCase("Large")) {
			Size = 250;
		}
		if (height.equalsIgnoreCase("Medium")) {
			Size = 120;
		}
		if (height.equalsIgnoreCase("Small")) {
			Size = 60;
		}
		if (Colour.equals("red")) {
			r2d3.setPenColor(Color.red.darker());
		}if (Colour.equalsIgnoreCase("Blue")) {
			r2d3.setPenColor(Color.blue.brighter());
		}if (Colour.equalsIgnoreCase("Black")) {
		r2d3.setPenColor(Color.BLACK);
		}
		r2d3.move(Size);
		if (Roof.equalsIgnoreCase("Pointed")||Roof.equalsIgnoreCase("Point")) {
			r2d3.turn(60);
		r2d3.move(20);
		r2d3.turn(60);
		r2d3.move(20);
		r2d3.turn(60);
		}else{
			r2d3.turn(90);
			r2d3.move(30);
			r2d3.turn(90);
		}
		
		r2d3.move(Size);
		r2d3.turn(-90);
		r2d3.setPenColor(Color.green.darker());
		r2d3.move(35);
		r2d3.turn(-90);
		r2d3.setPenColor(Color.BLACK.darker());
	}
}
