package entities.unit;

import fantasorder.Handler;
import fantasorder.gfx.Animation;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Priest extends Unit{
    private Handler handler;
    private Animation anim_down,anim_up,anim_left,anim_right;
    
    public Priest(Handler handler, float x,float y) {
        super(handler,x, y, Unit.width_semula, Unit.height_semula);
        this.handler = handler;
        
        //collision box
        bounds.x = 13; //jarak dari pinggir grid player dri kiri
        bounds.y = 20; //jarak dari pinggir grid player dri atas
        bounds.width = 38; //lebar collision detection box
        bounds.height = 44; //tinggi collision detection box
        
        anim_down = new Animation(500, Assets.priest_down);
        anim_up = new Animation(500, Assets.priest_up);
        anim_right = new Animation(500, Assets.priest_right);
        anim_left = new Animation(500, Assets.priest_left);
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

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrAnimFrame(), (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
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
