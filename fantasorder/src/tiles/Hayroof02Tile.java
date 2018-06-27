package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Hayroof02Tile extends Tile {
    
    public Hayroof02Tile(int id) {
        super(Assets.hayroof02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
