import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{

public boolean shoot = false;
Projectile(int x1, int y1, int w1, int h1){
	super();
	x= x1;
	y= y1;
	width = w1;
	height = h1;
}
int speed = 10;
void update(){
	super.update();
	y= y-speed; 
	if(y<0){
		isAlive = false; 
	}
}
void draw(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(x, y, width, height);
}
}
