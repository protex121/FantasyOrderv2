package fantasorder;

import fantasorder.display.Display;
import fantasorder.gfx.Assets;
import fantasorder.gfx.GameCamera;
import input.Input;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import states.GameState;
import states.State;
import states.battlestates;

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
    public State gameState;
    public State battlestate;
    
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
    
    int i;
    public void setPlayer(int i){
        this.i = i;
    }

    private void init(){
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(ip);
        Assets.init();
        handler = new Handler(this);
        gameCamera = new GameCamera(handler,0,0);

        gameState = new GameState(handler,i); // this = class game karna parameter --> pindah ke dalam "PANEL" game

        battlestate = new battlestates(handler);
        
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
    
    public boolean isInput(){
        return ip.isInput();
    }
    
    public GameCamera getGameCamera(){
        return gameCamera;
    }
    
    public void setGameCamera(GameCamera a){
        this.gameCamera=a;
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
