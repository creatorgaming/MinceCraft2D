package dev.project.game.gfx;

import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	public static BufferedImage PutImage(String path){
		
		try 
		{
			return ImageIO.read(ImageLoader.class.getResourceAsStream(path));
		} 
		
		catch (IOException e) 
		{
				e.printStackTrace();
				System.exit(0);
		}
			return null;
	}

}
