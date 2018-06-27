package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Redroof01Tile extends Tile {
    
    public Redroof01Tile(int id) {
        super(Assets.redroof01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}