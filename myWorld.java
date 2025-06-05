import greenfoot.*;  
import java.util.Random;

public class MyWorld extends World
{
    private int pisangTimer = 0;
    private int bomTimer = 0;
    private int score = 0;
    
    public MyWorld()
    {   
        super(600, 400, 1); 
        
        Monyet m = new Monyet();
        addObject(m, getWidth() / 2, getHeight() - 60);
        
        showScore();
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
        
        showScore();
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
    
    public void addScore() {
        score++;
    }
    
    private void showScore() {
        showText("Score Lu :" + score, 60, 20);
    }
    
    public void showGameOver() {
        showText("Kasian Lu monyet", getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
    }   
}
