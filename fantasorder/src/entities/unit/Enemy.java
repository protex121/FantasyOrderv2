package entities.unit;

public class Enemy {
    public static final int max_hp = 100;
    public static int hp = 100;
    public static int atk = 8;

    public Enemy() {
    
    }
    
    public void reHP(){
        this.hp = max_hp;
    }
    
}
