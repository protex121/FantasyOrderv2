package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Shield2Tile extends Tile {
    
    public Shield2Tile(int id) {
        super(Assets.shield2, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
