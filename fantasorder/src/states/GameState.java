package states;

import entities.unit.Archer;
import fantasorder.Game;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import tiles.Tile;

public class GameState extends State{

    private Archer a;
    
    public GameState(Game game) {
        super(game);
        a = new Archer(game, 100, 100);
    }

    
    @Override
    public void tick() {
        a.tick();
    }

    @Override
    public void render(Graphics g) {
       a.render(g);
       Tile.tiles[0].render(g, 0, 0);
    }
    
}
