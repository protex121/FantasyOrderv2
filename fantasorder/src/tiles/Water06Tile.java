package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water06Tile extends Tile {
    
    public Water06Tile(int id) {
        super(Assets.water06, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
