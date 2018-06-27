package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class ElixirrTile extends Tile {
    
    public ElixirrTile(int id) {
        super(Assets.elixirr, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
