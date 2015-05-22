package com.egm.screens;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.egm.ftnometeor.FTnoMeteor;
import com.egm.helpers.AssetLoader;
import com.egm.screens.GameScreen;
import com.egm.TweenAccessors.SpriteAccessor;


public class SplashScreen implements Screen{
	
	TweenManager manager;
	SpriteBatch batcher;
	Sprite sprite;
	FTnoMeteor game;
	
	public SplashScreen(FTnoMeteor game) {
		this.game = game;
	}

	@Override
	public void show() {
		//Cargamos el logo en el Sprite
		sprite = new Sprite(AssetLoader.logo);
		sprite.setColor(1, 1, 1, 0);
		
		float width = Gdx.graphics.getWidth();
		float height = Gdx.graphics.getHeight();
		float desiredWidth = width * .8f;
		float scale = desiredWidth / sprite.getWidth();
		
		//Colocamos el logo
		sprite.setSize(sprite.getWidth() * scale, sprite.getHeight() * scale);
		sprite.setPosition((width / 2) - (sprite.getWidth() / 2), ((height+60) / 2)
				- (sprite.getHeight() / 2) );
		setupTween();
		batcher = new SpriteBatch();
		
	}
	
	private void setupTween() {
		Tween.registerAccessor(Sprite.class, new SpriteAccessor());
		manager = new TweenManager();
		
		//Cuando termine la interpolacion llamamos a la siguiente pantalla
		TweenCallback cb = new TweenCallback() {
			@Override
			public void onEvent(int type, BaseTween<?> source) {
				game.setScreen(new GameScreen());
			}
		};
		
		
		Tween.to(sprite, SpriteAccessor.ALPHA, 0.8f).target(1)				//Empezamos el Tween sobre el Sprite con el tipo ALPHA 
																			//con delay de 0.8 s y el valor de inicio será 1
				.ease(TweenEquations.easeInOutQuad).repeatYoyo(1, .4f) 		//usaremos una interpolacion cuadrática (?) 
																				//que se repite en yoyo con transiciones de 0.4
				.setCallback(cb).setCallbackTriggers(TweenCallback.COMPLETE) 	//Le dice al Callback que ha terminado
				.start(manager); //especifica el manager
	}

	@Override
	public void render(float delta) {
		//printamos el logo con fondo blanco
		manager.update(delta);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batcher.begin();
		sprite.draw(batcher);
		batcher.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	
}
