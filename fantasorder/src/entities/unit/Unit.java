package entities.unit;

import entities.Entity;
import fantasorder.Game;
import fantasorder.Handler;
import tiles.Tile;

public abstract class Unit extends Entity{
    
    public static final int darah_semula = 10;
    public static final float speed_semula = 3.0f;
    public static final int width_semula = 64;
    public static final int height_semula = 64;
    
    protected int darah;
    protected float speed;
    protected float xMove,yMove;
    
    public Unit(Handler handler, float x, float y,int width, int height) {
        super(handler, x, y, width, height);
        this.darah = darah_semula;
        this.speed = speed_semula;
        this.xMove = 0;
        this.yMove = 0;
    }
    
    public void move(){
        if(!checkEntityCollision(xMove, 0f)){
            moveX();
        }
        
        if(!checkEntityCollision(0f,yMove)){
            moveY();
        }
    }
    
    //bergerak untuk di sumbu X
    public void moveX(){
        if(xMove>0){ //gerak ke kanan
            int tx = (int)(x + xMove + bounds.x + bounds.width)/ Tile.tilewidth; //mendapatkan posisi kotak pengecekan tabrakan bagian kanan sumbu X ketika ke kanan
            if(!collisionWithTile(tx, (int) (y+bounds.y)/ Tile.tileheight) && 
            !collisionWithTile(tx, (int) (y+bounds.y + bounds.height)/Tile.tileheight)){ //pengecekan ujung atas dan bawah pada posisi TX
                x+=xMove;
            }else{
                x = tx * Tile.tilewidth - bounds.x - bounds.width - 1; //memepetkan collision box
            }
        }
        else if(xMove< 0){ //gerak ke kiri
            int tx = (int)(x + xMove + bounds.x)/ Tile.tilewidth; //mendapatkan posisi kotak pengecekan tabrakan bagian kiri di sumbu X ketika ke kiri
            if(!collisionWithTile(tx, (int) (y+bounds.y)/ Tile.tileheight) && 
            !collisionWithTile(tx, (int) (y+bounds.y + bounds.height)/Tile.tileheight)){ //pengecekan ujung atas dan bawah pada posisi TX
                x+=xMove;
            }
            else{
                x = tx * Tile.tilewidth + Tile.tilewidth - bounds.x; //memepetkan collision box
            }
        }   
    }
    
    //bergerak untuk di sumbu Y
    public void moveY(){
        if(yMove<0){ // gerak ke atas
            int ty = (int) (y + yMove + bounds.y)/Tile.tileheight; //mendapatkan posisi kotak pengecekan tabrakan bagian atas sumbu Y ketika gerak ke atas
            
            if(!collisionWithTile((int)(x + bounds.x)/Tile.tilewidth,ty) && 
                    !collisionWithTile((int)(x + bounds.x + bounds.width)/Tile.tilewidth,ty)){ //pengecekan ujung kanan dan kiri pada posisi TY
                y+=yMove;
            }
            else{
                y = ty * Tile.tileheight + Tile.tileheight - bounds.y; //memepetkan collision box
            }
        }
        else if(yMove>0){ // gerak ke bawah
            int ty = (int) (y + yMove + bounds.y + bounds.height)/Tile.tileheight; //mendapatkan posisi kotak pengecekan tabrakan bagian atas sumbu Y ketika gerak ke bawah
            
            if(!collisionWithTile((int)(x + bounds.x)/Tile.tilewidth,ty) && 
                    !collisionWithTile((int)(x + bounds.x + bounds.width)/Tile.tilewidth,ty)){ //pengecekan ujung kanan dan kiri pada posisi TY
                y+=yMove;
            }
            else{
                y = ty*Tile.tileheight - bounds.y - bounds.height -1; //memepetkan collision box
            }
        }
    }
    
    //pengecekan collision
    protected boolean collisionWithTile(int x, int y){
        return handler.getWorld().getTile(x,y).isSolid();
    }
    
    public int getDarah() {
        return darah;
    }

    public float getSpeed() {
        return speed;
    }

    public void setDarah(int darah) {
        this.darah = darah;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getxMove() {
        return xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }
    
}
