
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int number = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(number);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "What is your quetion pesant");
	// 5. If the random number is 0
if(number == 0){
	JOptionPane.showMessageDialog(null, "Yes pesant");
}else if(number == 1){
	JOptionPane.showMessageDialog(null, "no pesant");
}else if( number == 2){
	JOptionPane.showMessageDialog(null, "Maybe you should ask google");
}else if(number == 3){
	JOptionPane.showMessageDialog(null, "Sleep...I need");
}
	

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
}
	

}

