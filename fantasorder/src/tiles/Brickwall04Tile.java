package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Brickwall04Tile extends Tile {
    
    public Brickwall04Tile(int id) {
        super(Assets.brickwall04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
