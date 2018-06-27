package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walll05Tile extends Tile {
    
    public Walll05Tile(int id) {
        super(Assets.walll05, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
