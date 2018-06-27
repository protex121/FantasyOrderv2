package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodenroof01Tile extends Tile {
    
    public Woodenroof01Tile(int id) {
        super(Assets.woodenroof01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
