import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class TronPanel extends JPanel implements ActionListener{
TronPanel(){
	time = new Timer(1000/60, this); 
}
Timer time;

void StartGame(){
	time.start();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("sup");
}
}
