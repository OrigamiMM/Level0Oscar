import javax.swing.JFrame;

public class LeagueInvaders {

	LeagueInvaders() {

		jfram = new JFrame();

	}

	static public final int w = 500;
	static public final int h = 800;
	JFrame jfram;
	GamePanel obj = new GamePanel();

	public static void main(String[] args) {
		LeagueInvaders L = new LeagueInvaders();
		L.setup();
	}

	void setup() {
		jfram.add(obj);
		jfram.setSize(w, h);
		jfram.setVisible(true);
		jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfram.addKeyListener(obj);
		obj.startgame();
	}
}
