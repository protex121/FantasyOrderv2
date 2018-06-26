package world;

import Utils.Utils;
import fantasorder.game;
import fantasorder.Handler;
import java.awt.Graphics;
import tiles.Tile;

public class World {
    
    private Handler handler;
    private int width, height;
    private int spawnX, spawnY;
    private int[][] tiles;
    
    public World(Handler handler, String path){
        this.handler = handler;
        loadWorld(path);        
    }
    
    public void tick(){
        
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
                getTile(j,i).render(g,(int)(j*Tile.tilewidth - handler.getGameCamera().getxOffset()),(int)(i*Tile.tileheight - handler.gethandlerCamera().getyOffset())); //menampilkan dan menggeser map
            }
        }        
        
    }
    
    public Tile getTile(int x, int y){
        Tile t = Tile.tiles[tiles[y][x]];
        if(t==null){
            return Tile.Dirt01;
        }
        else{
            return t;
        }
    }
    
    private void loadWorld(String path){
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);
        
        tiles = new int[height][width];
        
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                tiles[i][j]=Utils.parseInt(tokens[(j+i*width)+4]);
            }
        }
    }
    
}
