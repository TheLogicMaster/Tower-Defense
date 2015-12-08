package towerDefense;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class TowerMain extends JPanel implements Runnable {
	private static final long serialVersionUID = 8291911686213150373L;
	public static boolean running = false;
	
	public static void main(String[] args) {
		start();

		
	}

	public void init() {
		Window.createWindow();
		Window.frame.addKeyListener(new KeyInput());

	}
	
	public static synchronized void start() {
		running = true;
		Thread thread = new Thread(new TowerMain());
		thread.start();
		
	}
	
	@Override
	public void run() {
		init();
		long then = System.nanoTime();
		while(running) {
			long now = System.nanoTime();
			if(now - then >= 16666667) {
				then = System.nanoTime();
				Window.frame.repaint();
				
			}
			now = System.nanoTime();
			
		}
		
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillRect(0, 0, Window.width, Window.height);
		
	}
	
}
