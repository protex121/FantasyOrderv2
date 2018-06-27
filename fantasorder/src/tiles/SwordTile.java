package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class SwordTile extends Tile {
    
    public SwordTile(int id) {
        super(Assets.sword, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
