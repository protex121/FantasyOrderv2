package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallc03Tile extends Tile {
    
    public Woodwallc03Tile(int id) {
        super(Assets.woodwallc03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
