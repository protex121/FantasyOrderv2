package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class TombrackTile extends Tile {
    
    public TombrackTile(int id) {
        super(Assets.tombrack, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
