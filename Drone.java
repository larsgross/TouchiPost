import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drone extends Actor
{
    GifImage droneAnimation = new GifImage("drone.gif"); //Erzeugen eines Objektes für die Animation
    /**
     * Act - do whatever the Drone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Abruf der Methode
        droneAnimation();
    }
    
    private void droneAnimation(){
        setImage(droneAnimation.getCurrentImage()); //Setze das Gif
    
    }
}
