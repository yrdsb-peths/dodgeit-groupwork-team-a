import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Power-up that halves the snake's speed and returns it back to the start when collected.
 * 
 * @author Ethan 
 * @version 9/17/2024
 */
public class Banana extends LoopingObject
{
    int timerMax = 120 * 4;
    int timer = timerMax;
    int speed = -10;
    
    public void act() {
        if (timer <= 0)
            doMovement();
        else
            timer--;
    }
    
    public void onCollide() {
        World world = getWorld();
        List<Snake> objs = world.getObjects(Snake.class);
        
        for (Snake s : objs) {
            s.resetObject();
            s.speed++;
            s.speed /= 2;
        }
        resetObject();
    }
    
    public void onReset() {
        timer = timerMax;
    }
}
