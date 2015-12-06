package towerDefense;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window {
	public static JFrame frame = new JFrame("Tower Defense");
	public static int width, height;
	
	public static void createWindow() {
		Window.width = Toolkit.getDefaultToolkit().getScreenSize().width;
		Window.height = Toolkit.getDefaultToolkit().getScreenSize().height;

//		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TowerMain towermain = new TowerMain();
		frame.add(towermain);
		towermain.requestFocusInWindow();
//		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//		gd.setFullScreenWindow(frame);
		frame.setPreferredSize(new Dimension(800, 800));
		frame.setVisible(true);
		frame.pack();
		
	}
	
}
