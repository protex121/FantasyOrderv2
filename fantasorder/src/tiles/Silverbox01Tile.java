package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox01Tile extends Tile {
    
    public Silverbox01Tile(int id) {
        super(Assets.silverbox02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
