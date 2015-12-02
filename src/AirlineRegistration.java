// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String Firstname = JOptionPane.showInputDialog("Enter your first name");
		String Lastname = JOptionPane.showInputDialog("Enter your last name");
		String Dest = JOptionPane.showInputDialog("Enter your destination");
		String Birthday = JOptionPane.showInputDialog("Enter Date of birth MM/DD/YY");
		String Gender = JOptionPane.showInputDialog("Enter your Gender M/F/Other");
        
	    System.out.println(Lastname + " / " + Firstname + " (" + Birthday + ", " + Gender + ")" + "\n" + "Traveling to: " + Dest);
	}
}






