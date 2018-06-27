package world;

import Utils.Utils;
import entities.EntityManager;
import entities.statics.Tree;
import entities.unit.Archer;
import entities.unit.Priest;
import entities.unit.Unit;
import entities.unit.Warrior;
import fantasorder.Handler;
import java.awt.Graphics;
import tiles.Tile;

public class World {
    
    private boolean battle=false;
    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;
    
    //entities
    private EntityManager entityManager;
    
    public World(Handler handler, String path1, String path2, Unit a){
        this.handler = handler;
        entityManager = new EntityManager(handler, a);
        
        loadWorld(path1);
        loadTreeEntity(path2);
        
        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);
    }
    
    public void tick(){
        entityManager.tick();
    }
    
    public boolean isBattle(){
        return battle;
    }
    
    public void render(Graphics g){
        //untuk menampilkan dan memproses yang hanya muncul pada layar saja utk sumbu x
        int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.tilewidth); 
        int xEnd = (int) Math.min(width, ((handler.getGameCamera().getxOffset() + handler.getWidth())/ Tile.tilewidth) + 1);
        
        //untuk menampilkan dan memproses yang hanya muncul pada layar saja utk sumbu y
        int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.tileheight); 
        int yEnd = (int) Math.min(height, ((handler.getGameCamera().getyOffset() + handler.getHeight())/Tile.tileheight) + 1);
        
        for (int i = yStart; i < yEnd; i++) {
            for (int j = xStart; j < xEnd; j++) {
                getTile(j,i).render(g,(int)(j*Tile.tilewidth - handler.getGameCamera().getxOffset()),(int)(i*Tile.tileheight - handler.getGameCamera().getyOffset())); //menampilkan dan menggeser map
            }
        } 
        
        //Entities
        entityManager.render(g);    
        
    }
    
    public Tile getTile(int x, int y){
        
        if(x<0 || y<0 || x>= width || y>= height){
            return Tile.grassTile;
        }
        
        Tile t = Tile.tiles[tiles[y][x]];
        if(t==null){
            return Tile.Dirt01;
        }
        else{
            return t;
        }
    }
    
    private void loadTreeEntity(String path){
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        int a=0;
        int c =1;
        
        do{
            if(tokens[a].equals("e")){
                c++;
                a++;
            }
            else{
                entityManager.addEntity(c, Utils.parseInt(tokens[a])*Tile.tilewidth, Utils.parseInt(tokens[a+1])*Tile.tileheight, handler);
                a+=2;
            }           
            
            //entityManager.addEntity(new Tree(handler,Utils.parseInt(tokens[a])*Tile.tilewidth,Utils.parseInt(tokens[a+1])*Tile.tileheight));            
        }while(a<tokens.length);
        
        /*
        for(int i=0;i<entityManager.getEntities().size();i++){
            System.out.println(entityManager.getEntities().get(i).getClass().getSimpleName());
        }*/
    }
    
    private void loadWorld(String path){
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        
        if(Utils.parseInt(tokens[0]) == 1){
            battle = true;
        }
        else{
            battle = false;
        }
        width = Utils.parseInt(tokens[1]);
        height = Utils.parseInt(tokens[2]);
        spawnX = Utils.parseInt(tokens[3]) * Tile.tilewidth;
        spawnY = Utils.parseInt(tokens[4]) * Tile.tileheight;
        
        tiles = new int[height][width];
        
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                tiles[i][j]=Utils.parseInt(tokens[(j+i*width)+5]);
            }
        }
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }     
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
}
