package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class GrassboxTile extends Tile {
    
    public GrassboxTile(int id) {
        super(Assets.grassbox, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
