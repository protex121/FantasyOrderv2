package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class ClosedpotTile extends Tile {
    
    public ClosedpotTile(int id) {
        super(Assets.closedpot, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
