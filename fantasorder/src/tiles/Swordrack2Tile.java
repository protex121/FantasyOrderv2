package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Swordrack2Tile extends Tile {
    
    public Swordrack2Tile(int id) {
        super(Assets.swordrack2, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
