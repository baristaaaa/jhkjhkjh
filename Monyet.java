import greenfoot.*;  

public class Monyet extends Actor
{
    public Monyet() {
        GreenfootImage img = getImage();
        img.scale(80, 60);
        setImage(img);
    }
    public void act() {
        gerakanMonyet();
    }
    
    private void gerakanMonyet() {
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
    }
}
