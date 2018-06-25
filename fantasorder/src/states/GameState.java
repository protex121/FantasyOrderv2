package states;

import entities.unit.Archer;
import entities.unit.Priest;
import entities.unit.Unit;
import entities.unit.Warrior;
import fantasorder.Game;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import tiles.Tile;

public class GameState extends State{

    private Priest a; // ini nanti yang dimainkan
    
    public GameState(Game game) {
        super(game);
        a = new Priest(game, 100, 100);
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
