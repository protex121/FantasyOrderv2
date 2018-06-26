package fantasorder.gfx;

import entities.Entity;
import fantasorder.Game;
import fantasorder.Handler;
import tiles.Tile;

public class GameCamera {
    
    private float xOffset, yOffset;
    private Handler handler;
    
    public GameCamera(Handler handler, float xOffset, float yOffset){
        this.handler = handler;
        this.xOffset = xOffset; //lokasi koordinat sumbu x awal yang ditampilkan pada layar
        this.yOffset = yOffset; //lokasi koordinat sumbu y awal yang ditampilkan pada layar
    }
    
    //pengecekan apakah kamera sudah diujung atau belum
    public void checkBlankSpace(){
        if(xOffset<0){
            xOffset = 0;
        }else if(xOffset > handler.getWorld().getWidth() * Tile.tilewidth - handler.getWidth()){
            xOffset = handler.getWorld().getWidth() * Tile.tilewidth - handler.getWidth();
        }
        
        if(yOffset<0){
            yOffset = 0;
        }else if(yOffset> handler.getWorld().getHeight() * Tile.tileheight - handler.getHeight()){
            yOffset = handler.getWorld().getHeight() * Tile.tileheight - handler.getHeight();
        }
    }
    
    public void centerOnEntity(Entity e){
        xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() / 2;
        yOffset = e.getY() - handler.getHeight()/2 + e.getHeight()/2;
        checkBlankSpace();
    }

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }
    
    public void move(float xAmt, float yAmt){
        this.xOffset += xAmt;
        this.yOffset += yAmt;
        checkBlankSpace();
    }
}
