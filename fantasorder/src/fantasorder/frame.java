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

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnsign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 500, 40));

        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 500, 40));

        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/login.png"))); // NOI18N
        btnlogin.setToolTipText("");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 210, 50));

        btnsign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/signin.png"))); // NOI18N
        btnsign.setToolTipText("");
        btnsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignActionPerformed(evt);
            }
        });
        getContentPane().add(btnsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login_res/bglogin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        this.setVisible(false);
        this.dispose();
        Game game = new Game("Fantasy Order",width,height); // pindah ke frame game
        game.start();
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignActionPerformed
        //belum dibuat
    }//GEN-LAST:event_btnsignActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}