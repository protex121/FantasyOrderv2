package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla01Tile extends Tile {
    
    public Woodwalla01Tile(int id) {
        super(Assets.woodwalla01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
