package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla05Tile extends Tile {
    
    public Woodwalla05Tile(int id) {
        super(Assets.woodwalla05, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
