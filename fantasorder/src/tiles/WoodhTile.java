package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WoodhTile extends Tile {
    
    public WoodhTile(int id) {
        super(Assets.woodh, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
