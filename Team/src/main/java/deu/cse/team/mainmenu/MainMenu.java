/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.mainmenu;

import deu.cse.team.Delivery.Delivery_Frame;
import deu.cse.team.bbs.Bbs;
import deu.cse.team.product_registration.RegistrationProduct_Frame;
import deu.cse.team.login.Login;
import deu.cse.team.notice.Show_Notice;

/**
 *
 * @author BON
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrationProduct_Button = new javax.swing.JButton();
        ProductSearch_Button = new javax.swing.JButton();
        Delivery_Button = new javax.swing.JButton();
        LogOut_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrationProduct_Button.setText("제품등록");
        RegistrationProduct_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationProduct_ButtonActionPerformed(evt);
            }
        });

        ProductSearch_Button.setText("제품검색");
        ProductSearch_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductSearch_ButtonActionPerformed(evt);
            }
        });

        Delivery_Button.setText("배송조회");
        Delivery_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delivery_ButtonActionPerformed(evt);
            }
        });

        LogOut_button.setText("로그아웃");
        LogOut_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_buttonActionPerformed(evt);
            }
        });

        jButton1.setText("공지사항");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(LogOut_button)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Delivery_Button)
                    .addComponent(RegistrationProduct_Button)
                    .addComponent(ProductSearch_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(RegistrationProduct_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProductSearch_Button)
                .addGap(18, 18, 18)
                .addComponent(Delivery_Button)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(LogOut_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductSearch_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductSearch_ButtonActionPerformed
        // TODO add your handling code here:
        Bbs bbs = new Bbs();
        bbs.setVisible(true);
    }//GEN-LAST:event_ProductSearch_ButtonActionPerformed

    private void RegistrationProduct_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationProduct_ButtonActionPerformed
        RegistrationProduct_Frame RF = new RegistrationProduct_Frame();
        RF.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistrationProduct_ButtonActionPerformed

    private void Delivery_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delivery_ButtonActionPerformed
        Delivery_Frame DF = new Delivery_Frame();
        DF.setVisible(true);
        DF.dispose();
    }//GEN-LAST:event_Delivery_ButtonActionPerformed

    private void LogOut_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_buttonActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOut_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Show_Notice sn = new Show_Notice();
        sn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delivery_Button;
    private javax.swing.JButton LogOut_button;
    private javax.swing.JButton ProductSearch_Button;
    private javax.swing.JButton RegistrationProduct_Button;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
