package states;

import entities.unit.Archer;
import entities.unit.Unit;
import fantasorder.Game;
import fantasorder.gfx.Assets;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class battlestates extends State{

    private int currSelection;
    
    Unit a;
    
    public battlestates(Game game) {
        super(game);
        a = new Archer(game,100,100);
    }
   
    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        
    }
    
    
}
