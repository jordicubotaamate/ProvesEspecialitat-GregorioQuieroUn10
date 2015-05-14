package com.egm.screens;

import com.egm.gameworld.GameRenderer;
import com.egm.gameworld.GameWorld;
import com.egm.zbhelpers.InputHandler;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;


public class GameScreen implements Screen {
	
	private GameWorld world;
	private GameRenderer renderer;
	private float runTime = 0;
	
	public GameScreen() {
		float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, (int) gameHeight, midPointY);
        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

	@Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");     
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");        
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");       
    }

    @Override
    public void dispose() {
        // Leave blank
    }

}