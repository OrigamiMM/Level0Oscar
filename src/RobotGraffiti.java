import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class RobotGraffiti {
	
	public static void main(String[] args) {
	int Spiral = 1;
	Tortoise.setSpeed(10);
	Tortoise.setPenColor(PenColors.Blues.Blue);
	Tortoise.penDown();
	for (int i = 0; i < 360; i++) {
	Spiral++;
	Tortoise.move(Spiral);
	Tortoise.turn(1);

	}
}

}