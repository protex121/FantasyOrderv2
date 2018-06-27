package input;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener, FocusListener{

    private boolean[] keys;
    private static boolean[] justPressed;
    
    public boolean atas, kiri, kanan, bawah;
    
    public Input() {
        keys = new boolean[256];
        justPressed = new boolean[256];
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
        
            keys[evt.getKeyCode()] = true;
            System.out.println("sukses 1");
            justPressed[evt.getKeyCode()] = true;
            
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent evt) {
        
            if(justPressed[evt.getKeyCode()]){
                keys[evt.getKeyCode()] = false;
                System.out.println("sukses 2");
                justPressed[evt.getKeyCode()] = false;
            }
    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        for(int i = 0; i < keys.length; i++){
            keys[i] = false;
        }
			
    }
    
}
