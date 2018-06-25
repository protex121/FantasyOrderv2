package entities.unit;

import entities.Entity;
import fantasorder.Game;

public abstract class Unit extends Entity{
    
    public static final int darah_semula = 10;
    public static final float speed_semula = 3.0f;
    public static final int width_semula = 64;
    public static final int height_semula = 64;
    
    protected int darah;
    protected float speed;
    protected float xMove,yMove;
    
    public Unit(Game game, float x, float y,int width, int height) {
        super(game, x, y, width, height);
        this.darah = darah_semula;
        this.speed = speed_semula;
        this.xMove = 0;
        this.yMove = 0;
    }
    
    public void move(){
        x += xMove;
        y += yMove;
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
