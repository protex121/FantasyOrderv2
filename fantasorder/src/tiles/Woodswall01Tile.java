package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodswall01Tile extends Tile {
    
    public Woodswall01Tile(int id) {
        super(Assets.woodswall01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
