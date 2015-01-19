// Module 23, Exercise 1
// Graham Thomas
// RepaintTimer.java
// decides how often a panel is repainted

/* Write a program that bounces a blue ball inside a JPanel. The ball should begin moving with a mousePressed event. When the ball hits the edge of the JPanel, it should bounce off the edge and continue in the opposite direction. The ball should be updated using a Runnable. */

// import required classes
import javax.swing.JPanel;

public class RepaintTimer implements Runnable
{
	private JPanel repaintPanel; // panel to repaint
	private int sleepTime; // time to wait between repaints

	// constructor
	public RepaintTimer( JPanel panel, int time )
	{
		repaintPanel = panel; // set the panel to be repainted
		sleepTime = time; // set the sleep time
	} // end constructor
	
	// main code to be run
	public void run()
	{
		// loop continuously until user exits the program
		while( true )
		{
			try
			{
				Thread.sleep( sleepTime ); // sleep for a while
				repaintPanel.repaint(); // repaint the panel
			}
			catch( InterruptedException exception )
			{
				// InterruptedException caught
				System.out.println( "Interrupted exception in RepaintTimer" );
			} // end catch block
		} // end while loop
	} // end method run
} // end class RepaintTimer