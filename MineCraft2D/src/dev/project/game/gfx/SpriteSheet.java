package dev.project.game.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	private BufferedImage Sprite;
	
	public SpriteSheet(BufferedImage Sprite)
	{
		this.Sprite = Sprite;
	}
	
	public BufferedImage crop(int x, int y, int width, int height)
	{
		return Sprite.getSubimage(x ,y , width, height);
	} 
		
}
