import javax.swing.JOptionPane;

public class World_Domination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String Answer = JOptionPane.showInputDialog("Do you know how to code m8?" + "\n" + "Type Yes or No");
		
		// 2. If they say "yes", tell them they will rule the world.
		if ( Answer.equals("Yes" )) {
			JOptionPane.showMessageDialog(null, "Then you will rule the WORLD!");
		}
		if ( Answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then you will rule the world");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
		JOptionPane.showMessageDialog(null, "Good luck washing dishes then.");	
		}
		
	}
}
