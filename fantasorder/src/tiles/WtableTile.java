package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WtableTile extends Tile {
    
    public WtableTile(int id) {
        super(Assets.wtable, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
