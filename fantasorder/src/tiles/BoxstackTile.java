package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BoxstackTile extends Tile {
    
    public BoxstackTile(int id) {
        super(Assets.boxstack, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
