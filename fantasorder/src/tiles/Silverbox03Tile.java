package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Silverbox03Tile extends Tile {
    
    public Silverbox03Tile(int id) {
        super(Assets.silverbox03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
