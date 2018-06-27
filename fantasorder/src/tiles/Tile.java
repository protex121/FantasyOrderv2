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
    public static Tile Woodenwall01 = new Woodenwall01Tile(16);
    public static Tile Woodenwall02 = new Woodenwall02Tile(17);
    public static Tile Woodenwall03 = new Woodenwall03Tile(18);
    public static Tile Woodenwall04 = new Woodenwall04Tile(19);
    public static Tile Woodenwall05 = new Woodenwall05Tile(20);
    public static Tile Woodenwall06 = new Woodenwall06Tile(21);
    public static Tile Hayroof01 = new Hayroof01Tile(22);
    public static Tile Hayroof02 = new Hayroof02Tile(23);
    public static Tile Woodswall01 = new Woodswall01Tile(24);
    public static Tile Woodswall02 = new Woodswall02Tile(25);
    public static Tile Woodswall03 = new Woodswall03Tile(26);
    public static Tile Woodswall04 = new Woodswall04Tile(27);
    public static Tile Woodswall05 = new Woodswall05Tile(28);
    public static Tile Woodswall06 = new Woodswall06Tile(29);
    public static Tile Woodenroof01 = new Woodenroof01Tile(30);
    public static Tile Woodenroof02 = new Woodenroof02Tile(31);
    public static Tile Walls01 = new Walls01Tile(32);
    public static Tile Walls02 = new Walls02Tile(33);
    public static Tile Walls03 = new Walls03Tile(34);
    public static Tile Walls04 = new Walls04Tile(35);
    public static Tile Redroof01 = new Redroof01Tile(36);
    public static Tile Redroof02 = new Redroof02Tile(37);
    
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
