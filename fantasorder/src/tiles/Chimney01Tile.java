package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Chimney01Tile extends Tile {
    
    public Chimney01Tile(int id) {
        super(Assets.chimney01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
