package com.egm.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class AssetLoader {

	public static Texture texture, natsu0, natsu1, logoTexture;
	public static TextureRegion bg, n0, n1, logo;
	public static Skin buttonSkin;
	public static Button rButton, lButton;
	public static Table table;
	public static Stage stage;
	public static void load() {

		logoTexture = new Texture(Gdx.files.internal("data/logo.png"));
		logoTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

		logo = new TextureRegion(logoTexture, 0, 0, 656, 252);
		
		texture = new Texture(Gdx.files.internal("data/bg.png"));
		texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

		bg = new TextureRegion(texture);
		bg.flip(false, true);
		
		natsu0 = new Texture(Gdx.files.internal("data/natsu.png"));
		n0 = new TextureRegion(natsu0);
		n0.flip(false, true);

		natsu1 = new Texture(Gdx.files.internal("data/natsu.png"));
		n1 = new TextureRegion(natsu1);
		n1.flip(true, true);
		
		
		stage = new Stage();
		table = new Table();
		/*buttonSkin = new Skin(Gdx.files.internal("data/skin.json"),
		        new TextureAtlas(Gdx.files.internal("data/buttons.pack")));
		/*rButton = new Button(buttonSkin, "right");*/
		
		/*AssetLoader.rButton.addListener(new ClickListener(){
	        @Override
	        public void clicked(InputEvent event, float x, float y) {
	            System.out.println("asddf");
	        }
	    });
		lButton = new Button(buttonSkin, "left");
		table.add(lButton).size(50, 50).pad(180, 0 , 0, 70);
		table.add(rButton).size(50, 50).pad(180, 70, 0, 0);
		
		table.setFillParent(true);
		stage.addActor(table);*/
		//table.add(lButton);
		
		
	}

	public static void dispose() {
		// We must dispose of the texture when we are finished.
		texture.dispose();
		
	}



}
