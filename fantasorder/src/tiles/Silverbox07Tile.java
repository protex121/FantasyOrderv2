package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox07Tile extends Tile {
    
    public Silverbox07Tile(int id) {
        super(Assets.silverbox07, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
