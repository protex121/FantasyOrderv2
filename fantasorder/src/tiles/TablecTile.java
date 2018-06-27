package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class TablecTile extends Tile {
    
    public TablecTile(int id) {
        super(Assets.tablec, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
