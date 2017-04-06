import javax.swing.JFrame;

public class LeagueInvaders {
	final int w = 500;
	final int h = 800;
	JFrame jfram = new JFrame();
	GamePanel obj = new GamePanel();
public static void main(String[] args) {
	LeagueInvaders L = new LeagueInvaders();
	L.setup();
}
void setup(){
	jfram.add(obj);
	jfram.setSize(w,h);
	jfram.setVisible(true);
	jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfram.addKeyListener(obj);
	obj.startgame();
}
}
