package fantasorder;

import fantasorder.gfx.AudioPlayer;
import java.awt.Dimension;
import java.awt.Toolkit;
<<<<<<< HEAD
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
=======
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
>>>>>>> origin/sion

public class frame extends javax.swing.JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;
    
    private AudioPlayer bgm;
    private AudioPlayer hover;
    private AudioPlayer click;
    
    public frame() {
        initComponents();
        this.setSize(width, height);
        
        btnlogin.setOpaque(false);
        btnlogin.setContentAreaFilled(false);
        btnlogin.setBorderPainted(false);
        
        btnsign.setOpaque(false);
        btnsign.setContentAreaFilled(false);
        btnsign.setBorderPainted(false);
        
        btnexit.setOpaque(false);
        btnexit.setContentAreaFilled(false);
        btnexit.setBorderPainted(false);
        
        bgm = new AudioPlayer("/sound/bgm.wav");
        bgm.play();
        hover = new AudioPlayer("/sound/btnhover.wav");
        click = new AudioPlayer("/sound/btnclick.wav");
        btnlogin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e); //To change body of generated methods, choose Tools | Templates.
                hover.play();
                hover.stop();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); //To change body of generated methods, choose Tools | Templates.
                hover.stop();
            }
        });
        btnsign.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e); //To change body of generated methods, choose Tools | Templates.
                hover.play();
                hover.stop();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); //To change body of generated methods, choose Tools | Templates.
                hover.stop();
            }
        });
        btnexit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e); //To change body of generated methods, choose Tools | Templates.
                hover.play();
                hover.stop();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); //To change body of generated methods, choose Tools | Templates.
                hover.stop();
            }
        });
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlogin = new javax.swing.JButton();
        btnsign = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/login.png"))); // NOI18N
        btnlogin.setToolTipText("");
        btnlogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/loginhover.png"))); // NOI18N
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 480, 50));

        btnsign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/signin.png"))); // NOI18N
        btnsign.setToolTipText("");
        btnsign.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/signinhover.png"))); // NOI18N
        btnsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignActionPerformed(evt);
            }
        });
        getContentPane().add(btnsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 480, 50));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/exit.png"))); // NOI18N
        btnexit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/exithover.png"))); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 480, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //untuk newgame
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        click.play();
        this.setVisible(false);
        this.dispose();
        bgm.stop();
        //click.stop();
        framepick f = new framepick();
        f.setVisible(true);
        
    }//GEN-LAST:event_btnloginActionPerformed
    
//untuk load
    private void btnsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignActionPerformed
        //belum dibuat
        click.play();
        this.setVisible(false);
        this.dispose();
        bgm.stop();
        //click.stop();
        
        Game game = new Game("Fantasy Order",width,height); // pindah ke frame game
        game.setPlayer(1); // berasal dari load
        game.start();
        
    }//GEN-LAST:event_btnsignActionPerformed

 /*       public void save(){
        try{
            File file = new File("user.txt");
         
            if(file.delete())
            {
                System.out.println("File deleted successfully");
            }
            else
            {
                System.out.println("Failed to delete the file");
            }
            
            FileOutputStream fileout=new FileOutputStream("user.txt");
            ObjectOutputStream out=new ObjectOutputStream(fileout);
            out.close();
            fileout.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void load(){
        try{
                    FileInputStream filein=new FileInputStream("user.txt");
                    ObjectInputStream in=new ObjectInputStream(filein);
                    in.close();
                    filein.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
    }*/
    
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        click.play();
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsign;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}