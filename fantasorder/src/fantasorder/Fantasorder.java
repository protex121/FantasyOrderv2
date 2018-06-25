package fantasorder;

import fantasorder.display.Display;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Fantasorder {

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        
        frame f = new frame();
        f.setVisible(true);
        //Game game = new Game("Fantasy Order",width,height);
        //game.start();
    }
    
}
