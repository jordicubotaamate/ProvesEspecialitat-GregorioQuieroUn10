package com.egm.gameworld;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.egm.helpers.AssetLoader;
import com.egm.objects.Natsu;

public class GameWorld {
	
	private Natsu natsu;
	private Stage stage;

	public GameWorld(int midPointY) {
        //Inicializamos los objetos que interaccionan con el usuario, el Scroller del mundo(en caso de que lo haya y el suelo(66 px + mid)
    	natsu = new Natsu(0, 18, 43);
    	stage = AssetLoader.stage;
    }

    public void update(float delta) {
        // Add a delta cap so that if our game takes too long
        // to update, we will not break our collision detection.

       if (delta > .15f) {
            delta = .15f;
        }

        //actualizamos  los objetos
       natsu.update(delta);
        //Comprobamos colisiones

    }
    
    public Natsu getNatsu(){
    	return natsu;
    }
    
    public Stage getStage(){
    	return stage;
    }
}
