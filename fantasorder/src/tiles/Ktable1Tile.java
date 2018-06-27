package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Ktable1Tile extends Tile {
    
    public Ktable1Tile(int id) {
        super(Assets.ktable1, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
