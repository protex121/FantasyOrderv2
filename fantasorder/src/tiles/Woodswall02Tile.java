package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodswall02Tile extends Tile {
    
    public Woodswall02Tile(int id) {
        super(Assets.woodswall02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
