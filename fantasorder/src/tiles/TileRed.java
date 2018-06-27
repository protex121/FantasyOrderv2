package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class TileRed extends Tile {
    
    public TileRed(int id) {
        super(Assets.tilered, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
