package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water09Tile extends Tile {
    
    public Water09Tile(int id) {
        super(Assets.water09, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}