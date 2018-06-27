package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WallIFill extends Tile {
    
    public WallIFill(int id) {
        super(Assets.wallifill, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
