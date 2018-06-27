package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla07Tile extends Tile {
    
    public Woodwalla07Tile(int id) {
        super(Assets.woodwalla07, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
