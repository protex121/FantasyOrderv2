package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class TombTile extends Tile {
    
    public TombTile(int id) {
        super(Assets.tomb, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
