package com.egm.objects;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;


public class Natsu {
	private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;
    
    private int width;
    private int height;
    
    private Polygon areaColision;
    
    private boolean isAlive;
    
    public Natsu(float x, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, height);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 0);
        areaColision = new Polygon();
        isAlive = true;
    }
    
    public void update(float delta) {

       

        if (velocity.x > 200) {
            velocity.x = 200;
        }

        position.add(velocity.cpy().scl(delta));
        
        // Set the circle's center to be (9, 6) with respect to the bird.
        // Set the circle's radius to be 6.5f;
        
        
        //boundingCircle.set(position.x + 9, position.y + 6, 6.5f);
        
        // Rotate counterclockwise
       /* if (velocity.y < 0) {
            rotation -= 600 * delta;

            if (rotation < -20) {
                rotation = -20;
            }
        }

        // Rotate clockwise
        if (isFalling() || !isAlive) {
            rotation += 480 * delta;
            if (rotation > 90) {
                rotation = 90;
            }
        }*/
        
        

    }
    
    public void moveRight() {
    	if (isAlive) { 
    	       
    	       velocity.x = +140;
    	}
    }
    public void moveLeft() {
    	if (isAlive) { 
    	       
    	       velocity.x = -140;
    	}
    }
    
    public float getX(){
    	return this.position.x;
    }
    public float getY(){
    	return this.position.y;
    }
}
