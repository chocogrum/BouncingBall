import javax.swing.JFrame;

public class BallPanelTest extends JFrame
{

	BallPanel ballPanel;
	
	public BallPanelTest()
	{
		ballPanel = new BallPanel();
		add( ballPanel );
	}

	public static void main( String args[] )
	{
		BallPanelTest bpt = new BallPanelTest();
		bpt.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		bpt.setSize( 600, 600 );
		bpt.setVisible( true );
	}
}