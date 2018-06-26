package entities.unit;

import fantasorder.Game;
import fantasorder.gfx.Animation;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Archer extends Unit{
<<<<<<< HEAD
    
    public Archer(Game game, float x,float y) {
        super(game, x, y, Unit.width_semula, Unit.height_semula);
=======

    private Animation anim_down,anim_up,anim_left,anim_right;
    private Game game;
    
    
    public Archer(Game game, float x,float y) {
        super(x, y, Unit.width_semula, Unit.height_semula);
        this.game = game;
        
        anim_down = new Animation(500, Assets.archer_down);
        anim_up = new Animation(500, Assets.archer_up);
        anim_right = new Animation(500, Assets.archer_right);
        anim_left = new Animation(500, Assets.archer_left);
>>>>>>> origin/sion
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

    @Override
    public void render(Graphics g) {
<<<<<<< HEAD
        g.drawImage(Assets.player1, (int)(x - game.getGameCamera().getxOffset()), (int)(y - game.getGameCamera().getyOffset()), width, height, null);
=======
        g.drawImage(getCurrAnimFrame(), (int)x, (int)y, width, height, null);
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
>>>>>>> origin/sion
    }
    
}
