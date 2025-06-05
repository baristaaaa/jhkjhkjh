import greenfoot.*;  

public class Bom extends Actor
{
    public Bom(){
        GreenfootImage img = getImage();
        img.scale(60, 60);
        setImage(img);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 3);
        if (getY() >= getWorld().getHeight() -1) {
            getWorld().removeObject(this);
        }
        
        if (isTouching(Monyet.class)) {
            showGameOver();
        }
    }
    
    private void showGameOver() {
        World World = getWorld();
        World.showText("Kasian Lu monyet", World.getWidth() / 2, World.getWidth() / 2);
        Greenfoot.stop();
    }
}
