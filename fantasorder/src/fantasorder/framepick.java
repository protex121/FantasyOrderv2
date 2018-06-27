package fantasorder;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import states.fbattlestates;

public class framepick extends javax.swing.JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;
    
    public framepick() {
        initComponents();
        btnarcher.setOpaque(false);
        btnarcher.setContentAreaFilled(false);
        btnarcher.setBorderPainted(false);
        
        btnpriest.setOpaque(false);
        btnpriest.setContentAreaFilled(false);
        btnpriest.setBorderPainted(false);
        
        btnwarrior.setOpaque(false);
        btnwarrior.setContentAreaFilled(false);
        btnwarrior.setBorderPainted(false);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnwarrior = new javax.swing.JButton();
        btnpriest = new javax.swing.JButton();
        btnarcher = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnwarrior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/pickwarrior.png"))); // NOI18N
        btnwarrior.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/pickwarriorhover.png"))); // NOI18N
        btnwarrior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwarriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnwarrior, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 320, 480));

        btnpriest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/pickpriest.png"))); // NOI18N
        btnpriest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/pickpriesthover.png"))); // NOI18N
        btnpriest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpriestActionPerformed(evt);
            }
        });
        getContentPane().add(btnpriest, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 320, 480));

        btnarcher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/pickacher.png"))); // NOI18N
        btnarcher.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/pickarcherhover.png"))); // NOI18N
        btnarcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarcherActionPerformed(evt);
            }
        });
        getContentPane().add(btnarcher, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 310, 480));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/bgpick.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnwarriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwarriorActionPerformed
        this.setVisible(false);
        this.dispose();
        
        fbattlestates f = new fbattlestates(1);
        f.setVisible(true);
        //Game game = new Game("Fantasy Order",width,height); // pindah ke frame game
        //game.setPlayer(1);
        //game.start();
    }//GEN-LAST:event_btnwarriorActionPerformed

    private void btnpriestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpriestActionPerformed
        this.setVisible(false);
        this.dispose();
        fbattlestates f = new fbattlestates(2);
        f.setVisible(true);
        //Game game = new Game("Fantasy Order",width,height); // pindah ke frame game
        //game.setPlayer(2);
        //game.start();
    }//GEN-LAST:event_btnpriestActionPerformed

    private void btnarcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarcherActionPerformed
        this.setVisible(false);
        this.dispose();
        fbattlestates f = new fbattlestates(3);
        f.setVisible(true);
        //Game game = new Game("Fantasy Order",width,height); // pindah ke frame game
        //game.setPlayer(3);
        //game.start();
    }//GEN-LAST:event_btnarcherActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framepick().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnarcher;
    private javax.swing.JButton btnpriest;
    private javax.swing.JButton btnwarrior;
    // End of variables declaration//GEN-END:variables
}

