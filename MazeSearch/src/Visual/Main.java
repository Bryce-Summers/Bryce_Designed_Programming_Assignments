package Visual;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import Implementations.MazeDisplay;


/* 
 * Basic Main Class, Written and maintained by Bryce Summers
 * Adapted on 6/5/2015 for my Maze Search Assignment.
 */

public class Main
{
	
	// The Program begins Execution at This point.
	
	public static void main(String[] args)
	{
		
		Dimension dim;

		// Full Screen.
		//= Toolkit.getDefaultToolkit().getScreenSize();
		
		// Set the GUI widow to a custom dimension.
		int w = 800;
		int h = 800;
		dim = new Dimension(w, h);
		Display panel = new MazeDisplay(dim);
		
		BufferedImage image = ImageFactory.blank(w, h);
		panel.setImage(image);
		
		iOSGUI("Maze Search Assignment", panel, dim);
	}
	

	// -- Setup the basic Operating system windows.
	public static void iOSGUI(String title, Display panel, Dimension dim)
	{	
		// Create the Frame.
		JFrame frame = new JFrame(title);
		frame.setUndecorated(true);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		double screen_w = (int)screen.getWidth()/2;
		double screen_h = (int)screen.getHeight()/2;
		
		int panel_x = (int)(screen_w - dim.getWidth()/2);
		int panel_y = (int)(screen_h - dim.getHeight()/2);
		
		frame.setLocation(panel_x, panel_y);
		
		// Determines if the widow can be resized for decorated mode.
		frame.setResizable(false);
		frame.setSize(dim);
		
		// Allows the close button to terminate the program in decorated mode.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Tell the Frame that it will be populated by the JPanel
		frame.setContentPane(panel);
		
		//The frame must be reset to visible after its content pane is changed.
		frame.setVisible(true);
	}	
}
