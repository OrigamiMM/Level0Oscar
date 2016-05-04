 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
		String answer = JOptionPane.showInputDialog("Guess my number from 0-100"); 
			
		int s = Integer.parseInt(answer);
			if (s == random) {
			JOptionPane.showMessageDialog(null, "congratualations, you guessed it");
		}else if (s < random) {
			JOptionPane.showMessageDialog(null, "Its a higher number");
		}else if (s > random) {
			JOptionPane.showMessageDialog(null, "Its a lower number");
		}	
			
		}JOptionPane.showMessageDialog(null, "You Lose");

				

		// 12. tell them they lose
	}

}

