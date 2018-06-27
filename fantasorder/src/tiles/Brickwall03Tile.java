package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Brickwall03Tile extends Tile {
    
    public Brickwall03Tile(int id) {
        super(Assets.brickwall03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
