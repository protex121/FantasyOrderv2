package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Hayroof01Tile extends Tile {
    
    public Hayroof01Tile(int id) {
        super(Assets.hayroof01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
