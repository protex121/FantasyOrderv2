package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla08Tile extends Tile {
    
    public Woodwalla08Tile(int id) {
        super(Assets.woodwalla08, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
