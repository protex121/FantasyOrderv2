package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallc01Tile extends Tile {
    
    public Woodwallc01Tile(int id) {
        super(Assets.woodwallc01, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
