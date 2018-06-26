package entities.unit;

import fantasorder.Game;
import fantasorder.gfx.Animation;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Warrior extends Unit{

    private Game game;
    private Animation anim_down,anim_up,anim_left,anim_right;
    
    public Warrior(Game game, float x,float y) {
        super(game, x, y, Unit.width_semula, Unit.height_semula);
        this.game = game;
        
        anim_down = new Animation(500, Assets.warrior_down);
        anim_up = new Animation(500, Assets.warrior_up);
        anim_right = new Animation(500, Assets.warrior_right);
        anim_left = new Animation(500, Assets.warrior_left);
    }
    
    @Override
    public void tick() {
        anim_down.tick();
        anim_up.tick();
        anim_left.tick();
        anim_right.tick();
        getInput();
        move();
        game.getGameCamera().centerOnEntity(this);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player3, (int)(x - game.getGameCamera().getxOffset()), (int)(y - game.getGameCamera().getyOffset()), width, height, null);
        g.drawImage(getCurrAnimFrame(), (int)x, (int)y, width, height, null);
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
    
    public BufferedImage getCurrAnimFrame(){
        if(xMove < 0){
            return anim_left.getCurrFrame();
        }
        else if(xMove>0){
            return anim_right.getCurrFrame();
        }
        else if(yMove < 0){
            return anim_up.getCurrFrame();
        }
        else{
            return anim_down.getCurrFrame();
        }
    }
    
}
