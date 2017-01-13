import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Survey implements ActionListener {
JFrame frame = new JFrame("Hello there");
JPanel pannel = new JPanel();
JButton but = new JButton("Respond");
JLabel label = new JLabel("The dice numbers here");
JTextField TF = new JTextField(10);
JLabel but2 = new JLabel("<-- Place bets here");
String amount = TF.getText();   
int numb1 = 1;
int numb2 = 0;
int NewAmount = 0;
int SAmount = 1000;
int x = Integer.parseInt(amount);
JLabel points = new JLabel(SAmount + " "); 
	public static void main(String[] args) {
		Survey S = new Survey();
		S.Setup();
		
		
	}
	void Setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(pannel);
		pannel.add(label);
		pannel.add(but);
		pannel.add(points);
		pannel.add(TF);
		pannel.add(but2);
		frame.pack();
		but.addActionListener(this);
	  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == but) {
	    numb1 = new Random().nextInt(6)+1;
		numb2 = new Random().nextInt(6)+1;
			label.setText(numb1 +" "+ numb2);
		}if (numb1 == numb2) {
			JOptionPane.showMessageDialog(null, "you win");
			NewAmount = SAmount + x; 
			points.setText(NewAmount1);
		}
	}
}
