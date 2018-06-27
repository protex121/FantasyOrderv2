package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Tilestone2Tile extends Tile {
    
    public Tilestone2Tile(int id) {
        super(Assets.tilestone2, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
