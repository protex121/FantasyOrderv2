package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class HatTile extends Tile {
    
    public HatTile(int id) {
        super(Assets.hat, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
