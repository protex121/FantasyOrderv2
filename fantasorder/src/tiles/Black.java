package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Black extends Tile {
    
    public Black(int id) {
        super(Assets.black, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
