import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class JustAClass implements KeyListener {
	JFrame frame = new JFrame();
public static void main(String[] args) {
	JustAClass w = new JustAClass();
	w.setup();
}
void setup(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.addKeyListener(this);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		frame.setSize(1600,900);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
