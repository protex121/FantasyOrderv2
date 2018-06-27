package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallb01Tile extends Tile {
    
    public Woodwallb01Tile(int id) {
        super(Assets.woodwallb01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
