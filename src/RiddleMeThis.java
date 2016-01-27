import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = (0);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String answer = JOptionPane.showInputDialog("Why did the chicken cross the road");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("To get to the other side")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score = 0+1;
} else {
JOptionPane.showMessageDialog(null, "Wrong! it is 'To get to the other side'" );
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}
