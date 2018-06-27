package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BreadTile extends Tile {
    
    public BreadTile(int id) {
        super(Assets.bread, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
