package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener{

    private boolean[] keys;
    public boolean atas, kiri, kanan, bawah;
    
    public Input() {
        keys = new boolean[256];
    }
    
    public void tick(){
        atas = keys[KeyEvent.VK_W];
        kiri = keys[KeyEvent.VK_A];
        kanan = keys[KeyEvent.VK_D];
        bawah = keys[KeyEvent.VK_S];
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent evt) {
        char temp = evt.getKeyChar();
        
        //if(temp == 'w' || temp == 'a' || temp == 's' || temp == 'd'){
            keys[evt.getKeyCode()] = true;
            System.out.println("sukses1");
        //}
        
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent evt) {
        char temp = evt.getKeyChar();
        
        //if(temp == 'w' || temp == 'a' || temp == 's' || temp == 'd'){
            keys[evt.getKeyCode()] = false;
            System.out.println("sukses2");
        //}
        
    }
    
}
