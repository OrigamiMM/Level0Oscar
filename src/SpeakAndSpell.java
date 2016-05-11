import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak & Spell was introduced at the summer
 * Consumer Electronics Show in June 1978, making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you would make this program. Allow them to
 * code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		speak("mal lik is du mb");

		String Answer = JOptionPane.showInputDialog("What did I say?");
		if (Answer.equals("malik is dumb")) {
			JOptionPane.showMessageDialog(null, "correct");
			speak("correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
			speak("wrong");
		}
		speak("d ank io memes");
		String Answer1 = JOptionPane.showInputDialog("What did I say?");
		if (Answer1.equals("dank memes")) {
			JOptionPane.showMessageDialog(null, "correct");
			speak("correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
			speak("wrong");
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
