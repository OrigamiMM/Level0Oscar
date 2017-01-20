import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ROOOOOOOOOLLLL implements ActionListener {
	JFrame frame = new JFrame();
	JPanel pan =  new JPanel();
	JButton but = new JButton("Roll Dice");
	int number;
public static void main(String[] args) {
	ROOOOOOOOOLLLL g = new ROOOOOOOOOLLLL();
    g.setup();
    int number = new Random().nextInt(6);
}
void setup(){
	frame.add(pan);
	pan.add(but);
	frame.pack();
	but.addActionListener(this);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
