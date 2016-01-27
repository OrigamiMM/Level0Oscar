import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

public class TriangleShell {

	Robot OA = new Robot();

	void go() {

		OA.setSpeed(10);
		int size = (50);
		OA.setPenColor(PenColors.Purples.DarkViolet);
		for (int i = 0; i < 60; i++) {

			size = size + 10;
			drawTriangle(size);
			OA.turn(6);
			if (i == 30) {
				OA.setPenColor(PenColors.Yellows.Gold);
			}
		}
	}

	private void drawTriangle(int length) {
		OA.penDown();
		for (int i = 0; i < 3; i++) {
			OA.move(length);
			OA.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
