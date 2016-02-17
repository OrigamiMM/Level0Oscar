import javax.swing.JOptionPane;

public class Insulter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "what is your name?");
		if (name.equals("Malik")) {
			speak(name + " is dumb");
		} else if(name.equals("Jackson")) {
speak(name + " is mediocre");
		}else if (name.equals("Armondo")) {
			speak( name + " is bad at jokes");
		}else {
			speak( name +" is bad");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
