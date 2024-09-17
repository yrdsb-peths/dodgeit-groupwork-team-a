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
    public static boolean gameOver = false;
    static int objectRemoved = 0;
    
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
            gameOver = true;
        }
        
        if(gameOver == true)
        {
            getWorld().removeObject(this);
            objectRemoved++;
        }
        
        if(objectRemoved == 2)
        {
            objectRemoved = 0;
            gameOver = false;
        }
    }
    
    /* This method moves the banana back to the right side and
     * randomly places it at the top, middle or bottom of the world.
     */
    public void resetBanana()
    {
        while(true){
            int num = Greenfoot.getRandomNumber(3);
            if (num == 0)
            {
                setLocation (600,50);
            } else if(num == 1){
                setLocation (600, 200);
            }else{
                setLocation(600, 350);
            }
            if(!isTouching(Banana.class))
            {
                break;
            }
        }
    }
    
    public boolean isGameOver()
    {
        return gameOver;
    }
}
