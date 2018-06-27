package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WallICorr extends Tile {
    
    public WallICorr(int id) {
        super(Assets.wallicorr, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
