import java.awt.Graphics;

public class TronObject {
	TronObject() {

	}

	int x;
	int y;
	int width;
	int height;

	void update() {
x = x+10;
y= y+10;
	}

	void draw(Graphics g) {
		g.fillRect(x, y, 20, 15);
	}
}
