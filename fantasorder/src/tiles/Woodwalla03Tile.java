package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Woodwalla03Tile extends Tile {
    
    public Woodwalla03Tile(int id) {
        super(Assets.woodwalla03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}
