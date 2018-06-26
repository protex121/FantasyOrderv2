package entities;

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
        addEntity(player);
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

    public void addEntity(Entity e){
        entities.add(e);
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
