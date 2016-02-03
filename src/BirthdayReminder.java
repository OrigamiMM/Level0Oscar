
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "October 1st";
		String dadsBirthday = "Febuary 16th";
		String myBirthday = "September 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String Bday = JOptionPane.showInputDialog("Whos Birthday do you want to know?");
		// 3. Print out what the user typed
		if (Bday.equals("my")) {
			System.out.println(myBirthday);
		} else if (Bday.equals("mom")) {
			System.out.println(momsBirthday);
		} else if (Bday.equals("dad")) {
			System.out.println(dadsBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I dont remember that birthday");
		}

		// 4. if user asked for "mom"
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}