package tiles;

import fantasorder.gfx.Assets;
import java.awt.image.BufferedImage;

public class Walls03Tile extends Tile {
    
    public Walls03Tile(int id) {
        super(Assets.walls03, id);
    }
    
    @Override
    public boolean isSolid(){
        return true;
    }
}