package entities.statics;

import fantasorder.Handler;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import tiles.Tile;
public class Window extends StaticEntity{
    public Window(Handler handler, float x, float y) {
        super(handler, x, y, Tile.tilewidth, Tile.tileheight);
        
    }
    @Override
    public void tick(){
        
    }
    
    public void render(Graphics g){
        //g.drawImage(Assets.tree,(int)(x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()),width,height,null);
    }    
}
