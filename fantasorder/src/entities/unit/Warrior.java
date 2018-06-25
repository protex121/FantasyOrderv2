package entities.unit;

import fantasorder.Game;
import fantasorder.gfx.Assets;
import java.awt.Graphics;

public class Warrior extends Unit{

    private Game game;
    
    
    public Warrior(Game game, float x,float y) {
        super(x, y, Unit.width_semula, Unit.height_semula);
        this.game = game;
    }
    
    @Override
    public void tick() {
        getInput();
        move();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player3, (int)x, (int)y, width, height, null);
    }
    
    private void getInput(){
        
        xMove = 0;
        yMove = 0;
        
        if(game.getInput().atas){
            yMove = -speed;
        }
        else if(game.getInput().bawah){
            yMove = speed;
        }
        else if(game.getInput().kiri){
            xMove = -speed;
        }
        else if(game.getInput().kanan){
            xMove = speed;
        }
        
    }
    
}
