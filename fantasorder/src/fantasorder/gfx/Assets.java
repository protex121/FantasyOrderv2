package fantasorder.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    //motong gambar belum lengkap
    private static final int width = 50, height = 50;
    public static BufferedImage dirt, grass, stone, tree;
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
        
        
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A2.png"));
        grass = sheet.crop(0, 0, width, height);
        dirt = sheet.crop(94, 0, width, height);
    }
    
}
