package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water03Tile extends Tile {
    
    public Water03Tile(int id) {
        super(Assets.water03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
