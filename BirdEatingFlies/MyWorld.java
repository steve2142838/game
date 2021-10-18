// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        eagle eagle =  new eagle();
        addObject(eagle, 69, 106);
        
        Insect insect =  new Insect();
        addObject(insect, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect2 =  new Insect();
        addObject(insect2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect3 =  new Insect();
        addObject(insect3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect4 =  new Insect();
        addObject(insect4, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect5 =  new Insect();
        addObject(insect5, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect6 =  new Insect();
        addObject(insect6, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect7 =  new Insect();
        addObject(insect7, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect8 =  new Insect();
        addObject(insect8, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect9 =  new Insect();
        addObject(insect9, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Insect insect10 =  new Insect();
        addObject(insect10, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Bird bird =  new Bird();
        addObject(bird, 119, 345);
        bird.setLocation(151, 342);
        eagle.setLocation(513, 59);
    }
}
