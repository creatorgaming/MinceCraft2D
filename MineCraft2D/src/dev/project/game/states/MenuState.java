package dev.project.game.states;

import java.awt.Graphics;

import dev.project.game.Handler;
import dev.project.game.gfx.Assets;
import dev.project.game.ui.ClickListener;
import dev.project.game.ui.UIImageButton;
import dev.project.game.ui.UIManager;

public class MenuState extends States {

	private UIManager uiManager;
	
	public MenuState(Handler handler){
		
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(300, 300, 128, 64, Assets.btn_start, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				States.SetState(handler.getGame().gameState);
			}
			
		}));
	}

	@Override
	public void update() {
		uiManager.update();
		
		// Temporary Code To Directly Jump Into The Game
//		handler.getMouseManager().setUIManager(null);
//		States.SetState(handler.getGame().gameState);
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

}
