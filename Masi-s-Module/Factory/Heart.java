package MrMonkey;

/*
Heart.java :: Extra snack for Level3
Created by: Masi Nazarian
Date: 11/10/2017
*/

public class Heart extends ConcreteSubjectObserverPattern implements ISnack {
	GreenfootSound sound = new GreenfootSound("banana.wav");  
	public Heart() {}  
	public void act() {}
}
