package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class KsinkTile extends Tile {
    
    public KsinkTile(int id) {
        super(Assets.ksink, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
