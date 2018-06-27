package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Swordrack1Tile extends Tile {
    
    public Swordrack1Tile(int id) {
        super(Assets.swordrack1, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
