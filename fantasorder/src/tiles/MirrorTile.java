package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class MirrorTile extends Tile {
    
    public MirrorTile(int id) {
        super(Assets.mirror, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
