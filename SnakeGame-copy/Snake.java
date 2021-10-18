import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        checkDirections();
        move(2);
        lookForApple();
        isGameOver();
    }
    
    public void checkDirections() {
        if (Greenfoot.isKeyDown("up")) {
            turn(-3);   
        }
        
        if (Greenfoot.isKeyDown("down")) {
            turn(3);   
        }
        
    }
    
    public void lookForApple() {
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
            Greenfoot.playSound("eating.wav");
        }
    }
    
    public void isGameOver() {
        if (getWorld().numberOfObjects() == 1) {
            Greenfoot.stop();
            getWorld().showText("GAME OVER", getWorld().getWidth() / 2,getWorld().getHeight() / 2);
            }
    }
}
