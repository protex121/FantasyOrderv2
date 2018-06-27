package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallc02Tile extends Tile {
    
    public Woodwallc02Tile(int id) {
        super(Assets.woodwallc02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
