package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallb04Tile extends Tile {
    
    public Woodwallb04Tile(int id) {
        super(Assets.woodwallb04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
