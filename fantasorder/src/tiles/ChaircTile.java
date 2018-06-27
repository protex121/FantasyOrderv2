package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class ChaircTile extends Tile {
    
    public ChaircTile(int id) {
        super(Assets.chairc, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
