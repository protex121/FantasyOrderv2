package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water07Tile extends Tile {
    
    public Water07Tile(int id) {
        super(Assets.water07, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
