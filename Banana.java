import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    int speed = -5;
    
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        
        if (getX() <=0)
        {
            speed--;
            resetBanana();
        }
        
        if (isTouching(Hero.class))
        {
            sadFace sadFace = new sadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    /* This method moves the banana back to the right side and
     * randomly places it at the top or bottom of the world.
     */
    public void resetBanana()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0)
        {
            setLocation (600,100);
        } else {
            setLocation (600, 300);
        }
    }
}
