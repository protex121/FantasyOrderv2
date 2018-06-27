package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Stonewall04Tile extends Tile {
    
    public Stonewall04Tile(int id) {
        super(Assets.stonewall04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}