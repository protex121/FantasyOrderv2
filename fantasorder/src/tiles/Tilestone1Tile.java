package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Tilestone1Tile extends Tile {
    
    public Tilestone1Tile(int id) {
        super(Assets.tilestone1, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
