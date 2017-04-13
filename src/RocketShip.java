import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject{
int x;
int y;
int width;
int height;
RocketShip(int x1, int y1, int w1, int h1){
	x= x1;
	y= y1;
	width = w1;
	height = h1;
}
void update(){

}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);

}
}
