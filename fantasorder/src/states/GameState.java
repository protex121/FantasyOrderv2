package states;

import entities.unit.Archer;
import entities.unit.Priest;
import entities.unit.Unit;
import entities.unit.Warrior;
import fantasorder.Game;
import fantasorder.Handler;
import fantasorder.gfx.Assets;
import java.awt.Graphics;
import tiles.Tile;
import world.World;

public class GameState extends State{
    private Unit a; // ini nanti yang dimainkan bisa pindah ke object unit dulu
    private World world;
    
    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "mapdesa.txt"); //load Map dari file TXT
        handler.setWorld(world);
        a = new Warrior(handler, 100, 100);
    }
    
    @Override
    public void tick() {
        world.tick();
        a.tick();
    }

    @Override
    public void render(Graphics g) {
        
        /*disini adalah bagian cetak mencetak bagian istilahnya panel nah a itu = player bisa diganti UNIT dulu
            tiles adalah bagian gambar petak nya map
        */
        
       world.render(g);
       a.render(g);
    }
    
}
