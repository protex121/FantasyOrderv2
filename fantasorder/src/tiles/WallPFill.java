package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WallPFill extends Tile {
    
    public WallPFill(int id) {
        super(Assets.wallpfill, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
