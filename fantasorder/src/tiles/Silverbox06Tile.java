package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox06Tile extends Tile {
    
    public Silverbox06Tile(int id) {
        super(Assets.silverbox06, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
