package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwallb03Tile extends Tile {
    
    public Woodwallb03Tile(int id) {
        super(Assets.woodwallb03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
