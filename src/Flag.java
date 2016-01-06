import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Flag {
public static void main(String[] args) {
	Tortoise.setPenColor(PenColors.Greens.Green);
	Tortoise.setPenWidth(20);
	Tortoise.penDown();
	Tortoise.move(30);
	Tortoise.penUp();
	Tortoise.turn(90);
	Tortoise.move(40);
	Tortoise.turn(90);
	Tortoise.setPenColor(PenColors.Reds.Red);
	Tortoise.setPenWidth(20);
	Tortoise.penDown();
	Tortoise.move(30);
}
}
