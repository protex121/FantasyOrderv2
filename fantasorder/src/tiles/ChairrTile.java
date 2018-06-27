package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class ChairrTile extends Tile {
    
    public ChairrTile(int id) {
        super(Assets.chairr, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
