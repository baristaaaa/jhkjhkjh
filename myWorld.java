import greenfoot.*;  
import java.util.Random;

public class MyWorld extends World
{
    private int pisangTimer = 0;
    private int bomTimer = 0;
    
    public MyWorld()
    {   
        super(600, 400, 1); 
        
        Monyet m = new Monyet();
        addObject(m, getWidth() / 2, getHeight() - 60);
    }
    
    public void act() {
        pisangTimer++;
        bomTimer++;
        
        if (pisangTimer % 60 == 0) {
            spawnPisang();
        }
        
        if (bomTimer % 200 == 0) {
            spawnBom();
        }
    }

    private void spawnBom() {
        int x = Greenfoot.getRandomNumber(getWidth());
        Bom b = new Bom();
        addObject(b, x, 0);
    }
    
    private void spawnPisang() {
        int x = Greenfoot.getRandomNumber(getWidth());
        Pisang p = new Pisang();
        addObject(p, x, 0);
    }
    
    
}
