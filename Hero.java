import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main player character
 * 
 * @author Ethan
 * @version 13 September, 2024
 */
public class Hero extends Actor
{
    boolean isTop = true;
    
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
            isTop = !isTop;
        
        if (isTop)
            setLocation(100, 100);
        else
            setLocation(100, 300);
    }
}
