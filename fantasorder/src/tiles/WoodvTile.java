package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WoodvTile extends Tile {
    
    public WoodvTile(int id) {
        super(Assets.woodv, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
