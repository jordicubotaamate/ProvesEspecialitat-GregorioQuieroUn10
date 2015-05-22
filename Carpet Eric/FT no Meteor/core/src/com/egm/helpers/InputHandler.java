package com.egm.helpers;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.egm.objects.Natsu;


public class InputHandler implements InputProcessor {
	
	private Natsu natsu;
	private Stage stage;
	
	public InputHandler(Natsu natsu, Stage stage) {
		   this.natsu = natsu;
		   this.stage = stage;
		   
	}
	public InputHandler( Stage stage) {
		   this.stage = stage;
		   
	}
	
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub	
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		//arrastrar
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
