package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallb02Tile extends Tile {
    
    public Woodwallb02Tile(int id) {
        super(Assets.woodwallb02, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
