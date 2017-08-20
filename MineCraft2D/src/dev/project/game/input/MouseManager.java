package dev.project.game.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import dev.project.game.ui.UIManager;

public class MouseManager implements MouseListener, MouseMotionListener{

	private boolean leftPressed, rightPressed;
	private int mouseX, mouseY;
	private UIManager uiManager;
	
	public MouseManager(){
		
	}

	public void setUIManager(UIManager uiManager){
		this.uiManager = uiManager;
	}
	
	// Getters And Setters
	public boolean isLeftPressed(){
		return leftPressed;
	}
	
	public boolean isRightPressed(){
		return rightPressed;
	}
	
	public int getMouseX() {
		return mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public UIManager getUiManager() {
		return uiManager;
	}

	public void setUiManager(UIManager uiManager) {
		this.uiManager = uiManager;
	}

	// Implemented Methods
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPressed = true;
		if(e.getButton() == MouseEvent.BUTTON3)
			rightPressed = true;
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPressed = false;
		if(e.getButton() == MouseEvent.BUTTON3)
			rightPressed = false;
		
		if(uiManager != null)
			uiManager.onMouseRelease(e);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
	
		if(uiManager != null)
			uiManager.onMouseMove(e);;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {

	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
