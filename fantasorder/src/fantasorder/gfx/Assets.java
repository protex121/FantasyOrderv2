package fantasorder.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    private static final int width = 50, height = 50;
    public static BufferedImage player, dirt, grass, stone, tree;
    
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/archer_walk.png"));
        player = sheet.crop(0, 0, width, height);
        sheet = new SpriteSheet(ImageLoader.loadImage("/image/textures/Outside_A2.png"));
        grass = sheet.crop(0, 0, width, height);
        dirt = sheet.crop(94, 0, width, height);
    }
    
}
