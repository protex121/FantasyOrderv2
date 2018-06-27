package states;

import fantasorder.Game;
import fantasorder.Handler;
import java.awt.Graphics;

public abstract class State {
    
    //state = class menu
    
    private static State currState = null;
    
    public static void setState(State state){
        currState = state;
    }
    
    public static State getState(){
        return currState;
    }
    
    protected Handler handler;

    public State(Handler handler) {
        this.handler = handler;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
}
