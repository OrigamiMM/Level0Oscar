import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JokeTeller implements ActionListener {
	JFrame frame = new JFrame(); 
	JButton button = new JButton("The Joke One");
	JButton pnch = new JButton("Punchline");
	JPanel pannel = new JPanel();
public static void main(String[] args) {
JokeTeller tj = new JokeTeller();
tj.setup();	

}
void setup(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(pannel);
	pannel.add(button);
	pannel.add(pnch);
	frame.pack();
	button.addActionListener(this);
	pnch.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if (e.getSource() == button) {
	System.out.println("why did the robber steal soap? To get off clean");
}else {
System.out.println("This is a punchline");	
 {
	
}
}
}}
