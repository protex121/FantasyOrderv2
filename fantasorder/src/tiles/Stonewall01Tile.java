package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Stonewall01Tile extends Tile {
    
    public Stonewall01Tile(int id) {
        super(Assets.stonewall01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
