package states;

import entities.statics.Tree;
import entities.unit.Archer;
import entities.unit.Priest;
import entities.unit.Unit;
import entities.unit.Warrior;
import fantasorder.Game;
import fantasorder.Handler;
import fantasorder.gfx.Assets;
import fantasorder.gfx.AudioPlayer;
import java.awt.Graphics;
import tiles.Tile;
import world.World;

public class GameState extends State{
    
    //private Unit a; // ini nanti yang dimainkan bisa pindah ke object unit dulu
    private World world;
    
    /*
    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "mapdesa.txt","entitydesa.txt","",""); //load Map dari file TXT
        handler.setWorld(world);
        //a = new Warrior(handler, 100, 100);
    }*/

    private AudioPlayer bgm;
    
    private Unit a; // ini nanti yang dimainkan bisa pindah ke object unit dulu
    
    public GameState(Handler handler,int i) {
        super(handler);        
        
        //a = new Archer(game, 100, 100);
        
        if(i == 1){
            a = new Warrior(handler, 100, 100);
        }
        else if(i == 2){
            a = new Priest(handler, 100, 100);
        }
        else if(i == 3){
            a = new Archer(handler, 100, 100);
        }
        
        world = new World(handler, "maphutan.txt","entityhutan.txt","","", a); //load Map dari file TXT
        handler.setWorld(world);
        bgm = new AudioPlayer("/sound/bgm.wav");
        bgm.play();
    }
    
    @Override
    public void tick() {
        int a = (int)(Math.random()*101+1);
        
        world.tick();
        
        if(a < 20){
            System.out.println("game");
        }
        
        //a.tick();
    }

    @Override
    public void render(Graphics g) {
        
        /*disini adalah bagian cetak mencetak bagian istilahnya panel nah a itu = player bisa diganti UNIT dulu
            tiles adalah bagian gambar petak nya map
        */
        
       world.render(g);
       //a.render(g);
    }
    
    public void setket(int ket){
        if(ket == 1){
            a = new Warrior(handler, 100, 100);
        }
        else if(ket == 2){
            a = new Priest(handler, 100, 100);
        }
        else if(ket == 3){
            a = new Archer(handler, 100, 100);
        }
    }
    
    public void goBattle(){
    
    }
    
    
}
