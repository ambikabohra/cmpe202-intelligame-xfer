import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuitButton extends Button implements Invoker
{
    /**
     * Act - do whatever the QuitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	
	public void act() {
		invoke();
	}
	
private Command QuitCommand;
	
	public void invoke(){
		if(Greenfoot.mouseClicked(this))
			QuitCommand.execute();
	}
	
	public void setCommand(Command c){
		this.QuitCommand=c;
	}
	
	
   /* public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
             Greenfoot.stop();
        }
       
    }*/    
}