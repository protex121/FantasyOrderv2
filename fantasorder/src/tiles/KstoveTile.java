package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class KstoveTile extends Tile {
    
    public KstoveTile(int id) {
        super(Assets.kstove, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
