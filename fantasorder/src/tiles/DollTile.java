package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class DollTile extends Tile {
    
    public DollTile(int id) {
        super(Assets.tilered, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
