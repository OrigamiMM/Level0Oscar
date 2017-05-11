import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject{

int Speed;
public boolean up = false;
public boolean down = false;
public boolean left = false;
public boolean right = false;
RocketShip(int x1, int y1, int w1, int h1, int Spd){
	super();
	x= x1;
	y= y1;
	width = w1;
	height = h1;
	Speed = Spd;
}
void update(){
super.update();
	if(up){
	y-=Speed;
}
if(down){
	y+=Speed;
}if(left){
	x-=Speed;
}if(right){
	x+=Speed;
}
}
void draw(Graphics g){
	g.setColor(Color.WHITE);
	g.fillRect(x, y, width, height);

}
}