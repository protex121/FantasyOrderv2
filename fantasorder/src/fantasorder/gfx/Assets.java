package fantasorder.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    //motong gambar belum lengkap
    private static final int width = 50, height = 50;
    public static AudioPlayer walk;
    public static BufferedImage dirt, grass, stone, tree, bgbattle;

    public static BufferedImage redroof02,
            lamp01,lamp02,lamp03,
            doorway, water01, water02,water03,water04,water05,water06,water07,water08,water09,
            bigtree01,bigtree02,bigtree03,bigtree04,
            bigtrees01,bigtrees02,bigtrees03,bigtrees04,
            tree01,tree02,trees,
            board01,board02,board03,
            tent01,tent02,tent03,tent04,
            tent05,tent06,tent07,tent08,tent09,
            redcrest01, redcrest02,
            redroof01, woodenroof01, 
            woodenroof02, hayroof01, 
            hayroof02, walls01,walls02,
            walls03,walls04,woodswall06, 
            woodswall05, woodswall04, woodswall03, 
            woodswall02,woodswall01,woodwalls04, 
            woodwalls03, woodwalls01, woodwalls05,
            woodwalls06 , woodenwall06,woodwalls02,
            woodenwall05,woodenwall01,woodenwall02, 
            woodenwall03, woodenwall04, dirt01,
            dirt02, dirt03,dirt04,dirt05,dirt06, dirt07,dirt08,dirt09, dirt10,
            cliff01,cliff02,
            cliff03,cliff04,cliff05,cliff06, stair01,stair02, 
            land01,land02,land03,land04,
            stone01,stone02,stone03,stone04,stone05;

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
        walk = new AudioPlayer("/sound/step.wav");
        
        archer_up = new BufferedImage[3];
        archer_down = new BufferedImage[3];
        archer_left = new BufferedImage[3];
        archer_right = new BufferedImage[3];
        
        /*insert gambar player archer*/
        archer_down[0] = sheet.crop(0, 5, width, height);
        archer_down[1] = sheet.crop(50, 5, width, height);
        archer_down[2] = sheet.crop(100, 5, width, height);
        
        archer_left[0] = sheet.crop(0, 50, width, height);
        archer_left[1] = sheet.crop(50, 50, width, height);
        archer_left[2] = sheet.crop(100, 50, width, height);
        
        archer_right[0] = sheet.crop(0, 100, width, height);
        archer_right[1] = sheet.crop(50, 100, width, height);
        archer_right[2] = sheet.crop(100, 100, width, height);
        
        archer_up[0] = sheet.crop(0, 145, width, height);
        archer_up[1] = sheet.crop(50, 145, width, height);
        archer_up[2] = sheet.crop(100, 145, width, height);
        
        /*insert gambar player priest*/
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/priest_walk.png"));
        priest_up = new BufferedImage[3];
        priest_down = new BufferedImage[3];
        priest_left = new BufferedImage[3];
        priest_right = new BufferedImage[3];
        
        priest_down[0] = sheet.crop(0, 5, width, height);
        priest_down[1] = sheet.crop(50, 5, width, height);
        priest_down[2] = sheet.crop(100, 5, width, height);
        
        priest_left[0] = sheet.crop(0, 50, width, height);
        priest_left[1] = sheet.crop(50, 50, width, height);
        priest_left[2] = sheet.crop(100, 50, width, height);
        
        priest_right[0] = sheet.crop(0, 100, width, height);
        priest_right[1] = sheet.crop(50, 100, width, height);
        priest_right[2] = sheet.crop(100, 100, width, height);
        
        priest_up[0] = sheet.crop(0, 145, width, height);
        priest_up[1] = sheet.crop(50, 145, width, height);
        priest_up[2] = sheet.crop(100, 145, width, height);
        
        /*insert gambar warrior*/
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/warrior_walk.png"));
        warrior_up = new BufferedImage[3];
        warrior_down = new BufferedImage[3];
        warrior_left = new BufferedImage[3];
        warrior_right = new BufferedImage[3];
        
        warrior_down[0] = sheet.crop(0, 5, width, height);
        warrior_down[1] = sheet.crop(50, 5, width, height);
        warrior_down[2] = sheet.crop(100, 5, width, height);
        
        warrior_left[0] = sheet.crop(0, 50, width, height);
        warrior_left[1] = sheet.crop(50, 50, width, height);
        warrior_left[2] = sheet.crop(100, 50, width, height);
        
        warrior_right[0] = sheet.crop(0, 100, width, height);
        warrior_right[1] = sheet.crop(50, 100, width, height);
        warrior_right[2] = sheet.crop(100, 100, width, height);
        
        warrior_up[0] = sheet.crop(0, 145, width, height);
        warrior_up[1] = sheet.crop(50, 145, width, height);
        warrior_up[2] = sheet.crop(100, 145, width, height);
        
        
        
        
        
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/bgbattle.png"));
        bgbattle = sheet.crop(0, 0, 900, 585);

        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A2.png"));
        dirt01 = sheet.crop(95, 0, width, height);
        dirt02 = sheet.crop(95,47,width,height);
        dirt03 = sheet.crop(142,47,width,height);
        dirt04 = sheet.crop(96,95,width,height);
        dirt05 = sheet.crop(142,95,width,height);
        dirt06 = sheet.crop(130,48,width,height);
        dirt07 = sheet.crop(96,70,width,height);
        dirt08 = sheet.crop(130,94,width,height);
        dirt09 = sheet.crop(143,70, width, height);
        dirt10 = sheet.crop(120,60,width,height);
        stone01 = sheet.crop(191, 0 , width, height);
        stone02 = sheet.crop(190,48, width, height);
        stone03 = sheet.crop(237,48,width,height);
        stone04 = sheet.crop(192,95,width,height);
        stone05 = sheet.crop(237,94,width,height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A5.png"));
        cliff01 = sheet.crop(0,671,width,height);
        cliff02 = sheet.crop(0,718,width,height);
        cliff03 = sheet.crop(47,671,width,height);
        cliff04 = sheet.crop(47,718,width,height);
        cliff05 = sheet.crop(94,671,width,height);
        cliff06 = sheet.crop(94,718,width,height);
        stair01 = sheet.crop(0,142,width,height);
        stair02 = sheet.crop(95,142,width, height);
        land01 = sheet.crop(0,432,width,height);
        land02 = sheet.crop(46,432,width,height);
        land03 = sheet.crop(0,478,width,height);
        land04 = sheet.crop(46,478,width,height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A3.png"));
        walls01 = sheet.crop(0,95,width,height);
        walls02 = sheet.crop(0,142,width,height);
        walls03 = sheet.crop(46,95,width,height);
        walls04 = sheet.crop(46,142,width,height);
        woodenwall01 = sheet.crop(0,289,width,height);
        woodenwall02 = sheet.crop(0,334,width,height);
        woodenwall03 = sheet.crop(48,289,width,height);
        woodenwall04 = sheet.crop(48,334,width,height);
        woodenwall05 = sheet.crop(15,289,width,height);
        woodenwall06 = sheet.crop(15,334,width,height);
        woodwalls01 = sheet.crop(95,289,width,height);
        woodwalls02 = sheet.crop(95,334,width, height);
        woodwalls03 = sheet.crop(143,289,width,height);
        woodwalls04 = sheet.crop(143,334,width,height);
        woodwalls05 = sheet.crop(100,289,width,height);
        woodwalls06 = sheet.crop(100,334,width,height);
        woodswall01 = sheet.crop(192,289,width,height);
        woodswall02 = sheet.crop(192,334,width,height);
        woodswall03 = sheet.crop(238,289,width,height);
        woodswall04 = sheet.crop(238,334,width,height);
        woodswall05 = sheet.crop(213,289,width,height);
        woodswall06 = sheet.crop(213,334,width,height);
        hayroof01 = sheet.crop(288,191,width,height);
        hayroof02 = sheet.crop(288,238,width,height);
        woodenroof01 = sheet.crop(192,192,width,height);
        woodenroof02 = sheet.crop(192,238,width,height);
        redroof01 = sheet.crop(0,0,width,height);
        redroof02 = sheet.crop(0,46, width, height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_C.png"));
        redcrest01 = sheet.crop(0,192,width,height);
        redcrest02 = sheet.crop(0,245,width,height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_B.png"));
        tent01=sheet.crop(384,480,width,height);
        tent02=sheet.crop(384,530,width,height);
        tent03=sheet.crop(384,580,width,height);
        tent04 = sheet.crop(434,480,width,height);
        tent05 = sheet.crop(434,530,width,height);
        tent06 = sheet.crop(434,580,width,height);
        tent07 = sheet.crop(484,480,width,height);
        tent08=sheet.crop(484,530,width,height);
        tent09=sheet.crop(484,580,width,height);
        board01=sheet.crop(94,0,width,height);
        board02 = sheet.crop(287,0,width,height);
        board03 = sheet.crop(239,48,width,height);
        bigtree01 = sheet.crop(0,672,width,height);
        bigtree02 = sheet.crop(0,717,width, height);
        bigtree03 = sheet.crop(46,672,width,height);
        bigtree04=sheet.crop(46,717,width,height);
        bigtrees01 = sheet.crop(96,672,width,height);
        bigtrees02=sheet.crop(96,717,width,height);
        bigtrees03=sheet.crop(142,672,width,height);
        bigtrees04=sheet.crop(142,717,width,height);
        tree01 = sheet.crop(238,524,width,height);
        tree02 = sheet.crop(238,574,width,height);
        trees = sheet.crop(288,528,width,height);
        doorway = sheet.crop(287,380,width,height);
        lamp01 = sheet.crop(527,498,width,height);
        lamp02 = sheet.crop(527,548,width,height);
        lamp03 = sheet.crop(527,598,width,height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A1.png"));
        water01=sheet.crop(0,52,width,height);
        water02=sheet.crop(0,94,width,height);
        water03 = sheet.crop(50,52,width,height);
        water04 = sheet.crop(50,94,width,height);
        water05 = sheet.crop(0,72,width,height);
        water06 = sheet.crop(50,72,width,height);
        water07 = sheet.crop(22,52,width,height);
        water08 = sheet.crop(25,94,width,height);
        water09 = sheet.crop(25,72,width,height);
    }
    
}
