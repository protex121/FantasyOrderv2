package fantasorder.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    //motong gambar belum lengkap
    
    private static final int width = 48, height = 48;
    public static BufferedImage redroof02,
            lamp, doorway, water01, water02,water03,
            water04,water05,water06,water07,water08,water09,
            bigtree, bigtrees,
            tree01,tree02,trees,
            board01,board02,board03,
            tent, redcrest,
            redroof01, woodenroof01, 
            woodenroof02, hayroof01, 
            hayroof02, walls01,walls02,
            greenroof01, greenroof02,
            bigbrooflb,bigbroofl,bigbrooflo,bigbroofb,bigbroofc,bigbroofd,bigbroofrb,bigbroofr,bigbroofro,bigbroofli,bigbroofri,bigbroofw,
            walls03,walls04,woodswall06, 
            woodswall05, woodswall04, woodswall03, 
            woodswall02,woodswall01,woodwalls04, 
            woodwalls03, woodwalls01, woodwalls05,
            woodwalls06 , woodenwall06,woodwalls02,
            woodenwall05,woodenwall01,woodenwall02, 
            woodenwall03, woodenwall04 ,player1, 
            player2, player3, dirt01, grass, stone01,
            stone02,stone03,stone04,stone05, tree, 
            dirt02, dirt03,dirt04,dirt05,dirt06, dirt07,dirt08,dirt09, dirt10,
            cliff01,cliff02,
            cliff03,cliff04,cliff05,cliff06, stair01,stair02, 
            land01,land02,land03,land04;

    public static BufferedImage[] archer_down, archer_up, archer_left, archer_right;
    public static BufferedImage[] priest_down, priest_up, priest_left, priest_right;
    public static BufferedImage[] warrior_down, warrior_up, warrior_left, warrior_right;
    
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/archer_walk.png"));
        //player1 = sheet.crop(0, 0, width, height);
        //sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/priest_walk.png"));
        //player2 = sheet.crop(0, 0, width, height);
        //sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/warrior_walk.png"));
        //player3 = sheet.crop(0, 0, width, height);
        archer_up = new BufferedImage[3];
        archer_down = new BufferedImage[3];
        archer_left = new BufferedImage[3];
        archer_right = new BufferedImage[3];
        
        /*insert gambar player archer*/
        archer_down[0] = sheet.crop(0, 0, width, height);
        archer_down[1] = sheet.crop(48, 0, width, height);
        archer_down[2] = sheet.crop(96, 0, width, height);
        
        archer_left[0] = sheet.crop(0, 48, width, height);
        archer_left[1] = sheet.crop(48, 48, width, height);
        archer_left[2] = sheet.crop(48, 48, width, height);
        
        archer_right[0] = sheet.crop(0, 96, width, height);
        archer_right[1] = sheet.crop(48, 96, width, height);
        archer_right[2] = sheet.crop(96, 96, width, height);
        
        archer_up[0] = sheet.crop(0, 144, width, height);
        archer_up[1] = sheet.crop(48, 144, width, height);
        archer_up[2] = sheet.crop(96, 144, width, height);
        
        /*insert gambar player priest*/
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/priest_walk.png"));
        priest_up = new BufferedImage[3];
        priest_down = new BufferedImage[3];
        priest_left = new BufferedImage[3];
        priest_right = new BufferedImage[3];
        
        priest_down[0] = sheet.crop(0, 0, width, height);
        priest_down[1] = sheet.crop(48, 0, width, height);
        priest_down[2] = sheet.crop(96, 0, width, height);
        
        priest_left[0] = sheet.crop(0, 48, width, height);
        priest_left[1] = sheet.crop(48, 48, width, height);
        priest_left[2] = sheet.crop(48, 48, width, height);
        
        priest_right[0] = sheet.crop(0, 96, width, height);
        priest_right[1] = sheet.crop(48, 96, width, height);
        priest_right[2] = sheet.crop(96, 96, width, height);
        
        priest_up[0] = sheet.crop(0, 144, width, height);
        priest_up[1] = sheet.crop(48, 144, width, height);
        priest_up[2] = sheet.crop(96, 144, width, height);
        
        /*insert gambar warrior*/
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/warrior_walk.png"));
        warrior_up = new BufferedImage[3];
        warrior_down = new BufferedImage[3];
        warrior_left = new BufferedImage[3];
        warrior_right = new BufferedImage[3];
        
        warrior_down[0] = sheet.crop(0, 0, width, height);
        warrior_down[1] = sheet.crop(48, 0, width, height);
        warrior_down[2] = sheet.crop(96, 0, width, height);
        
        warrior_left[0] = sheet.crop(0, 48, width, height);
        warrior_left[1] = sheet.crop(48, 48, width, height);
        warrior_left[2] = sheet.crop(48, 48, width, height);
        
        warrior_right[0] = sheet.crop(0, 96, width, height);
        warrior_right[1] = sheet.crop(48, 96, width, height);
        warrior_right[2] = sheet.crop(96, 96, width, height);
        
        warrior_up[0] = sheet.crop(0, 144, width, height);
        warrior_up[1] = sheet.crop(48, 144, width, height);
        warrior_up[2] = sheet.crop(96, 144, width, height);
        
        
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A2.png"));
        grass = sheet.crop(0, 0, width, height);
        dirt01 = sheet.crop(96, 0, width, height);
        dirt02 = sheet.crop(96, 48,width,height);
        dirt03 = sheet.crop(144,48,width,height);
        dirt04 = sheet.crop(96,96,width,height);
        dirt05 = sheet.crop(144,96,width,height);
        dirt06 = sheet.crop(144,72,width,height);
        dirt07 = sheet.crop(96,72,width,height);
        dirt08 = sheet.crop(130,94,width,height);
        dirt09 = sheet.crop(120,48, width, height);
        dirt10 = sheet.crop(120,55,width,height);
        stone01 = sheet.crop(192, 0, width, height);
        stone02 = sheet.crop(192,48, width, height);
        stone03 = sheet.crop(240,48,width,height);
        stone04 = sheet.crop(192,96,width,height);
        stone05 = sheet.crop(240,96,width,height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A5.png"));
        cliff01 = sheet.crop(0,672,width,height);
        cliff02 = sheet.crop(0,720,width,height);
        cliff03 = sheet.crop(48,672,width,height);
        cliff04 = sheet.crop(48,720,width,height);
        cliff05 = sheet.crop(96,672,width,height);
        cliff06 = sheet.crop(96,720,width,height);
        stair01 = sheet.crop(0,144,width,height);
        stair02 = sheet.crop(96,144,width, height);
        land01 = sheet.crop(0,432,width,height);
        land02 = sheet.crop(48,432,width,height);
        land03 = sheet.crop(0,480,width,height);
        land04 = sheet.crop(48,480,width,height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A3.png"));
        walls01 = sheet.crop(0,96,width,height);
        walls02 = sheet.crop(0,144,width,height);
        walls03 = sheet.crop(48,96,width,height);
        walls04 = sheet.crop(48,144,width,height);
        woodenwall01 = sheet.crop(0,288,width,height);
        woodenwall02 = sheet.crop(0,336,width,height);
        woodenwall03 = sheet.crop(48,288,width,height);
        woodenwall04 = sheet.crop(48,336,width,height);
        woodenwall05 = sheet.crop(24,288,width,height);
        woodenwall06 = sheet.crop(24,336,width,height);
        woodwalls01 = sheet.crop(96,288,width,height);
        woodwalls02 = sheet.crop(96,336,width, height);
        woodwalls03 = sheet.crop(144,288,width,height);
        woodwalls04 = sheet.crop(144,336,width,height);
        woodwalls05 = sheet.crop(120,288,width,height);
        woodwalls06 = sheet.crop(120,336,width,height);
        woodswall01 = sheet.crop(192,288,width,height);
        woodswall02 = sheet.crop(192,336,width,height);
        woodswall03 = sheet.crop(240,288,width,height);
        woodswall04 = sheet.crop(240,336,width,height);
        woodswall05 = sheet.crop(216,288,width,height);
        woodswall06 = sheet.crop(216,336,width,height);
        hayroof01 = sheet.crop(288,192,width,height);
        hayroof02 = sheet.crop(288,240,width,height);
        woodenroof01 = sheet.crop(192,192,width,height);
        woodenroof02 = sheet.crop(192,240,width,height);
        redroof01 = sheet.crop(0,0,width,height);
        redroof02 = sheet.crop(0,46, width, height);
        greenroof01 = sheet.crop(288,0,width,height);
        greenroof02 = sheet.crop(288,46, width, height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_C.png"));
        redcrest = sheet.crop(0,192,width,height*2);
        //roof besar coklat, dari pojok atas ke pojok bawah
        bigbrooflb = sheet.crop(624,144,width,height);
        bigbroofl = sheet.crop(624,192,width,height);
        bigbrooflo = sheet.crop(624,240,width,height); 
        bigbroofb = sheet.crop(672,144,width,height);
        bigbroofc = sheet.crop(672,192,width,height);
        bigbroofd = sheet.crop(672,240,width,height);
        bigbroofrb = sheet.crop(720,144,width,height);
        bigbroofr = sheet.crop(720,192,width,height);
        bigbroofro = sheet.crop(720,240,width,height);
        bigbroofli = sheet.crop(624,336,width,height);//menjorok kedalam
        bigbroofri = sheet.crop(576,336,width,height);//menjorok kedalam
        bigbroofw = sheet.crop(528,336,width,height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_B.png"));
        tent = sheet.crop(384,480,width*3,height*3);
        board01 = sheet.crop(96,0,width,height);
        board02 = sheet.crop(288,0,width,height);
        board03 = sheet.crop(240,48,width,height);
        bigtree = sheet.crop(0,672,width*2,height*2);
        bigtrees = sheet.crop(96,672,width*2,height*2);
        tree = sheet.crop(240,528,width,height*2);
        trees = sheet.crop(288,528,width,height);
        doorway = sheet.crop(288,384,width,height);
        lamp = sheet.crop(528,480,width,height*3);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A1.png"));
        water01 = sheet.crop(0,48,width,height);
        water02 = sheet.crop(0,96,width,height);
        water03 = sheet.crop(48,48,width,height);
        water04 = sheet.crop(48,96,width,height);
        water05 = sheet.crop(0,72,width,height);
        water06 = sheet.crop(48,72,width,height);
        water07 = sheet.crop(24,48,width,height);
        water08 = sheet.crop(24,96,width,height);
        water09 = sheet.crop(24,72,width,height);
    }
    
}
