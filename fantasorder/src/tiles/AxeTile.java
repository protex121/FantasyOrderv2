package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class AxeTile extends Tile {
    
    public AxeTile(int id) {
        super(Assets.axe, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
