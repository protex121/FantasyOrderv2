package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Chimney02Tile extends Tile {
    
    public Chimney02Tile(int id) {
        super(Assets.chimney02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
