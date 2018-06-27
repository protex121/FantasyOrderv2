package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox08Tile extends Tile {
    
    public Silverbox08Tile(int id) {
        super(Assets.silverbox08, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
