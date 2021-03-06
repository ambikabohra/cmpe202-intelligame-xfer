import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @AMBIKA BOHRA
 * @version 2 (added music)
 */
public class PlayButton extends Button
{
    /*
     * sets home screen background music 
     * if clicked , it sets my world 
     */
    private GreenfootSound music;
    PlayButton()
    {
        music = new GreenfootSound("home.wav");   
    }
    
    public void act() 
    {
        music.playLoop();
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
            music.stop(); //stops home wrld music
        }
    }  
    
     public GreenfootSound getMusic()
  {
      return music;
  }
}
