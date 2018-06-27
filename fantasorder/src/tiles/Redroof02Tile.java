package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Redroof02Tile extends Tile {
    
    public Redroof02Tile(int id) {
        super(Assets.redroof02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
