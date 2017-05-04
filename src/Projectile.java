import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
int x;
int y;
int w;
int h;
Projectile(int x1, int y1, int w1, int h1){
	x= x1;
	y= y1;
	w = w1;
	h = h1;
}
int speed = 10;
void update(){
	y= y-speed; 
	if(y<0){
		isAlive = false; 
	}
}
void draw(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(x, y, w, h);
}
}
