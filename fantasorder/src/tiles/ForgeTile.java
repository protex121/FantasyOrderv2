package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class ForgeTile extends Tile {
    
    public ForgeTile(int id) {
        super(Assets.forge, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
