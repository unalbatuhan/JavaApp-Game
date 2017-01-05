import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (Batuhan UNAL) 
 * @version (1.0)
 */
public class FlappyBird extends Actor
{
    //int dy = 0;
    //int g = 1;
    double dy = 0;
    double g = 1.3;
    double BOOST_SPEED = -15;
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //setLocation(getX(), getY() + dy);
        setLocation (getX(), (int) (getY() + dy));
        //Bir boruya dokunursak, oyunu bitecek.
        if(getOneIntersectingObject(Pipe.class) != null){
        //GameOver gameOver = new GameOver();
        //getWorld().addObject(gameOver, getWorld() .getWidth() /2, getWorld() .getHeight()/2);
        //Greenfoot.stop();
        displayGameOver();
        }
        
        //rotateFlappyBird();
        setLocation (getX(), (int) (getY() + dy));
        //Kullanıcı yukarı ok tuşuna basarsa, Flappy Bird yukarı doğru fırlar.
        if(Greenfoot.isKeyDown("up") == true)
        {
            //dy = dy + g;
            //dy = -15;
            dy = BOOST_SPEED;

        }
     
        
        //FlappyBird dünyadan düşerse Game Over! oyun biter.
        
        if (getY() > getWorld().getHeight())
        {
        //System.out.println("Game Over!");
        displayGameOver();
        }  
          dy = dy + g;     
        
               
    } 
    private void displayGameOver(){
    GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld() .getWidth() /2, getWorld() .getHeight()/2);
        Greenfoot.stop();
    }
}
