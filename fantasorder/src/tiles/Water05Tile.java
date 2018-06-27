package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water05Tile extends Tile {
    
    public Water05Tile(int id) {
        super(Assets.water05, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
