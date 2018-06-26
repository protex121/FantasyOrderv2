package entities;

import fantasorder.Handler;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Entity {
    protected float x, y;
    protected int width, height;
    protected Handler handler;
    protected Rectangle bounds;

    public Entity(Handler handler, float x, float y,int width, int height) {
        this.handler = handler;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
        bounds = new Rectangle(0,0, width, height);
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
