import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer time = new Timer(1000/60,this);
GameObject gobj = new GameObject();
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	gobj.update();
	this.repaint();
}
void startgame(){
	time.start();
}
public void paintComponent(Graphics g){
	gobj.draw(g);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("something");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("something1");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("something2");
}
}
