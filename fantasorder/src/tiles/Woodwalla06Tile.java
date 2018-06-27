package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla06Tile extends Tile {
    
    public Woodwalla06Tile(int id) {
        super(Assets.woodwalla06, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
