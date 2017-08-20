package dev.project.game.entities.statics;

import dev.project.game.Handler;
import dev.project.game.entities.Entity;

public abstract class StaticEntity extends Entity{
	
	public StaticEntity(Handler handler, float x, float y, int width, int height){
		super(handler, x, y, width, height);
	}
}
