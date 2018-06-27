package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class WineTile extends Tile {
    
    public WineTile(int id) {
        super(Assets.wine, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
