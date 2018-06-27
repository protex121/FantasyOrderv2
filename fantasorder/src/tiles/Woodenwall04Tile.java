package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodenwall04Tile extends Tile {
    
    public Woodenwall04Tile(int id) {
        super(Assets.woodenwall04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}

