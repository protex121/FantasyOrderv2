package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class HelmetTile extends Tile {
    
    public HelmetTile(int id) {
        super(Assets.helmet, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
