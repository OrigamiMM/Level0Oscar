import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class TronPanel extends JPanel implements ActionListener, KeyListener {
	TronPanel() {
		time = new Timer(1000 / 60, this);
titleFont = new Font("Arial",Font.PLAIN,48);
	}

	Timer time;
	Font titleFont;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int CurrentState = MENU_STATE;

	void StartGame() {
		time.start();
	}

	void updateMenuState() {

	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setFont(titleFont); 
		g.drawString("TRON REBITH", 400, 300);
		g.setColor(Color.ORANGE);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 800);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.GRAY.darker());
		g.fillRect(0, 0, 800, 800);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.GRAY.brighter());
		g.fillRect(0, 0, 800, 800);
	}

	public void paintComponent(Graphics g) {
		if (CurrentState == MENU_STATE) {
			drawMenuState(g);
		} else if (CurrentState == GAME_STATE) {
			drawGameState(g);
		} else if (CurrentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (CurrentState == MENU_STATE) {
			updateMenuState();
		} else if (CurrentState == GAME_STATE) {
			updateGameState();
		} else if (CurrentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (CurrentState == END_STATE) {
				CurrentState = MENU_STATE;
			} else if (CurrentState == MENU_STATE) {
				CurrentState = GAME_STATE;
			} else if (CurrentState == GAME_STATE) {
				CurrentState = END_STATE;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Released");
	}
}
