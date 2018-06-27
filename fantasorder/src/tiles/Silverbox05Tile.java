package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox05Tile extends Tile {
    
    public Silverbox05Tile (int id) {
        super(Assets.silverbox05, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
