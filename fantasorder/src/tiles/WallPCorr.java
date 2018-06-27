package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WallPCorr extends Tile {
    
    public WallPCorr(int id) {
        super(Assets.wallpcorl, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
