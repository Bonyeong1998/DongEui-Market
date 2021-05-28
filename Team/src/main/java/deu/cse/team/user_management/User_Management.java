/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.user_management;

import deu.cse.team.source.Check_BlackList;
import deu.cse.team.source.SignUpdataInfo;
import deu.cse.team.source.SignUp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 구본영
 */
public class User_Management extends javax.swing.JFrame {

    ArrayList<SignUpdataInfo> Userinfo = new ArrayList<>();
    ArrayList<SignUpdataInfo> Blackinfo = new ArrayList<>();
    /**
     * Creates new form User_Management
     */
    public User_Management() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        User_Table = new javax.swing.JTable();
        Load_UserList_Button = new javax.swing.JButton();
        BlackList_Add_Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Black_Table = new javax.swing.JTable();
        Load_BlackKList_Button = new javax.swing.JButton();
        BlackList_Del_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        User_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PW", "NAME", "EMAIL", "PHONE", "BRITH", "RESIDENCE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(User_Table);

        Load_UserList_Button.setText("불러오기");
        Load_UserList_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_UserList_ButtonActionPerformed(evt);
            }
        });

        BlackList_Add_Button.setText("추가");
        BlackList_Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackList_Add_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Load_UserList_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlackList_Add_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Load_UserList_Button)
                        .addGap(18, 18, 18)
                        .addComponent(BlackList_Add_Button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("블랙리스트 추가", jPanel3);

        Black_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PW", "NAME", "EMAIL", "PHONE", "BRITH", "RESIDENCE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Black_Table);

        Load_BlackKList_Button.setText("불러오기");
        Load_BlackKList_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_BlackKList_ButtonActionPerformed(evt);
            }
        });

        BlackList_Del_Button.setText("삭제");
        BlackList_Del_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackList_Del_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Load_BlackKList_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlackList_Del_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Load_BlackKList_Button)
                        .addGap(18, 18, 18)
                        .addComponent(BlackList_Del_Button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("블랙리스트 삭제", jPanel4);

        Back_Button.setText("이전");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back_Button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Load_UserList_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_UserList_ButtonActionPerformed
        SignUp Userdata = new SignUp();
        
        DefaultTableModel usermodel = (DefaultTableModel) User_Table.getModel();
        usermodel.setNumRows(0);
        
        Userdata.FRead();
        Userdata.Split();
        
        try {
            Userinfo = Userdata.returnSignUpInfo();
        } catch (IOException ex) {
            Logger.getLogger(User_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0 ; i < Userinfo.size() ; i++){
            usermodel.insertRow(usermodel.getRowCount(), new Object[]{
                Userinfo.get(i).getId(),
                Userinfo.get(i).getPw(),
                Userinfo.get(i).getName(),
                Userinfo.get(i).getEmail(),
                Userinfo.get(i).getPhonenum(),
                Userinfo.get(i).getBirth(),
                Userinfo.get(i).getResidence()
            });
        }
    }//GEN-LAST:event_Load_UserList_ButtonActionPerformed

    private void Load_BlackKList_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_BlackKList_ButtonActionPerformed
        Check_BlackList Blackdata = new Check_BlackList();
        
        DefaultTableModel blackmodel = (DefaultTableModel) Black_Table.getModel();
        blackmodel.setNumRows(0);
        
        Blackdata.FRead();
        Blackdata.Split();
        
        try {
            Blackinfo = Blackdata.returnBlackListInfo();
        } catch (IOException ex) {
            Logger.getLogger(User_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0 ; i < Blackinfo.size() ; i++){
            blackmodel.insertRow(blackmodel.getRowCount(), new Object[]{
                Blackinfo.get(i).getId(),
                Blackinfo.get(i).getPw(),
                Blackinfo.get(i).getName(),
                Blackinfo.get(i).getEmail(),
                Blackinfo.get(i).getPhonenum(),
                Blackinfo.get(i).getBirth(),
                Blackinfo.get(i).getResidence()
            });
        }
    }//GEN-LAST:event_Load_BlackKList_ButtonActionPerformed

    private void BlackList_Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackList_Add_ButtonActionPerformed
        
    }//GEN-LAST:event_BlackList_Add_ButtonActionPerformed

    private void BlackList_Del_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackList_Del_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BlackList_Del_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(User_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton BlackList_Add_Button;
    private javax.swing.JButton BlackList_Del_Button;
    private javax.swing.JTable Black_Table;
    private javax.swing.JButton Load_BlackKList_Button;
    private javax.swing.JButton Load_UserList_Button;
    private javax.swing.JTable User_Table;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}