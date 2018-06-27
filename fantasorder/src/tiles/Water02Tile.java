package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Water02Tile extends Tile {
    
    public Water02Tile(int id) {
        super(Assets.water02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}