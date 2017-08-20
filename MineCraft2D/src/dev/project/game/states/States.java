package dev.project.game.states;

import java.awt.Graphics;

import dev.project.game.Handler;

public abstract class States {
	
			public static States currentState = null;
			
			public static void SetState(States state){
				currentState = state;
			}
			
			public static States getState(){
				return currentState;
			}
	
			protected Handler handler;
			
			public States(Handler handler){
				this.handler = handler;
			}
			
			public abstract void update();
			
			public abstract void render(Graphics g);
		
}
