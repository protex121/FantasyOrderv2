package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BoxcarrotTile extends Tile {
    
    public BoxcarrotTile(int id) {
        super(Assets.boxcarrot, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
