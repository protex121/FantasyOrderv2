package entities.unit;

import fantasorder.Handler;
import fantasorder.gfx.Animation;
import fantasorder.gfx.Assets;
import fantasorder.gfx.AudioPlayer;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Archer extends Unit{
    private Animation anim_down,anim_up,anim_left,anim_right;
    private Handler handler;
    
    private HashMap<String,AudioPlayer> sfx;
    
    
    public Archer(Handler handler, float x,float y, int ket) {
        super(handler, x, y, Unit.width_semula, Unit.height_semula, ket);
        this.handler = handler;
        
        //collision box
        bounds.x = 13; //jarak dari pinggir grid player dri kiri
        bounds.y = 20; //jarak dari pinggir grid player dri atas
        bounds.width = 38; //lebar collision detection box
        bounds.height = 44; //tinggi collision detection box
        
        anim_down = new Animation(500, Assets.archer_down);
        anim_up = new Animation(500, Assets.archer_up);
        anim_right = new Animation(500, Assets.archer_right);
        anim_left = new Animation(500, Assets.archer_left);
<<<<<<< HEAD
=======
<<<<<<< HEAD
        
        sfx = new HashMap<String, AudioPlayer>();
        sfx.put("walk", Assets.walk);
=======
>>>>>>> origin/sion
>>>>>>> zam
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
        handler.getGameCamera().centerOnEntity(this);
    }
    
    private void getInput(){
        
        xMove = 0;
        yMove = 0;
        
<<<<<<< HEAD
        if(handler.getInput().atas){
=======
        if(game.getInput().atas){
            sfx.get("walk").play();
>>>>>>> origin/sion
            yMove = -speed;
            
        }
<<<<<<< HEAD
        else if(handler.getInput().bawah){
=======
        else if(game.getInput().bawah){
            sfx.get("walk").play();
>>>>>>> origin/sion
            yMove = speed;
            
        }
<<<<<<< HEAD
        else if(handler.getInput().kiri){
=======
        else if(game.getInput().kiri){
            sfx.get("walk").play();
>>>>>>> origin/sion
            xMove = -speed;
            
        }
<<<<<<< HEAD
        else if(handler.getInput().kanan){
            xMove = speed;
=======
        else if(game.getInput().kanan){
            sfx.get("walk").play();
            xMove = speed;       
>>>>>>> origin/sion
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
