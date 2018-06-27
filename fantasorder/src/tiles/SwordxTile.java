package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class SwordxTile extends Tile {
    
    public SwordxTile(int id) {
        super(Assets.swordx, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
