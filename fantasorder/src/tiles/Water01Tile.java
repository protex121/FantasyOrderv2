package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water01Tile extends Tile {
    
    public Water01Tile(int id) {
        super(Assets.water01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}