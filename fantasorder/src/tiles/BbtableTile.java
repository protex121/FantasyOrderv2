package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BbtableTile extends Tile {
    
    public BbtableTile(int id) {
        super(Assets.bbtable, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
