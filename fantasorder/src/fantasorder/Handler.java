package fantasorder;

import input.Input;

public class Handler {

    private Game game;
    //private World worlds; untuk peta
    
    public Handler(Game game) {
        this.game = game;
    }
    
    public Input getInput(){
        return game.getInput();
    }
    /*
    public int getWidth(){
        return game.width;
    }
    
    public int getHeight(){
        return game.height;
    }
    */
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
}
