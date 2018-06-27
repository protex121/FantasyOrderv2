package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WallICorl extends Tile {
    
    public WallICorl(int id) {
        super(Assets.wallicorl, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
