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
    boolean keyPressed = false;
    public void act()
    {   
        if (Greenfoot.mouseClicked(null) || Greenfoot.isKeyDown("space") && !keyPressed){
            isTop = !isTop;
            keyPressed = true;
        }
        if (keyPressed && !Greenfoot.isKeyDown("space"))
        {
            keyPressed = false;
        }
        if (isTop)
            setLocation(100, 100);
        else
            setLocation(100, 300);
    }
    
}
