package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Stonewall02Tile extends Tile {
    
    public Stonewall02Tile(int id) {
        super(Assets.stonewall02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}