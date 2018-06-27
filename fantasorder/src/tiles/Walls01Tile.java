package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walls01Tile extends Tile {
    
    public Walls01Tile(int id) {
        super(Assets.walls01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
