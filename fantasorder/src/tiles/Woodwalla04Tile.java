package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla04Tile extends Tile {
    
    public Woodwalla04Tile(int id) {
        super(Assets.woodwalla04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
