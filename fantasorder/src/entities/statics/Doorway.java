package entities.statics;

import fantasorder.Handler;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import tiles.Tile;

public class Doorway extends StaticEntity{
    
    public Doorway(Handler handler, float x, float y) {
        super(handler, x, y, Tile.tilewidth, Tile.tileheight);
        
        //collision box
        bounds.x = 0;
        bounds.y = (int)(height/2.2f);
        bounds.width = width;
        bounds.height =  (int)(height - height/2.2f);
        
    }
    @Override
    public void tick(){
        
    }
    
    public void render(Graphics g){
        g.drawImage(Assets.doorway,(int)(x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()),width,height,null);
    }
}
