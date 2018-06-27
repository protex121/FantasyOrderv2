package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BtableTile extends Tile {
    
    public BtableTile(int id) {
        super(Assets.btable, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
