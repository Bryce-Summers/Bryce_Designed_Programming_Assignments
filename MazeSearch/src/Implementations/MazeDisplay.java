package Implementations;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import Interfaces.Grid;
import Visual.Display;

/*
 * Written by Bryce Summers on 6/5/2015.
 */

public class MazeDisplay extends Display
{

	Grid maze;
	
	// -- Constructor.
	public MazeDisplay(Dimension dim) 
	{
		super(dim);
		
		// FIXME: Please Implement this initialization.
		maze = null;
	}

	// Every time the user selects two locations, this program should do a search between the points.
	@Override
	public void onMouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	
	// Color the grid based on the latest search.
	// BLACK --> Wall.
	// GRAY --> Visited.
	// RED --> Start or end location.
	// GREEN --> On found path.
	public void drawGrid(Grid grid)
	{
		BufferedImage image = getImage();
		Graphics g = image.getGraphics();
		int w = image.getWidth();
		int h = image.getHeight();
		
		// Clear the Screen.
		g.setColor(Color.WHITE);
		g.fillRect(0,  0, w, h);
		
		// Implement Grid Drawing here...
	}
}
