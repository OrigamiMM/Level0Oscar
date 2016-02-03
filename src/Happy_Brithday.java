import javax.swing.JOptionPane;

public class Happy_Brithday {
public static void main(String[] args) {
	String Bday = JOptionPane.showInputDialog("When is your birthday?");
if (Bday.equals("02/03")) {
	JOptionPane.showMessageDialog(null, "HAPPY BIRFFDAY");
}else{
	JOptionPane.showMessageDialog(null, "HAPPY un-BIRTHDAY");
}
}
}
	
