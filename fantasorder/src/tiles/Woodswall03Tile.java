package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodswall03Tile extends Tile {
    
    public Woodswall03Tile(int id) {
        super(Assets.woodswall03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
