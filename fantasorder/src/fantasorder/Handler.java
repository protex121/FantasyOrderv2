package fantasorder;

import fantasorder.gfx.GameCamera;
import input.Input;
import javax.net.ssl.KeyManager;
import world.World;

public class Handler {

    private Game game;
    private World worlds; //untuk peta
    
    public Handler(Game game) {
        this.game = game;
    }
    
    public Input getInput(){
        return game.getInput();
    }
    
    public GameCamera getGameCamera(){
        return game.getGameCamera();
    }
    
    public Input getKeyManager(){
        return game.getInput();
    }
    
    public int getWidth(){
        return game.getWidth();
    }
    
    public int getHeight(){
        return game.getHeight();
    }
    
    public World getWorld(){
        return worlds;
    }
    
    public void setWorld(World worlds){
        this.worlds = worlds;
    }
    
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
}
