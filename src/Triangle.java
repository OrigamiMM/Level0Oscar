import org.jointheleague.graphical.robot.Robot;

public class Triangle {
	public static void main(String[] args) {
		Robot john = new Robot();
		john.setSpeed(100);
		john.penDown();
		john.setPenColor(255,0,0);
		john.move(500);
		john.turn(120);
		john.move(500);
		john.turn(120);
		john.move(500);
		System.out.println("hi");
	}
		}
