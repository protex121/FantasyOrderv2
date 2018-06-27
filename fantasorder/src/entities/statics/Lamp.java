package entities.statics;

import fantasorder.Handler;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import tiles.Tile;


public class Lamp extends StaticEntity{

    public Lamp (Handler handler, float x, float y) {
        super(handler, x, y, Tile.tilewidth, Tile.tileheight * 3);
        
        //collision box
        bounds.x = 10;
        bounds.y = (int)(height/3);
        bounds.width = width -20;
        bounds.height =  (int)(height - height/3);
        
    }
    @Override
    public void tick(){
        
    }
    
    public void render(Graphics g){
        g.drawImage(Assets.lamp,(int)(x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()),width,height,null);
    }
}
