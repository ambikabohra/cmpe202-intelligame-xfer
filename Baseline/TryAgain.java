import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TryAgain extends Button
{
    GameManager gm = GameManager.getInstance();
	public void act() 
	{
		if (Greenfoot.mouseClicked(this)){
		    gm.run();
		}
			
	}    
}
