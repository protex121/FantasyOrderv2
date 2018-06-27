package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walls04Tile extends Tile {
    
    public Walls04Tile(int id) {
        super(Assets.walls04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
