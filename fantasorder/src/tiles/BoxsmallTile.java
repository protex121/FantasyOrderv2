package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BoxsmallTile extends Tile {
    
    public BoxsmallTile(int id) {
        super(Assets.boxsmall, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
