package states;

import entities.unit.Archer;
import entities.unit.Priest;
import entities.unit.Unit;
import entities.unit.Warrior;
import fantasorder.Game;
import fantasorder.gfx.Assets;
import fantasorder.gfx.AudioPlayer;
import java.awt.Graphics;
import tiles.Tile;
import world.World;

public class GameState extends State{

<<<<<<< HEAD
    private AudioPlayer bgm;
    
=======
<<<<<<< HEAD
    private Priest a; // ini nanti yang dimainkan bisa pindah ke object unit dulu
    private World world;
    
    public GameState(Game game) {
        super(game);
        a = new Priest(game, 100, 100);
        world = new World(game, "mapdesa.txt"); //load Map dari file TXT
=======
>>>>>>> zam
    private Unit a; // ini nanti yang dimainkan bisa pindah ke object unit dulu
    
    public GameState(Game game,int i) {
        super(game);
<<<<<<< HEAD
        //a = new Archer(game, 100, 100);
        if(i == 1){
            a = new Warrior(game, 100, 100);
        }
        else if(i == 2){
            a = new Priest(game, 100, 100);
        }
        else if(i == 3){
            a = new Archer(game, 100, 100);
        }
        
        bgm = new AudioPlayer("/sound/epilogue.wav");
        //bgm.play();
=======
        a = new Archer(game, 100, 100);
>>>>>>> origin/sion
>>>>>>> zam
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
    
    public void setket(int ket){
        if(ket == 1){
            a = new Warrior(game, 100, 100);
        }
        else if(ket == 2){
            a = new Priest(game, 100, 100);
        }
        else if(ket == 3){
            a = new Archer(game, 100, 100);
        }
    }
    
}
