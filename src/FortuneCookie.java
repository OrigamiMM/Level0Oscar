import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
JFrame frame = new JFrame("The Fortune Program");
JButton but = new JButton("Click for your fortune");

public static void main(String[] args) {
	FortuneCookie themessage = new FortuneCookie();
	themessage.showButton();

}
void showButton(){
	frame.setVisible(true);
	frame.add(but);
	frame.pack();
	but.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		int rand = new Random().nextInt(4);
	if (rand == 0) {
		JOptionPane.showMessageDialog(null, "The early bird get the worm");
	}if (rand == 1) {
		JOptionPane.showMessageDialog(null, "The start of riches shine upon you");
	}if (rand == 2) {
		JOptionPane.showMessageDialog(null, "Ignore previous fortunes");
	}if (rand == 3) {
		JOptionPane.showMessageDialog(null, "You are using a Java Program");
	}if (rand == 4) {
		JOptionPane.showMessageDialog(null, "Oscar finnished before you");
	}
}
}
