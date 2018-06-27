package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Brickwall01Tile extends Tile {
    
    public Brickwall01Tile(int id) {
        super(Assets.brickwall01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
