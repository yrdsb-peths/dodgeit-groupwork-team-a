import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Parent for objects which wrap around the screen.
 * 
 * @author Ethan 
 * @version 9/17/2024
 */
public abstract class LoopingObject extends Actor
{
    int speed = -5;
    public void act()
    {
        doMovement();
    }
    
    public void doMovement() {
        move(speed);
        
        if (getX() <= 0)
            resetObject();
        
        if (isTouching(Hero.class))
            onCollide();
    }
    
    /* This method moves the object back to the right side and
     * randomly places it at the top or bottom of the world.
     */
    public void resetObject()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0)
            setLocation(600,100);
        else
            setLocation(600, 300);
        onReset();
    }
    
    public abstract void onCollide();
    public abstract void onReset();
}
