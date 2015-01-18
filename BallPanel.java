import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BallPanel extends JPanel
{

	private Timer ballTimer;
	private int ballSpeed;
	private int ballX;
	private int ballY;
	private boolean forwards;

	public BallPanel()
	{
		ballSpeed = 5;
		ballTimer = new Timer( ballSpeed, new BallTimerHandler() );
		ballX = 5;
		ballY = 5;
		forwards = true;
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		Graphics2D g2d = ( Graphics2D ) g;
		
		g2d.setPaint( Color.RED );
		g2d.fill( new Ellipse2D.Double( ballX, ballY, 100, 100 ) );
		if( forwards )
		{
			if( ballX == 500 )
			{
				ballX--;
				forwards = false;
			}
			else
				ballX++;
		}
		else
		{
			if( ballX == 0 )
			{
				ballX++;
				forwards = true;
			}
			else
				ballX--;
		}
	}
	
	private class BallTimerHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent actionEvent )
		{
			repaint();
		}
	}
}