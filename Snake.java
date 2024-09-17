import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Enemy you must avoid as the bear.
 * 
 * @author Ethan
 * @version 9/17/2024
 */
public class Snake extends LoopingObject
{
    public Snake() {
        GreenfootImage img = getImage();
        img.mirrorHorizontally();
    }
    
    public void onCollide() {
        sadFace sadFace = new sadFace();
        World world = getWorld();
        world.addObject(sadFace, 300, 200);
        
        List<LoopingObject> objs = world.getObjects(LoopingObject.class);
        world.removeObjects(objs);
    }
    
    public void onReset() {
        speed--;
    }
}
