package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class TablerTile extends Tile {
    
    public TablerTile(int id) {
        super(Assets.tabler, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
