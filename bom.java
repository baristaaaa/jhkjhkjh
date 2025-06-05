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

        if (isTouching(Monyet.class)) {
            MyWorld world = (MyWorld)getWorld();
            world.showGameOver();  // Panggil method dari MyWorld
            getWorld().removeObject(this);
            return;
        }

        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}
