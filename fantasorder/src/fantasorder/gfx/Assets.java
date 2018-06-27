package fantasorder.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    //motong gambar belum lengkap
    //SEBELAH WORTEL NAMANYA APA LUPA CTRL+H INIAPA
    
    private static final int width = 48, height = 48;
    public static AudioPlayer walk;
    public static BufferedImage bgbattle;
    public static BufferedImage grass, tree, redroof02, dirt01,
            lamp, doorway, water01, water02,water03,
            water04,water05,water06,water07,water08,water09,
            bigtree, bridge,
            board01,board02,board03,
            tent, redcrest,
            redroof01, woodenroof01, 
            woodenroof02, hayroof01, 
            hayroof02, walls01,walls02, knightstatue,
            greenroof01, greenroof02,
            bigbrooflb,bigbroofl,bigbrooflo,
            bigbroofb,bigbroofc,bigbroofd,
            bigbroofrb,bigbroofr,bigbroofro,
            bigbroofli,bigbroofri,bigbroofw,
            walls03,walls04,woodswall06, 
            woodswall05, woodswall04, woodswall03, 
            woodswall02,woodswall01,woodwalls04, 
            woodwalls03, woodwalls01, woodwalls05,
            woodwalls06 , woodenwall06,woodwalls02,
            woodenwall05,woodenwall01,woodenwall02, 
            woodenwall03, woodenwall04, stone01,
            stone02,stone03,stone04,stone05,
            dirt02, dirt03,dirt04,dirt05,dirt06, dirt07,dirt08,dirt09, dirt10,
            cliff01,cliff02,
            cliff03,cliff04,cliff05,cliff06, stair01,stair02, 
            cgrass01,cgrass02,cgrass03,cgrass04,cgrass05,cgrass06,cgrass07,cgrass08,cgrass09,
            cgrass10,cgrass11,cgrass12,cgrass13, rigcliff01, rigcliff02,
            land01,land02,land03,land04,

            pipes, roadsign, well, barrel, pot, bucket, wallhole,
            trunk, trunkg, log, gnome, hole, choppedlog, roadstone, bigstone, mushroom,
            raflesia, flowerw, flowerp, flowerb, flowero, manyflower, leaf,
            tanaman, carrot, cabbage, grape, vines01, vines02,
            window, windowg, windowf, windowc, windows, windoows, windooww,

            silverbox01,silverbox02,silverbox03,silverbox04,silverbox05,silverbox06,silverbox07,silverbox08,silverbox09,
            stonewall01,stonewall02,stonewall03,stonewall04,stonewall05,logwall, 
            woodwalla01,woodwalla02,woodwalla03,woodwalla04,woodwalla05,woodwalla06,woodwalla07,woodwalla08,
            woodwallb01,woodwallb02,woodwallb03,woodwallb04,woodwallc01,woodwallc02,woodwallc03,woodwallc04,
            wallpfill, wallpcorl, wallpcorr, wallicorr,wallicorl,
            brickwall01,brickwall02,brickwall03,brickwall04,
            walll01,walll02,walll03,walll04,
            
            black, woodv, woodh, tilered, tilestone1, tilestone2,
            teapot, beer, wine, paper, grassbox, flowerpot,
            bottle, elixirb, elixirr, bread, doll,
            sword, swordx, tomb, axe,
            swordrack1, swordrack2, tombrack, helmet, hat, coat, 
            armoor, shield1, shield2, armor, forge,

            windownoc, windowwc, tallwindownoc, tallwindowwc,
            cabinet, cabinetw, cabinetf, cabinets, cabinett, cabinetb, 
            tablec, tabler, chairc, chairr, bed01, bed02,
            kstove, ksink, ktable1, ktable2, bbtable, btable, wtable,
            chimney01, chimney02, mirror, closedpot, boxsmall, boxstack, boxcarrot, sack;
    
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
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/bgbattle.png"));
        bgbattle = sheet.crop(0, 0, 900, 585);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A5.png"));
        cliff01 = sheet.crop(0,672,width,height);
        cliff02 = sheet.crop(0,720,width,height);
        cliff03 = sheet.crop(48,672,width,height);
        cliff04 = sheet.crop(48,720,width,height);
        cliff05 = sheet.crop(96,672,width,height);
        cliff06 = sheet.crop(96,720,width,height);
        cgrass01 = sheet.crop(0,528,width,height);
        cgrass02 = sheet.crop(48,528,width,height);
        cgrass03 = sheet.crop(96,528,width,height);
        cgrass04 = sheet.crop(0,576,width,height);
        cgrass05 = sheet.crop(48,576,width,height);
        cgrass06 = sheet.crop(96,576,width,height);
        cgrass07 = sheet.crop(0,624,width,height);
        cgrass08 = sheet.crop(48,624,width,height);
        cgrass09 = sheet.crop(96,624,width,height);
        cgrass10 = sheet.crop(144,576,width,height);
        cgrass11 = sheet.crop(192,576,width,height);
        cgrass12 = sheet.crop(144,624,width,height);
        cgrass13 = sheet.crop(192,624,width,height);
        rigcliff01 = sheet.crop(192,144,width,height);
        rigcliff02 = sheet.crop(288,144,width,height);
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
        knightstatue = sheet.crop(0,480,width,height*2);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_B.png"));
        tent = sheet.crop(384,480,width*3,height*3);
        board01 = sheet.crop(96,0,width,height);
        board02 = sheet.crop(288,0,width,height);
        board03 = sheet.crop(240,48,width,height);
        bigtree = sheet.crop(0,672,width*2,height*2);
        tree = sheet.crop(240,528,width,height*2);
        doorway = sheet.crop(288,384,width,height);
        lamp = sheet.crop(528,480,width,height*3);
        window = sheet.crop(0,192,width,height);
        windowg = sheet.crop(48,192,width,height);
        windowf = sheet.crop(96,192,width,height);
        windowc = sheet.crop(144,192,width,height);
        windows = sheet.crop(48,240,width,height);
        windoows = sheet.crop(288,288,width,height*2);
        windooww = sheet.crop(336,288,width,height*2);
        pipes = sheet.crop(0,384,width,height);
        roadsign = sheet.crop(48,432,width,height);
        well = sheet.crop(144,432,width,height);
        roadstone = sheet.crop(192,432,width,height);
        barrel = sheet.crop(240,432,width,height);
        pot = sheet.crop(0,480,width,height);
        bucket = sheet.crop(96,480,width,height);
        trunk = sheet.crop(192,528,width,height);
        flowerw = sheet.crop(0,576,width,height);
        flowerp = sheet.crop(48,576,width,height);
        flowerb = sheet.crop(96,576,width,height);
        flowero = sheet.crop(144,576,width,height);
        log = sheet.crop(192,576,width,height);
        bigstone = sheet.crop(576,336,width,height);
        gnome = sheet.crop(0,624,width,height);
        hole = sheet.crop(48,624,width,height);
        choppedlog = sheet.crop(96,624,width,height);
        tanaman = sheet.crop(192,624,width,height);
        carrot = sheet.crop(240,624,width,height);
        cabbage = sheet.crop(288,624,width,height);
        grape = sheet.crop(336,624,width,height);
        mushroom = sheet.crop(480,288,width,height);
        raflesia = sheet.crop(480,336,width,height);
        trunkg = sheet.crop(528,336,width,height);
        manyflower = sheet.crop(624,288,width,height);
        leaf = sheet.crop(528,384,width,height);
        vines01 = sheet.crop(384,384,width,height*2);
        vines02 = sheet.crop(480,384,width,height*2);
        wallhole = sheet.crop(672,384,width,height*2);
        bridge = sheet.crop(144,96,width,height);
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
        //batch 5.1 sampai sini
        
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Inside_A4.png"));
        silverbox01 = sheet.crop(480,48,width,height);
        silverbox02 = sheet.crop(504,48,width,height);
        silverbox03 = sheet.crop(528,48,width,height);
        silverbox04 = sheet.crop(480,72,width,height);
        silverbox05 = sheet.crop(528,72,width,height);
        silverbox06 = sheet.crop(480,96,width,height);
        silverbox07 = sheet.crop(504,96,width,height);
        silverbox08 = sheet.crop(528,96,width,height);
        stonewall01 = sheet.crop(480,144,width,height);
        stonewall02 = sheet.crop(528,144,width,height);
        stonewall03 = sheet.crop(480,192,width,height);
        stonewall04 = sheet.crop(528,192,width,height);
        stonewall05 = sheet.crop(504,72,width,height);
        logwall = sheet.crop(96,240,width,height);
        woodwalla01 = sheet.crop(288,288,width,height);
        woodwalla02 = sheet.crop(312,288,width,height);
        woodwalla03 = sheet.crop(336,288,width,height);
        woodwalla04 = sheet.crop(288,312,width,height);
        woodwalla05 = sheet.crop(336,312,width,height);
        woodwalla06 = sheet.crop(288,336,width,height);
        woodwalla07 = sheet.crop(312,336,width,height);
        woodwalla08 = sheet.crop(336,336,width,height);
        woodwallb01 = sheet.crop(0,384,width,height);
        woodwallb02 = sheet.crop(48,384,width,height);
        woodwallb03 = sheet.crop(0,432,width,height);
        woodwallb04 = sheet.crop(48,432,width,height);
        woodwallc01 = sheet.crop(288,384,width,height);
        woodwallc02 = sheet.crop(336,384,width,height);
        woodwallc03 = sheet.crop(288,432,width,height);
        woodwallc04 = sheet.crop(336,432,width,height);
        wallpfill = sheet.crop(144,480,width,height);
        wallpcorl = sheet.crop(96,576,width,height);
        wallpcorr = sheet.crop(144,576,width,height);
        wallicorl = sheet.crop(192,576,width,height);
        wallicorr = sheet.crop(240,576,width,height);
        brickwall01 = sheet.crop(96,624,width,height);
        brickwall02 = sheet.crop(144,624,width,height);
        brickwall03 = sheet.crop(96,672,width,height);
        brickwall04 = sheet.crop(144,672,width,height);
        walll01 = sheet.crop(192,624,width,height);
        walll02 = sheet.crop(240,624,width,height);
        walll03 = sheet.crop(192,672,width,height);
        walll04 = sheet.crop(240,672,width,height);
        
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Inside_A5.png"));
        black = sheet.crop(0,0,width,height);
        woodv = sheet.crop(96,96,width,height);
        woodh = sheet.crop(144,96,width,height);
        tilered = sheet.crop(144,192,width,height);
        tilestone1 = sheet.crop(240,96,width,height);
        tilestone2 = sheet.crop(192,192,width,height);
        /*
        */
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Inside_B.png"));
        windownoc = sheet.crop(0,96,width,height*2);
        windowwc = sheet.crop(48,96,width,height*2);
        tallwindownoc = sheet.crop(0,192,width,height*2);
        tallwindowwc = sheet.crop(48,192,width,height*2);
        cabinet = sheet.crop(96,288,width*2,height*2);
        cabinetw = sheet.crop(288,288,width*2,height*2);
        cabinetf = sheet.crop(0,384,width,height*2);
        cabinett = sheet.crop(48,384,width,height*2);
        cabinets = sheet.crop(96,384,width*2,height*2);
        cabinetb = sheet.crop(240,384,width,height*2);
        bed01 = sheet.crop(0,480,width,height*2);
        bed02 = sheet.crop(48,480,width,height*2);
        tablec = sheet.crop(0,576,width,height);
        tabler = sheet.crop(192,624,width,height);
        chairc = sheet.crop(0,624,width,height);
        chairr = sheet.crop(96,624,width,height);
        kstove = sheet.crop(0,672,width,height);
        ksink = sheet.crop(48,672,width,height);
        ktable1 = sheet.crop(96,672,width,height);
        ktable2 = sheet.crop(144,672,width,height);
        bbtable = sheet.crop(48,720,width,height);
        btable = sheet.crop(96,720,width,height);
        wtable = sheet.crop(192,720,width,height);
        
        chimney01 = sheet.crop(528,0,width,height*2);
        chimney02 = sheet.crop(624,0,width,height*2);
        mirror = sheet.crop(432,192,width,height*2);
        closedpot = sheet.crop(432,432,width,height);
        boxsmall = sheet.crop(384,576,width,height);
        boxstack = sheet.crop(480,576,width*2,height*2);
        boxcarrot = sheet.crop(384,672,width,height);
        sack = sheet.crop(384,720,width,height);

        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Inside_C.png"));
        teapot = sheet.crop(48,0,width,height);
        beer = sheet.crop(48,96,width,height);
        wine = sheet.crop(96,144,width,height);
        paper = sheet.crop(0,432,width,height);
        grassbox = sheet.crop(288,480,width,height);
        flowerpot = sheet.crop(192,480,width,height);
        bottle = sheet.crop(192,576,width,height);
        elixirb = sheet.crop(288,576,width,height);
        elixirb = sheet.crop(336,576,width,height);
        bread = sheet.crop(144,624,width,height);
        doll = sheet.crop(0,672,width,height);
        
        sword = sheet.crop(432,0,width,height);
        swordx = sheet.crop(480,0,width,height);
        axe = sheet.crop(528,0,width,height);
        tomb = sheet.crop(576,0,width*2,height);
        swordrack1 = sheet.crop(384,96,width,height);
        swordrack2 = sheet.crop(672,240,width,height*2);
        tombrack = sheet.crop(720,240,width,height*2);
        shield1 = sheet.crop(480,48,width,height);
        shield2 = sheet.crop(528,48,width,height);
        forge = sheet.crop(624,96,width,height);
        helmet = sheet.crop(480,144,width,height);
        hat = sheet.crop(528,144,width,height);
        armor = sheet.crop(528,192,width,height);
        coat = sheet.crop(624,192,width,height);
    }
    
}
