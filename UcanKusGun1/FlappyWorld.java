import greenfoot.*;
//import java.awt.Image;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (Batuhan UNAL) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int PIPE_SPACING = 150;
    int score = 0;
    int FIRST_PIPE = 240;
    Score scoreObj = null;

    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //Renk Ayarları
        setPaintOrder( GameOver.class, Score.class, FlappyBird.class, Pipe.class);
        
        //FlappyBird nesnesi olsuturuldu.
        FlappyBird flappy = new FlappyBird();
        
        //flappy word class ına eklendi.
        addObject (flappy, 100, getHeight()/2 );
        
        // Score göstermek için nesne oluşturuldu
         scoreObj = new Score();
        scoreObj.setScore(0);
        addObject(scoreObj, 100, 100);
        
    }
    public void act()
    {
    pipeCounter++;
    //System.out.println(counter);
    if (pipeCounter % 100 == 0){
        createPipes();
        
        //Boru nesnesi oluşturuldu
        //Pipe pippy = new Pipe();
        //GreenFootImage image = pippy.getImage();
       // addObject(pippy, getWidth(), getHeight()/2 + image.getHeight()-20);        
    //System.out.println(counter);
    //counter = 0;
    }
    
    if (pipeCounter >= FIRST_PIPE)
    {
        if (flappyCounter % 100 == 0){
        score++;  
        scoreObj.setScore(score);
        //System.out.println(score);
    }    
    flappyCounter++;
    //System.out.println(score);
    }
    
    }
    
    private void createPipes()
    {
        //Boru nesnesi oluşturuldu.
    Pipe topPipe = new Pipe();
    Pipe botPipe = new Pipe();
    }
}
