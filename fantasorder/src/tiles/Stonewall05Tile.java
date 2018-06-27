package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Stonewall05Tile extends Tile {
    
    public Stonewall05Tile(int id) {
        super(Assets.stonewall05, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}