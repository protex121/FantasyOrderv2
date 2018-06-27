package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallc04Tile extends Tile {
    
    public Woodwallc04Tile(int id) {
        super(Assets.woodwallc04, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
