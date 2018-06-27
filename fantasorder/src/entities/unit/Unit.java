package entities.unit;

import entities.Entity;
import fantasorder.Game;

public abstract class Unit extends Entity{
    
    /*stat*/
    public static final int darah_semula = 100;
    public static final int mp_semula = 150;
    public static final int def_semula = 100;
    public static final int atk_semula = 60;
    public static final int skill_semula= 0;
    public static final String nama_skill_semula = null;
    
    public static final float speed_semula = 3.0f;
    public static final int width_semula = 64;
    public static final int height_semula = 64;
    
    protected int darah,mp,def,attack,skill;
    public String skilln;
    protected float speed;
    protected float xMove,yMove;
    
    public Unit(Game game, float x, float y,int width, int height) {
        super(game, x, y, width, height);
        this.darah = darah_semula;
        this.speed = speed_semula;
        this.mp = mp_semula;
        this.def = def_semula;
        this.attack = atk_semula;
        this.skill=skill_semula;
        this.skilln = nama_skill_semula;
        
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

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSkill() {
        return skill;
    }

    public String getSkilln() {
        return skilln;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setSkilln(String skilln) {
        this.skilln = skilln;
    }
    
    
    
}
