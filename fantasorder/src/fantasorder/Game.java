package fantasorder;

import fantasorder.display.Display;
import fantasorder.gfx.Assets;
import static fantasorder.gfx.Assets.bigbroofl;
import static fantasorder.gfx.Assets.greenroof01;
import static fantasorder.gfx.Assets.woodwalls01;
import fantasorder.gfx.GameCamera;
import input.Input;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import states.GameState;
import states.MenuState;
import states.State;

public class Game implements Runnable{
    
    private Display display;
    private int width, height;
    public String title;
    private Thread thread;
    private boolean running = false;
    
    //untuk menggambar
    private BufferStrategy bs;
    private Graphics g;
    
    //Objek Panel
    private State gameState;
    private State menuState;
    
    //Input
    private Input ip;
    
    //Camera
    private GameCamera gameCamera;
    
    //Handler
    private Handler handler;
    
    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        ip = new Input();
    }

    private void init(){
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(ip);
        Assets.init();
        
        gameCamera = new GameCamera(this,0,0);
        handler = new Handler(this);
        
        gameState = new GameState(handler); // this = class game karna parameter
        menuState = new MenuState(handler);
        
        State.setState(gameState);
    }
    
    private void tick(){
        ip.tick();
        
        if(State.getState() != null){
            State.getState().tick();
        }
    }
    
    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        
        //clear screen dulu sebelum dicetak untuk mencegah ada gambar yang nyungsep
        g.clearRect(0, 0, width, height);
        
        //disini drawnya
        if(State.getState() != null){
            State.getState().render(g);    
        }
        //test case
/*        
        g.drawImage(Assets.cgrass01, 0, 0, null);
        g.drawImage(Assets.cgrass02, 0, 48, null);
        g.drawImage(Assets.cgrass03, 0, 96, null);
        g.drawImage(Assets.cgrass04, 48, 0, null);
        g.drawImage(Assets.cgrass05, 48, 48, null);
        g.drawImage(Assets.cgrass06, 48, 96, null);
        g.drawImage(Assets.cgrass07, 96, 0, null);
        g.drawImage(Assets.cgrass08, 96, 48, null);
        g.drawImage(Assets.cgrass09, 96, 96, null);
*/        


        //g.drawImage(Assets.priest_down[2], 10, 10, null);
        //g.drawImage(Assets.archer_left[1], 50, 50, null);
        //g.drawImage(Assets.archer_left[2], 100, 100, null);
        

        //disini end nya
        bs.show();
        g.dispose();
    }
    
    
    @Override
    public void run() {
        init();
        
        int fps = 60;
        double timePerTick = 1000000000/fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;
        
        while(running){
            now = System.nanoTime();
            delta += (now - lastTime) /timePerTick;
            timer += now - lastTime;
            lastTime = now;
            
            if(delta >= 1){
                tick();
                render();
                ticks++;
                delta--;
            }
            
            if(timer >= 1000000000){
                System.out.println("Ticks dan frame : " + ticks);
                ticks = 0;
                timer = 0;
            }
            
        }
        
        stop();
    }
    
    public Input getInput(){
        return ip;
    }
    
    public GameCamera getGameCamera(){
        return gameCamera;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public synchronized void start(){
        if(running){
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    public synchronized void stop(){
        if(!running){
            return;
        }
        
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
