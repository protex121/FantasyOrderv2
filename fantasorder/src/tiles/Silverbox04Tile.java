package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox04Tile extends Tile {
    
    public Silverbox04Tile (int id) {
        super(Assets.silverbox04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
