import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * if one level is completed, calls new screen
 * displays score of the level completed
 * 
 * @author Ambika Bohra
 * @version 10/31/2017
 */

public class LevelCompletedWorld extends World
{
    //Constructor with reference to score from previous level
    public LevelCompletedWorld()
    {    
        super(800, 600, 1); 
        // ScoreScreen ss = (ScoreScreen)getObjects(ScoreScreen.class).get(0);
        GreenfootImage im = new GreenfootImage("background1.png");
        setBackground(im);
        /*
        //sets screen for displaying score
        GreenfootImage imscore = new GreenfootImage(140, 55);
        Font font = new Font("Comics Sans MS", true, false, 40);
        
        imscore.setColor(Color.BLACK);
        imscore.setTransparency(50);
        imscore.fill();
        
        imscore.setColor(Color.WHITE);
        imscore.setFont(font);
        imscore.drawString(score+"", 30, 45);
        setImage(imscore);
        */
        addObject(new Level(), 400, 300);
        addObject(new TryAgain(), 380, 320);
        addObject(new BacktoMenu(), 380, 380);
        addObject(new QuitButton(), 380, 440);
    }
    
    public void act() {}
}
