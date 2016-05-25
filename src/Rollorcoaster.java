import javax.swing.JOptionPane;

public class Rollorcoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you in inches?");
	int Height1 = Integer.parseInt(height);
	if (Height1>=48) {
		JOptionPane.showMessageDialog(null, "You are tall enough to ride");
	}if (Height1<48) {
		JOptionPane.showMessageDialog(null, "GROW UP");
	}if (Height1>96) {
		JOptionPane.showMessageDialog(null, "You too tall");
	}
}
}
