import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	GamePanel() {
		time = new Timer(1000 / 60, this);
		manager.addObject(ship);
		tFont = new Font("Arial", Font.PLAIN, 48);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	String score1;
	Timer time;
	Font tFont;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg; 
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	RocketShip ship = new RocketShip(250, 700, 50, 50, 5);
	ObjectManager manager = new ObjectManager();

	void updateMenuState() {

	}

	void updateGameState() {
		manager.update();
		manager.manageEnemies();
		manager.checkCollision();
			if (ship.isAlive == false) {
			currentState = END_STATE;
			manager.reset();
			ship = new RocketShip(250, 700,50,50,5);
			manager.addObject(ship);
		}
	int score = manager.getScore();
	score1 = String.valueOf(score);
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.ORANGE);
		g.setFont(tFont);
		g.drawString("LEAGUE INVADERS", 20, 300);
		g.drawString("Press Enter to play", 40, 550);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 800);
		manager.draw(g);
		g.setColor(Color.ORANGE);
		g.setFont(tFont);
		g.drawString(score1, 350, 50);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.ORANGE);
		g.setFont(tFont);
		g.drawString("GAME OVER", 75, 400);
		g.drawString("Press Enter to restart", 20, 600);
	
		g.drawString(score1, 225, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
			manager.setScore(0);
		}

		this.repaint();
	}

	void startgame() {
		time.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("something");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("something1");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == END_STATE) {
				currentState = MENU_STATE;
			} else if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			} else if (currentState == GAME_STATE) {
				currentState = END_STATE;
			}
		}if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(ship.x+20, ship.y, 10, 10));
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("something2");
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down = false;
		}
	}
}
