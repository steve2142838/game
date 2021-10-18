// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class eagle extends Actor
{

    /**
     * Act - do whatever the eagle wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (isAtEdge()) {
            turn(45);
        }
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }
        if (isTouching(Bird.class)) {
            removeTouching(Bird.class);
            getWorld().showText("GAME OVER!", 300, 200);
            Greenfoot.stop();
        }
    }
}
