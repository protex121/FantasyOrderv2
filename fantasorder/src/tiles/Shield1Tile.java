package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Shield1Tile extends Tile {
    
    public Shield1Tile(int id) {
        super(Assets.shield1, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
