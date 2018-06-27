package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class TeapotTile extends Tile {
    
    public TeapotTile(int id) {
        super(Assets.teapot, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
