package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class SackTile extends Tile {
    
    public SackTile(int id) {
        super(Assets.sack, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
