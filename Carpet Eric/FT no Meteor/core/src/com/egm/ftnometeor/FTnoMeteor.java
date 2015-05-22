package com.egm.ftnometeor;

import com.badlogic.gdx.Game;
import com.egm.helpers.AssetLoader;
import com.egm.screens.SplashScreen;

public class FTnoMeteor extends Game {
	
	
	@Override
	public void create () {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose () {
		super.dispose();
	    AssetLoader.dispose();
	}
}
