package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Ktable2Tile extends Tile {
    
    public Ktable2Tile(int id) {
        super(Assets.ktable2, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
