package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla02Tile extends Tile {
    
    public Woodwalla02Tile(int id) {
        super(Assets.woodwalla02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
