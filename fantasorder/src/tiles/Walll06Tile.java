package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walll06Tile extends Tile {
    
    public Walll06Tile(int id) {
        super(Assets.walll06, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
