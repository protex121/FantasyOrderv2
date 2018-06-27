package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox02Tile extends Tile {
    
    public Silverbox02Tile(int id) {
        super(Assets.silverbox01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
