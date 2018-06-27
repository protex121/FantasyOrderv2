
package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodenwall01Tile extends Tile {
    
    public Woodenwall01Tile(int id) {
        super(Assets.woodenwall01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
