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
    public static Tile Water01 = new Water01Tile(38);
    public static Tile Water02 = new Water02Tile(39);
    public static Tile Water03 = new Water03Tile(40);
    public static Tile Water04 = new Water04Tile(41);
    public static Tile Water05 = new Water05Tile(42);
    public static Tile Water06 = new Water06Tile(43);
    public static Tile Water07 = new Water07Tile(44);
    public static Tile Water08 = new Water08Tile(45);
    public static Tile Water09 = new Water09Tile(46);
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
    public static Tile Greenroof01 = new Greenroof01Tile(59);
    public static Tile Greenroof02 = new Greenroof02Tile(60);
    public static Tile Bridge = new BridgeTile(61);
    public static Tile Bigbrooflb = new BigbrooflbTile(62);
    public static Tile Bigbroofl = new BigbrooflTile(63);
    public static Tile Bigbrooflo = new BigbroofloTile(64);
    public static Tile Bigbroofb = new BigbroofbTile(65);
    public static Tile Bigbroofc = new BigbroofcTile(66);
    public static Tile Bigbroofd = new BigbroofdTile(67);
    public static Tile Bigbroofrb = new BigbroofrbTile(68);
    public static Tile Bigbroofr = new BigbroofrTile(69);
    public static Tile Bigbroofro = new BigbroofroTile(70);
    public static Tile Bigbroofli = new BigbroofliTile(71);
    public static Tile Bigbroofri = new BigbroofriTile(72);
    public static Tile Bigbroofw = new BigbroofwTile(73);
    public static Tile Stonewall01 = new Stonewall01Tile(74);
    public static Tile Stonewall02 = new Stonewall02Tile(75);
    public static Tile Stonewall03 = new Stonewall03Tile(76);
    public static Tile Stonewall04 = new Stonewall04Tile(77);
    public static Tile Stonewall05 = new Stonewall05Tile(78);
    public static Tile Stone06 = new Stone06Tile(79);
    public static Tile Stone07 = new Stone07Tile(80);
    public static Tile Stone08 = new Stone08Tile(81);
    public static Tile Stone09 = new Stone09Tile(82);
    public static Tile Cliff01 = new Cliff01Tile(83);
    public static Tile Cliff02 = new Cliff02Tile(84);
    public static Tile Cliff03 = new Cliff03Tile(85);
    public static Tile Cliff04 = new Cliff04Tile(86);
    public static Tile Cliff05 = new Cliff05Tile(87);
    public static Tile Cliff06 = new Cliff06Tile(88);
    public static Tile Cgrass01 = new Cgrass01Tile(89);
    public static Tile Cgrass02 = new Cgrass02Tile(90);
    public static Tile Cgrass03 = new Cgrass03Tile(91);
    public static Tile Cgrass04 = new Cgrass04Tile(92);
    public static Tile Cgrass05 = new Cgrass05Tile(93);
    public static Tile Cgrass06 = new Cgrass06Tile(94);
    public static Tile Cgrass07 = new Cgrass07Tile(95);
    public static Tile Cgrass08 = new Cgrass08Tile(96);
    public static Tile Cgrass09 = new Cgrass09Tile(97);
    public static Tile Cgrass10 = new Cgrass10Tile(98);
    public static Tile Cgrass11 = new Cgrass11Tile(99);
    public static Tile Cgrass12 = new Cgrass12Tile(100);
    public static Tile Cgrass13 = new Cgrass13Tile(101);
    public static Tile Rigcliff01 = new Rigcliff01Tile(102);
    public static Tile Rigcliff02 = new Rigcliff02Tile(103);
    public static Tile Stair01 = new Stair01Tile(104);
    public static Tile Stair02 = new Stair02Tile(105);
    public static Tile Land01 = new Land01Tile(106);
    public static Tile Land02 = new Land02Tile(107);
    public static Tile Land03 = new Land03Tile(108);
    public static Tile Land04 = new Land04Tile(109);
    public static Tile Stone10 = new Stone10Tile(110);
    public static Tile Silverbox07 = new Silverbox07Tile(111);
    public static Tile Silverbox05 = new Silverbox05Tile(112);
    public static Tile Silverbox04 = new Silverbox04Tile(113);
    public static Tile Silverbox02 = new Silverbox02Tile(114);
    
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
