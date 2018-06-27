package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class PaperTile extends Tile {
    
    public PaperTile(int id) {
        super(Assets.paper, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
