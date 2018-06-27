package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class FlowerpotTile extends Tile {
    
    public FlowerpotTile(int id) {
        super(Assets.flowerpot, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
