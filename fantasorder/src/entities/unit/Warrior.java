package entities.unit;

import fantasorder.Handler;
import fantasorder.gfx.Animation;
import fantasorder.gfx.Assets;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Warrior extends Unit{
    private Handler handler;
    private Animation anim_down,anim_up,anim_left,anim_right;
    
    public Warrior(Handler handler, float x,float y) {
        super(handler,x, y, Unit.width_semula, Unit.height_semula);
        this.handler = handler;
        
        bounds.x = 16;
        bounds.y = 5;
        bounds.width = 32;
        bounds.height = 50;
        
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
        handler.getGameCamera().centerOnEntity(this);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrAnimFrame(), (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
        
        g.setColor(Color.red);
        g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
                (int)(y + bounds.y - handler.getGameCamera().getyOffset()),
                bounds.width, bounds.height);
    }
    
    private void getInput(){
        
        xMove = 0;
        yMove = 0;
        
        if(handler.getInput().atas){
            yMove = -speed;
        }
        else if(handler.getInput().bawah){
            yMove = speed;
        }
        else if(handler.getInput().kiri){
            xMove = -speed;
        }
        else if(handler.getInput().kanan){
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
