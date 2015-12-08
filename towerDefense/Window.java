package towerDefense;

import javax.swing.JFrame;

public class Window extends JFrame{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Window(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//end program on close
		this.setExtendedState(MAXIMIZED_BOTH);//full screen
		this.setVisible(true);
	}

	public void repaint(){//called on refresh
		
	}
}
