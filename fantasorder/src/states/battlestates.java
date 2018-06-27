package states;

import entities.unit.Archer;
import entities.unit.Unit;
import fantasorder.Game;
import fantasorder.Handler;
import fantasorder.gfx.Assets;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class battlestates extends State{

    private Button[] options;
    private int currSelection;
    
    Unit a;
    
    public battlestates(Handler handler) {
        super(handler);
        a = new Archer(handler,100,100,0);
    }
    
    
    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
        
    }
    
    
}
