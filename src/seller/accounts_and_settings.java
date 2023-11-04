package seller;

import javax.swing.*;
import java.sql.*;
import pop_up.*;

public class accounts_and_settings extends javax.swing.JFrame {
    private ResultSet read_result;
    private JFrame seller_dashBoard_frame;
    
    
    public accounts_and_settings() {
        initComponents();
    }
    
    public accounts_and_settings(JFrame seller_dashBoard_frame, ResultSet read_result) {
        initComponents();
        
        this.read_result = read_result;
        this.seller_dashBoard_frame = seller_dashBoard_frame;
        
        try{
            account_name_.setText(this.read_result.getString("first_name") + " " + this.read_result.getString("last_name"));
            user_name_.setText(this.read_result.getString("user_name"));
            gmail_.setText(this.read_result.getString("gmail"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        account_name_ = new javax.swing.JTextField();
        user_name_ = new javax.swing.JTextField();
        gmail_ = new javax.swing.JTextField();
        change_pass_button_ = new javax.swing.JButton();
        delete_acc_button_ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        closeProfgramButtono_2 = new javax.swing.JButton();
        closeProfgramButtono_3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(240, 85, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Account name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Gmail");

        account_name_.setEditable(false);
        account_name_.setBackground(new java.awt.Color(240, 85, 35));
        account_name_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        account_name_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        account_name_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        user_name_.setEditable(false);
        user_name_.setBackground(new java.awt.Color(240, 85, 35));
        user_name_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_name_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_name_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        gmail_.setEditable(false);
        gmail_.setBackground(new java.awt.Color(240, 85, 35));
        gmail_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gmail_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gmail_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        change_pass_button_.setBackground(new java.awt.Color(240, 85, 35));
        change_pass_button_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        change_pass_button_.setText("Change Password");
        change_pass_button_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        change_pass_button_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change_pass_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_pass_button_ActionPerformed(evt);
            }
        });

        delete_acc_button_.setBackground(new java.awt.Color(240, 85, 35));
        delete_acc_button_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_acc_button_.setText("Delete Account");
        delete_acc_button_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_acc_button_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_acc_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_acc_button_ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        closeProfgramButtono_2.setBackground(new java.awt.Color(138, 48, 19));
        closeProfgramButtono_2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        closeProfgramButtono_2.setForeground(new java.awt.Color(255, 255, 255));
        closeProfgramButtono_2.setText("←");
        closeProfgramButtono_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeProfgramButtono_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeProfgramButtono_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProfgramButtono_2ActionPerformed(evt);
            }
        });

        closeProfgramButtono_3.setBackground(new java.awt.Color(138, 48, 19));
        closeProfgramButtono_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeProfgramButtono_3.setForeground(new java.awt.Color(255, 255, 255));
        closeProfgramButtono_3.setText("X");
        closeProfgramButtono_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeProfgramButtono_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeProfgramButtono_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProfgramButtono_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_acc_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change_pass_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_name_, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(account_name_)
                            .addComponent(gmail_, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeProfgramButtono_3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(closeProfgramButtono_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeProfgramButtono_2)))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gmail_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(change_pass_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_acc_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void delete_acc_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_acc_button_ActionPerformed
        new unsuccessfull_window(this).accounts_and_settings_account_delete("Are you sure?", read_result);
    }//GEN-LAST:event_delete_acc_button_ActionPerformed

    private void closeProfgramButtono_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_2ActionPerformed
        setVisible(false);
        dispose();
        seller_dashBoard_frame.setVisible(true);
    }//GEN-LAST:event_closeProfgramButtono_2ActionPerformed

    private void closeProfgramButtono_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProfgramButtono_3ActionPerformed

    private void change_pass_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_pass_button_ActionPerformed
        setVisible(false);
        new Password_reset(this, read_result).setVisible(true);
    }//GEN-LAST:event_change_pass_button_ActionPerformed


//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new accounts_and_settings().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_name_;
    private javax.swing.JButton change_pass_button_;
    private javax.swing.JButton closeProfgramButtono_2;
    private javax.swing.JButton closeProfgramButtono_3;
    private javax.swing.JButton delete_acc_button_;
    private javax.swing.JTextField gmail_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField user_name_;
    // End of variables declaration//GEN-END:variables
}
