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
		this.setName("Tower Defense Game");//what will we call it?
		this.setResizable(false);
		this.setEnabled(true);
		//this.getContentPane() is the panel everything is on
		//put a panel for buttons and stuff and a panel for the map on there. We can also layer panels, too.
	}

	public void repaint(){//called on refresh
		
	}
}
