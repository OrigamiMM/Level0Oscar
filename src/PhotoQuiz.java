 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String apple = "http://www.costumecollection.com.au/img/6/8/apple-costume-c674114c.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component appel; 
		// 3. use the "createImage()" method below to initialize your Component
appel = createImage(apple);

		// 4. add the image to the quiz window
quizWindow.add(appel);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ans = JOptionPane.showInputDialog("What color is this?");
		// 7. print "CORRECT" if the user gave the right answer
if (ans.toLowerCase().equals("red")) {
	JOptionPane.showMessageDialog(null, "Correct");
} else {
	JOptionPane.showMessageDialog(null, "Incorrect");

}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(appel);
		// 10. find another image and create it (might take more than one line of code)
String Banan = "http://images.halloweencostumes.com/products/8224/1-1/plus-size-banana-costume.jpg";
Component b;
b = createImage(Banan);
		// 11. add the second image to the quiz window
quizWindow.add(b);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String ans2 = JOptionPane.showInputDialog("What Color is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if (ans2.toLowerCase().equals("yellow")) {
	JOptionPane.showMessageDialog(null, "Correct");
} else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
quizWindow.remove(b);
// 10. find another image and create it (might take more than one line of code)
String Grap = "http://thumbnail.image.rakuten.co.jp/@0_gold/acomes/cabinet/9115.jpg";
Component G;
G = createImage(Grap);
// 11. add the second image to the quiz window
quizWindow.add(G);
// 12. pack the quiz window
quizWindow.pack();
G.addMouseMotionListener(null);
String ans3 = JOptionPane.showInputDialog("What Color is this?");
if (ans3.toLowerCase().equals("purple")) {
JOptionPane.showMessageDialog(null, "Correct");
} else {
JOptionPane.showMessageDialog(null, "Incorrect");
}
quizWindow.remove(G);

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





