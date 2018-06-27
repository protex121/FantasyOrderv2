package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BottleTile extends Tile {
    
    public BottleTile(int id) {
        super(Assets.bottle, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
