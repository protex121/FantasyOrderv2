package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class CoatTile extends Tile {
    
    public CoatTile(int id) {
        super(Assets.coat, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
