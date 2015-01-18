import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.Timer; 

public class BallPanel extends JPanel
{

	public BallPanel()
	{
	
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		Graphics2D g2d = ( Graphics2D ) g;
		
		g2d.setPaint( Color.RED );
		g2d.fill( new Ellipse2D.Double( 5, 5, 100, 100 ) );
	}
}