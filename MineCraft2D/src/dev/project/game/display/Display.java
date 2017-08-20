package dev.project.game.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame frame;
	public Canvas canvas; 		//changed to public [To access it in Game Class] / We can use Getter else ways 
	
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height)
	{
		this.title = title;
		this.width = width;
		this.height = height;
		
		createWindow();
	}
	
	private void createWindow()
	{
		frame  = new JFrame(title);
		frame.setSize(width, height);		// Sets Width and Height Of window
		frame.setLocationRelativeTo(null);  // Keeps Windows in Center when Open
		frame.setResizable(false);			// Can resize Windows If True
		frame.setVisible(true);				// Makes Windows Visible on Screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit Program As well as windows 
															 // when we hit CROSS button
		
		
/*	CANVAS OVER JFRAME */
		
		canvas = new Canvas();
		Dimension size = new Dimension(width, height);
		
		canvas.setPreferredSize(size);
		canvas.setMaximumSize(size);
		canvas.setMinimumSize(size);
		canvas.setFocusable(false);			// JFrame is the only the thing that has Focus
		
		frame.add(canvas);					// Add Canvas on JFrame
		frame.pack();						// Display JFrame
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
	
	public JFrame getFrame(){
		return frame;
	}
}
