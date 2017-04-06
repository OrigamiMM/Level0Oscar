import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;

void update(){
	System.out.println("message");
	x++;
}
void draw(Graphics g){
	g.fillRect(x, y, 100, 100);
}
}
