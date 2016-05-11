import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
			int randomNumber = new Random().nextInt(5);
			System.out.println(randomNumber);
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "nice uniform man...Oscar has a better one tho");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "you have a great shirt...Oscar shirt noice");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "Your memes are cool... but Oscar's are dank");
			} else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "you g8 m8");
			} else if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "you deserve a high five");
			}
		}

		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
