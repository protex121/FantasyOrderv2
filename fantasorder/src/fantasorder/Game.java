package fantasorder;

import fantasorder.display.Display;
import fantasorder.gfx.Assets;
import input.Input;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import states.GameState;
import states.MenuState;
import states.State;

public class Game implements Runnable{
    
    private Display display;
    public int width, height;
    public String title;
    private Thread thread;
    private boolean running = false;
    
    private BufferStrategy bs;
    private Graphics g;
    
    //Panel
    private State gameState;
    private State menuState;
    
    //input
    private Input ip;
    
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
        
        gameState = new GameState(this); // this = class game karna parameter
        menuState = new MenuState(this);
        
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
        
        //g.drawImage(Assets.dirt, 10, 10, null);
        //g.drawImage(Assets.grass, 60, 10, null);
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
