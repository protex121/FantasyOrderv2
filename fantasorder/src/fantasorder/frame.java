package fantasorder;

import java.awt.Dimension;
import java.awt.Toolkit;

public class frame extends javax.swing.JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;
    
    public frame() {
        initComponents();
        this.setSize(width, height);
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
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 410, 50));

        btnsign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/signin.png"))); // NOI18N
        btnsign.setToolTipText("");
        btnsign.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/signinhover.png"))); // NOI18N
        btnsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignActionPerformed(evt);
            }
        });
        getContentPane().add(btnsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 410, 50));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/exit.png"))); // NOI18N
        btnexit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/exithover.png"))); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 410, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //untuk newgame
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        this.setVisible(false);
        this.dispose();
        Game game = new Game("Fantasy Order",width,height); // pindah ke frame game
        game.start();
    }//GEN-LAST:event_btnloginActionPerformed
    
//untuk load
    private void btnsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignActionPerformed
        //belum dibuat
    }//GEN-LAST:event_btnsignActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
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