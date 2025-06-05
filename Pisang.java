import greenfoot.*;  

public class Pisang extends Actor
{
    public Pisang() {
        GreenfootImage img = getImage();
        img.scale(80, 60);
        setImage(img);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 3);
        
        if(getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}
