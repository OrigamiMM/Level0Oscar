import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	GamePanel() {
		time = new Timer(1000 / 60, this);
		manager.addObject(ship);
		tFont = new Font("Arial", Font.PLAIN, 48);
	}

	Timer time;
	Font tFont;
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
		}
	manager.getScore();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.ORANGE);
		g.setFont(tFont);
		g.drawString("LEAGUE_INVADERS", 20, 400);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK.darker());
		g.fillRect(0, 0, 500, 800);
		manager.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setColor(Color.ORANGE);
		g.setFont(tFont);
		g.drawString("GAME OVER", 75, 400);
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
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(ship.x + 20, ship.y, 10, 10));
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
