package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class ArmorTile extends Tile {
    
    public ArmorTile(int id) {
        super(Assets.armor, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
