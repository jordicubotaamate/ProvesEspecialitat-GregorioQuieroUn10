package com.egm.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.egm.helpers.AssetLoader;
import com.egm.objects.Natsu;




public class GameRenderer {
	
	private GameWorld myWorld;
	private OrthographicCamera cam;
	private ShapeRenderer shapeRenderer;
	
	private SpriteBatch batcher;
	
	private int midPointX;
    private int gameHeight;
    
    // Game Objects
    private Natsu natsu;
    // Game Assets
    private TextureRegion bg, natsu0, natsu1;
    
    private Button rButton, lButton;
    private Stage stage;

    
    public GameRenderer(GameWorld world, int gameHeight, int midPointX) {
        myWorld = world;
        this.gameHeight = gameHeight;
        this.midPointX = midPointX;

        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, this.gameHeight);
        
        
        
        batcher = new SpriteBatch();
        // Attach batcher to camera
        batcher.setProjectionMatrix(cam.combined);

        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
        
        // Call helper methods to initialize instance variables
        initGameObjects();
        initAssets();
       
       
                

    }
    
    
    public void render(float runTime) {
    	
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        
        //mostrar objetos
        batcher.begin();
        batcher.draw(bg, 0, 0, 0, 0, 136, gameHeight, 1, 1, 0);
        
        
        batcher.draw(natsu0, natsu.getX()-(9),  natsu.getY(), 18 , 43);
        batcher.end();
        stage.act();
        stage.draw();
        
        ///Mostrar colisiones
    }
    
    private void initGameObjects() {
    	//Inicializar objetos
    	natsu = new Natsu(this.midPointX, 136, this.gameHeight-(172/4));
    }

    private void initAssets() {
       //Inicializar assets
    	bg = AssetLoader.bg;
    	natsu0 = AssetLoader.n0;
    	natsu1 = AssetLoader.n1;
    	
    	rButton = AssetLoader.rButton;
    	lButton = AssetLoader.lButton;
    	
    	stage = AssetLoader.stage;
    }

    
   

}
