// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bird extends Actor
{
    private GreenfootImage image1 =  new GreenfootImage("frame-1_small.png");
    private GreenfootImage image2 =  new GreenfootImage("frame-8_small.png");
    private int insectCount;

    /**
     * 
     */
    public Bird()
    {
        insectCount = 0;
        image1 =  new GreenfootImage("frame-1_small.png");
        image2 =  new GreenfootImage("frame-8_small.png");
    }

    /**
     * Act - do whatever the Bird wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeypress();
        switchImage();
        insectEaten();
        getWorld().showText("INSECTS EATEN: " + insectCount, 500, 100);
        Winning();
    }

    /**
     * 
     */
    public void Winning()
    {
        if (insectCount == 10) {
            getWorld().showText("YOU WIN LITTLE BIRD", 300, 200);
            Greenfoot.stop();
        }
    }

    /**
     * 
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
    }

    /**
     * 
     */
    public void switchImage()
    {
        if (getImage() == image1) {
            setImage(image2);
        }
        else {
            setImage(image1);
        }
    }

    /**
     * 
     */
    public void insectEaten()
    {
        if (isTouching(Insect.class)) {
            removeTouching(Insect.class);
            insectCount = insectCount + 1;
            Greenfoot.playSound("slurp.wav");
        }
    }
}
