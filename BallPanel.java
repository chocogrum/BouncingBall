import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.awt.Dimension;

public class BallPanel extends JPanel
{
	private Ball ball;
	private RepaintTimer repaintTimer;
	private ExecutorService threadExecutor;
	private int width;
	private int height;
	
	public BallPanel()
	{
		setPreferredSize( new Dimension( 400, 400 ) );
		width = ( int ) getPreferredSize().getWidth();
		height = ( int ) getPreferredSize().getHeight();
		ball = new Ball( width, height, 10 );
		repaintTimer = new RepaintTimer( this );
		threadExecutor = Executors.newCachedThreadPool();
		threadExecutor.execute( ball );
		threadExecutor.execute( repaintTimer );
		setBackground( Color.BLUE );
		setOpaque( false );
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		setBackground( Color.BLUE );
		setOpaque( false );
		Graphics2D g2d = ( Graphics2D ) g;
		
		if( ball != null )
		{
			g2d.setPaint( Color.RED );
			g2d.fill( new Ellipse2D.Double( ball.getXCoord(), ball.getYCoord(), 10, 10 ) );
		}
	}
}