package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walll01Tile extends Tile {
    
    public Walll01Tile(int id) {
        super(Assets.walll01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
