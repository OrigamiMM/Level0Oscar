import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CustomGreeter implements ActionListener {
JFrame frame = new JFrame();
JPanel pan =  new JPanel();
JButton nameB = new JButton("ENTER NAME");
JButton theg = new JButton("GET GREETING");
String name = "Someone Amazing";
	public static void main(String[] args) {
		CustomGreeter g = new CustomGreeter();
		g.setup();
	}
	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(pan);
		pan.add(nameB);
		pan.add(theg);
		frame.pack();
		nameB.addActionListener(this);
		theg.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == nameB){
name = JOptionPane.showInputDialog("What is you name?");
		}else {
		JOptionPane.showMessageDialog(null, "Hello " + name);
		}
	}
}
