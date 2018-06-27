package states;

import entities.unit.Archer;
import entities.unit.Enemy;
import entities.unit.Unit;
import entities.unit.Warrior;
import entities.unit.Priest;
import fantasorder.Game;
import fantasorder.gfx.Assets;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class fbattlestates extends javax.swing.JFrame {

    public Unit a;
    public Enemy e;
    public Graphics g;
    public Game game;
    
    public fbattlestates(int ket) {
        initComponents();
        this.setSize(900,600);
        
        if(ket == 1){
            a = new Warrior(game,100,100);
        }
        else if(ket == 2){
            a = new Priest(game,100,100);
        }
        else if(ket == 3){
            a = new Archer(game,100,100);
        }
        
        e = new Enemy();
        
        pb.setString(e.hp + "/"+e.max_hp);
        pb.setStringPainted(true);
        pb.setValue(e.hp);
        pb.setMaximum(e.max_hp);
        pb.setBackground(Color.GREEN);
        pb.setVisible(true);
        pb.setSize(100, 30);
       
        jLabel3.setText(Integer.toString(a.getDarah()));
        jLabel4.setText(Integer.toString(a.getMp()));
        
    }

    private fbattlestates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnatk = new javax.swing.JButton();
        btnitem = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnrun = new javax.swing.JButton();
        pb = new javax.swing.JProgressBar();
        lblenemy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HP :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 50, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 50, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 50, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MP :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 50, 30));

        btnatk.setText("ATTACK");
        btnatk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatkActionPerformed(evt);
            }
        });
        getContentPane().add(btnatk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 410, -1));

        btnitem.setText("ITEM");
        getContentPane().add(btnitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 410, -1));

        jButton3.setText("SKILL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 410, -1));

        jButton4.setText("CHARGE MP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 410, -1));

        btnrun.setText("RUN");
        btnrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrunActionPerformed(evt);
            }
        });
        getContentPane().add(btnrun, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 410, -1));
        getContentPane().add(pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 220, 40));

        lblenemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/enemy/Orc.png"))); // NOI18N
        getContentPane().add(lblenemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 270, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/textures/bgbattle.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //skill
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(e.hp>=0){
            e.hp -= a.getSkill();
            a.setDarah(a.getDarah()-10);
            a.setMp(a.getMp()-10);
            pb.setString(e.hp + "/" + e.max_hp);
            jLabel3.setText(Integer.toString(a.getDarah()));
            jLabel4.setText(Integer.toString(a.getMp()));
        }
        else{
            JOptionPane.showMessageDialog(null, "You Win!");
            //e.reHP();
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrunActionPerformed
        
    }//GEN-LAST:event_btnrunActionPerformed
    
    //attack
    private void btnatkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatkActionPerformed
        if(e.hp>=0){
            e.hp -= a.getAttack();
            a.setDarah(a.getDarah()-10);
            pb.setString(e.hp + "/"+e.max_hp);
            jLabel3.setText(Integer.toString(a.getDarah()));
            jLabel4.setText(Integer.toString(a.getMp()));
        }
        else{
            JOptionPane.showMessageDialog(null, "You Win!");
            //e.reHP();
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_btnatkActionPerformed
    
    //charge MP
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        a.setDarah(a.getDarah()-10);
        a.setMp(a.getMp()+10);
        
        pb.setString(e.hp + "/"+e.max_hp);
        jLabel3.setText(Integer.toString(a.getDarah()));
        jLabel4.setText(Integer.toString(a.getMp()));
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fbattlestates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fbattlestates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fbattlestates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fbattlestates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fbattlestates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatk;
    private javax.swing.JButton btnitem;
    private javax.swing.JButton btnrun;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblenemy;
    private javax.swing.JProgressBar pb;
    // End of variables declaration//GEN-END:variables
}
