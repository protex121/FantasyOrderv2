package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water08Tile extends Tile {
    
    public Water08Tile(int id) {
        super(Assets.water08, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}