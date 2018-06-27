package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodenroof02Tile extends Tile {
    
    public Woodenroof02Tile(int id) {
        super(Assets.woodenroof02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
