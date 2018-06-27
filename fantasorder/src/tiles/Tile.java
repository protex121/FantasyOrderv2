package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile Dirt01 = new Dirt01Tile(1);
    public static Tile Dirt02 = new Dirt02Tile(2);
    public static Tile Dirt03 = new Dirt03Tile(3);
    public static Tile Dirt04 = new Dirt04Tile(4);
    public static Tile Dirt05 = new Dirt05Tile(5);
    public static Tile Dirt06 = new Dirt06Tile(6);
    public static Tile Dirt07 = new Dirt07Tile(7);
    public static Tile Dirt08 = new Dirt08Tile(8);
    public static Tile Dirt09 = new Dirt09Tile(9);
    public static Tile Dirt10 = new Dirt10Tile(10);
    public static Tile Stone01 = new Stone01Tile(11);
    public static Tile Stone02 = new Stone02Tile(12);
    public static Tile Stone03 = new Stone03Tile(13);
    public static Tile Stone04 = new Stone04Tile(14);
    public static Tile Stone05 = new Stone05Tile(15);
    public static Tile Cliff01 = new Cliff01Tile(16);
    public static Tile Cliff02 = new Cliff02Tile(17);
    public static Tile Cliff03 = new Cliff03Tile(18);
    public static Tile Cliff04 = new Cliff04Tile(19);
    public static Tile Cliff05 = new Cliff05Tile(20);
    public static Tile Cliff06 = new Cliff06Tile(21);
    public static Tile Cgrass01 = new Cgrass01Tile(22);
    public static Tile Cgrass02 = new Cgrass02Tile(23);
    public static Tile Cgrass03 = new Cgrass03Tile(24);
    public static Tile Cgrass04 = new Cgrass04Tile(25);
    public static Tile Cgrass05 = new Cgrass05Tile(26);
    public static Tile Cgrass06 = new Cgrass06Tile(27);
    public static Tile Cgrass07 = new Cgrass07Tile(28);
    public static Tile Cgrass08 = new Cgrass08Tile(29);
    public static Tile Cgrass09 = new Cgrass09Tile(30);
    public static Tile Cgrass10 = new Cgrass10Tile(31);
    public static Tile Cgrass11 = new Cgrass11Tile(32);
    public static Tile Cgrass12 = new Cgrass12Tile(33);
    public static Tile Cgrass13 = new Cgrass13Tile(34);
    public static Tile Rigcliff01 = new Rigcliff01Tile(35);
    public static Tile Rigcliff02 = new Rigcliff02Tile(36);
    
    
    public static final int tilewidth = 64,tileheight = 64;
    
    private BufferedImage textures;
    private final int id;
    
    public Tile(BufferedImage textures, int id) {
        this.textures = textures;
        this.id = id;
        
        tiles[id] = this;
    }

    public void tick(){
    
    }
    
    public void render(Graphics g,int x,int y){
        g.drawImage(textures, x, y, tilewidth, tileheight, null);
    }
    
    public int getId() {
        return id;
    }
    
    public boolean isSolid(){
        return false;
    }
    
}
