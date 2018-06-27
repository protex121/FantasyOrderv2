package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walll02Tile extends Tile {
    
    public Walll02Tile(int id) {
        super(Assets.walll02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
