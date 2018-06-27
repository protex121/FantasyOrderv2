package entities;

import entities.statics.BigTree;
import entities.statics.Chimney;
import entities.statics.Doorway;
import entities.statics.Lamp;
import entities.statics.Tent;
import entities.statics.Tree;
import entities.statics.Window;
import entities.unit.Unit;
import fantasorder.Handler;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;

public class EntityManager {
    
    private Handler handler;
    private Unit player;
    private ArrayList<Entity> entities;
    private Comparator<Entity> Sorter = new Comparator<Entity>(){
        
        @Override
        public int compare(Entity a, Entity b) {
            if(a.getY() + a.getHeight() < b.getY() + b.getHeight()){
                return -1;
            }
            else{
                return 1;
            }
        }
        
    };
    
    public EntityManager(Handler handler, Unit player){
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<Entity>();
        this.player = player;
        addEntity(0,this.player.getX(),this.player.getY(),handler);
    }
    
    public void tick(){
        for(int i=0;i<entities.size();i++){
            Entity e = entities.get(i);
            e.tick();
        }
        entities.sort(Sorter);
    }
    
    public void render (Graphics g){
        for(int i=0;i<entities.size();i++){
            Entity e = entities.get(i);
            e.render(g);
        }
    }

    public void addEntity(int a, float x, float y, Handler handler){
        if(a==0){
            entities.add(this.player);
        }
        else if(a==1){
            entities.add(new Tree(handler,x,y));
        }
        else if(a==2){
            entities.add(new BigTree(handler,x,y));
        }
        else if(a==3){
            entities.add(new Chimney(handler,x,y));
        }
        else if(a==4){
            entities.add(new Window(handler,x,y));
        }
        else if(a==5){
            entities.add(new Tent(handler,x,y));
        }
        else if(a==6){
            entities.add(new Lamp(handler,x,y));
        }
        else if(a==7){
            entities.add(new Doorway(handler,x,y));
        }
    }
    
    //getter setter
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Unit getPlayer() {
        return player;
    }

    public void setPlayer(Unit player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
    
    
}
