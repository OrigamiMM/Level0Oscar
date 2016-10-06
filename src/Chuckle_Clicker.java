import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	JButton but = new JButton();
	JButton but2 = new JButton();

	public static void main(String[] args) {
		Chuckle_Clicker OA = new Chuckle_Clicker();
		OA.makebuttons();

	}

	void makebuttons() {
		JFrame fam = new JFrame();
		JPanel pan = new JPanel();
		fam.setVisible(true);
		fam.add(pan);
		pan.add(but);
		pan.add(but2);
		but.setText("Punchline");
		but2.setText("Joke");
		but.addActionListener(this);
		but2.addActionListener(this);
		fam.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == but){
			JOptionPane.showMessageDialog(null, "Need an ark? I noah Guy");
	}if(e.getSource()== but2){
		JOptionPane.showMessageDialog(null, "I want to tell a good science joke, but all good ones argon");
	}
}
}
