package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class BeerTile extends Tile {
    
    public BeerTile(int id) {
        super(Assets.beer, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
