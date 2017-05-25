import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Aliens extends GameObject {
	Aliens(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
		int num = new Random().nextInt(1);
		super.update();
		if (num == 0) {
		y= y+11;
		}
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);

	}
}
