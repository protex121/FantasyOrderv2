package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Stonewall03Tile extends Tile {
    
    public Stonewall03Tile(int id) {
        super(Assets.stonewall03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}