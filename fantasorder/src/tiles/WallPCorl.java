package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WallPCorl extends Tile {
    
    public WallPCorl(int id) {
        super(Assets.wallpcorl, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
