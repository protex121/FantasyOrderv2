package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class ElixirbTile extends Tile {
    
    public ElixirbTile(int id) {
        super(Assets.elixirb, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
