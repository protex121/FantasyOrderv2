package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Brickwall02Tile extends Tile {
    
    public Brickwall02Tile(int id) {
        super(Assets.brickwall02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
