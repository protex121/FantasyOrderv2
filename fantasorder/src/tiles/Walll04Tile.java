package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walll04Tile extends Tile {
    
    public Walll04Tile(int id) {
        super(Assets.walll04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
