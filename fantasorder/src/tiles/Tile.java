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
    public static Tile Stair01 = new Stair01Tile(37);
    public static Tile Stair02 = new Stair02Tile(38);
    public static Tile Land01 = new Land01Tile(39);
    public static Tile Land02 = new Land02Tile(40);
    public static Tile Land03 = new Land03Tile(41);
    public static Tile Land04 = new Land04Tile(42);
    public static Tile Walls01 = new Walls01Tile(43);
    public static Tile Walls02 = new Walls02Tile(44);
    public static Tile Walls03 = new Walls03Tile(45);
    public static Tile Walls04 = new Walls04Tile(46);
    public static Tile Woodenall01 = new Woodenwall01Tile(47);
    public static Tile Woodenall02 = new Woodenwall02Tile(48);
    public static Tile Woodenall03 = new Woodenwall03Tile(49);
    public static Tile Woodenall04 = new Woodenwall04Tile(50);
    public static Tile Woodenall05 = new Woodenwall05Tile(51);
    public static Tile Woodenall06 = new Woodenwall06Tile(52);
    public static Tile Woodwalls01 = new Woodwalls01Tile(53);
    public static Tile Woodwalls02 = new Woodwalls02Tile(54);
    public static Tile Woodwalls03 = new Woodwalls03Tile(55);
    public static Tile Woodwalls04 = new Woodwalls04Tile(56);
    public static Tile Woodwalls05 = new Woodwalls05Tile(57);
    public static Tile Woodwalls06 = new Woodwalls06Tile(58);
    public static Tile Woodswall01 = new Woodswall01Tile(59);
    public static Tile Woodswall02 = new Woodswall02Tile(60);
    public static Tile Woodswall03 = new Woodswall03Tile(61);
    public static Tile Woodswall04 = new Woodswall04Tile(62);
    public static Tile Woodswall05 = new Woodswall05Tile(63);
    public static Tile Woodswall06 = new Woodswall06Tile(64);
    public static Tile Hayroof01 = new Hayroof01Tile(65);
    public static Tile Hayroof02 = new Hayroof02Tile(66);
    public static Tile Woodenroof01 = new Woodenroof01Tile(67);
    public static Tile Woodenroof02 = new Woodenroof02Tile(68);
    public static Tile Redroof01 = new Redroof01Tile(69);
    public static Tile Redroof02 = new Redroof02Tile(70);
    public static Tile Greenroof01 = new Greenroof01Tile(71);
    public static Tile Greenroof02 = new Greenroof02Tile(72);
    public static Tile Redcrest01 = new Greenroof02Tile(73);
    public static Tile Redcrest02 = new Greenroof02Tile(74);
    public static Tile Bigbrooflb = new Greenroof02Tile(75);
    public static Tile Bigbroofl = new Greenroof02Tile(76);
    public static Tile Bigbrooflo = new Greenroof02Tile(77);
    public static Tile Bigbroofb = new Greenroof02Tile(78);
    public static Tile Bigbroofc = new Greenroof02Tile(79);
    public static Tile Bigbroofd = new Greenroof02Tile(80);
    public static Tile Bigbroofrb = new Greenroof02Tile(81);
    public static Tile Bigbroofr = new Greenroof02Tile(82);
    public static Tile Bigbroofro = new Greenroof02Tile(83);
    public static Tile Bigbroofli = new Greenroof02Tile(84);
    public static Tile Bigbroofri = new Greenroof02Tile(85);
    public static Tile Bigbroofw = new Greenroof02Tile(86);
    public static Tile Knightstatue = new Greenroof02Tile(87);
    public static Tile tent = new Greenroof02Tile(88);
    public static Tile board1 = new Greenroof02Tile(89);
    public static Tile board2 = new Greenroof02Tile(90);
    public static Tile board3 = new Greenroof02Tile(91);
    public static Tile bigtree = new Greenroof02Tile(92);
    public static Tile bigtrees = new Greenroof02Tile(93);
    public static Tile tree = new Greenroof02Tile(94);
    public static Tile trees = new Greenroof02Tile(95);
    public static Tile doorway = new Greenroof02Tile(96);
    public static Tile lamp = new Greenroof02Tile(97);
    public static Tile window = new Greenroof02Tile(98);
    public static Tile windowg = new Greenroof02Tile(99);
    public static Tile windowf = new Greenroof02Tile(100);
    public static Tile windowc = new Greenroof02Tile(101);
    public static Tile windows = new Greenroof02Tile(102);
    public static Tile windoows = new Greenroof02Tile(103);
    public static Tile windooww = new Greenroof02Tile(104);
    public static Tile pipes = new Greenroof02Tile(105);
    public static Tile roadsign = new Greenroof02Tile(106);
    public static Tile well = new Greenroof02Tile(107);
    public static Tile roadstone = new Greenroof02Tile(108);
    public static Tile barrel = new Greenroof02Tile(109);
    public static Tile pot = new Greenroof02Tile(110);
    public static Tile bucket = new Greenroof02Tile(111);
    public static Tile trunk = new Greenroof02Tile(112);
    
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
