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
import fantasorder.gfx.GameCamera;
import java.awt.Graphics;
import tiles.Tile;
import world.World;

public class GameState extends State{
    
    //private Unit a; // ini nanti yang dimainkan bisa pindah ke object unit dulu
    private String[] entity = new String[4];
    private String[] namaMap = new String[4];
    private World world;
    private Handler handler;
    
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
        this.handler = handler;
        
        //a = new Archer(game, 100, 100);
        
        namaMap[0]="mapdesa.txt";
        namaMap[1]="maphutan2.txt";
        namaMap[2]="maphutan2.txt";
        namaMap[3]="mapkota.txt";
        
        entity[0]="entitydesa.txt";
        entity[1]="entityhutan.txt";
        entity[2]="entityhutan.txt";
        entity[3]="entitykota.txt";
        
        setket(i);
        
        world = new World(handler, "mapdesa.txt","entitydesa.txt", a); //load Map dari file TXT
        handler.setWorld(world);
        bgm = new AudioPlayer("/sound/bgm.wav");
        bgm.play();
    }
    
    @Override
    public void tick() {
        int b = 10000;
        if(world.isBattle()){
            b = (int)(Math.random()*101+1);
        }
        
        int temp = a.getLokasi();
        
        if(a.getX()<0){
            a.setLokasi(a.getLokasi()+1);
        }
        
        if(a.getY()<0){
            a.setLokasi(a.getLokasi()-1);
        }
        
        if(temp!=a.getLokasi()){
            world = new World(handler, namaMap[a.getLokasi()],entity[a.getLokasi()], a);
            handler.setWorld(world);
            handler.getGame().setGameCamera(new GameCamera(handler,0,0));
        }
        
        temp = a.getLokasi();
        
        world.tick();
        
        if(b < 20){
            System.out.println("game");
        }
        else if(b<1000){
            System.out.println("BLAH");
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
            a = new Warrior(handler, 100, 100,1);
        }
        else if(ket == 2){
            a = new Priest(handler, 100, 100,2);
        }
        else if(ket == 3){
            a = new Archer(handler, 100, 100,3);
        }
    }
    
    public void goBattle(){
    
    }
    
    
}
