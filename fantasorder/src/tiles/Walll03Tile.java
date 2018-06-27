package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walll03Tile extends Tile {
    
    public Walll03Tile(int id) {
        super(Assets.walll03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
