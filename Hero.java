import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main player character
 * 
 * @author Ethan
 * @version 13 September, 2024
 */
public class Hero extends Actor
{
    int heroLocation = 1;
    boolean keyPressed = false;
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            heroLocation++;
            if(heroLocation > 2){
                heroLocation = 0;
            }
        }
        if (Greenfoot.isKeyDown("up") && !keyPressed && heroLocation > 0){
            heroLocation--;
            keyPressed = true;
        }else if(Greenfoot.isKeyDown("down") && !keyPressed && heroLocation < 2){
            heroLocation++;
            keyPressed = true;
        }
        if (keyPressed && !Greenfoot.isKeyDown("up") && !Greenfoot.isKeyDown("down"))
        {
            keyPressed = false;
        }
        if(heroLocation == 0)
        {
            setLocation(100, 50);
        }else if(heroLocation == 1){
            setLocation(100, 200);
        }else if(heroLocation == 2){
            setLocation(100, 350);
        }
    }
}
