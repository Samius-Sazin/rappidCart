package rappidcart;

import pop_up.unsuccessfull_window;
import pop_up.successfull_window;

public class forgotPassword extends javax.swing.JFrame {

    private String usernameOrGmail;
    private int day, month, year;
    private String gmail;

    public forgotPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        resest_password = new javax.swing.JLabel();
        usernameOrGmail_ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        day_ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cancel_ = new javax.swing.JButton();
        proceed_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        seller_ = new javax.swing.JCheckBox();
        client_ = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        month_ = new javax.swing.JTextField();
        year_ = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        resest_password.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        resest_password.setForeground(new java.awt.Color(235, 83, 34));
        resest_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resest_password.setText("Reseting password");

        usernameOrGmail_.setBackground(new java.awt.Color(204, 204, 204));
        usernameOrGmail_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameOrGmail_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameOrGmail_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameOrGmail_ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("username or gmail");

        day_.setBackground(new java.awt.Color(204, 204, 204));
        day_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        day_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        day_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        day_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Date of birth");

        cancel_.setBackground(new java.awt.Color(240, 85, 35));
        cancel_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel_.setText("Cancel");
        cancel_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_.setBorderPainted(false);
        cancel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ActionPerformed(evt);
            }
        });

        proceed_.setBackground(new java.awt.Color(240, 85, 35));
        proceed_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        proceed_.setText("Proceed");
        proceed_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        proceed_.setBorderPainted(false);
        proceed_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceed_ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        seller_.setBackground(new java.awt.Color(204, 204, 204));
        seller_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seller_.setText("Seller");
        seller_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seller_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seller_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_ActionPerformed(evt);
            }
        });

        client_.setBackground(new java.awt.Color(204, 204, 204));
        client_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        client_.setText("Client");
        client_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        client_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(240, 85, 35));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("dd");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("mm");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("yyyy");

        month_.setBackground(new java.awt.Color(204, 204, 204));
        month_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        month_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        month_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        month_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month_ActionPerformed(evt);
            }
        });

        year_.setBackground(new java.awt.Color(204, 204, 204));
        year_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        year_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        year_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        year_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(seller_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(client_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(proceed_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(resest_password, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(3, 3, 3)
                                .addComponent(day_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year_, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usernameOrGmail_, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resest_password)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameOrGmail_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(day_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(month_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(client_)
                            .addComponent(seller_))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proceed_)
                            .addComponent(cancel_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void year_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_ActionPerformed
        if(day_.getText().isEmpty() || month_.getText().isEmpty()){
            new unsuccessfull_window().control_unsuccessful_popUp_window_year();
            year_.setText("");
        }
        year = Integer.parseInt(year_.getText());
    }//GEN-LAST:event_year_ActionPerformed

    private void month_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month_ActionPerformed
        if(!month_.getText().isEmpty()){
            month = Integer.parseInt(month_.getText());
            if(month > 12 || month <= 0){
                new unsuccessfull_window().control_unsuccessful_popUp_window_month_day();
                month_.setText("");
            }
        }
        else{
            new unsuccessfull_window().control_unsuccessful_popUp_window_month_day();
        }
    }//GEN-LAST:event_month_ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void client_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_ActionPerformed
        if(client_.isSelected()){

            if(seller_.isSelected()){
                new unsuccessfull_window().signUp_check_valid_gmail_password("Please select any one of two");
                seller_.setSelected(false);
                client_.setSelected(false);
            }
        }
    }//GEN-LAST:event_client_ActionPerformed

    private void seller_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_ActionPerformed
        if(seller_.isSelected()){

            if(client_.isSelected()){
                new unsuccessfull_window().signUp_check_valid_gmail_password("Please select any one of two");
                client_.setSelected(false);
                seller_.setSelected(false);
            }
        }
    }//GEN-LAST:event_seller_ActionPerformed

    private void proceed_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceed_ActionPerformed
        if(year_.getText().isEmpty() || usernameOrGmail_.getText().isEmpty() || (!seller_.isSelected() && !client_.isSelected())){
            new unsuccessfull_window().control_unsuccessful_popUp_window_proceed();
        }

        else{
            database d_b = new database();
            Boolean check_username_birth = d_b.check_usernameOrGmail_birthInfo_seller_client(usernameOrGmail, day, month, year, seller_.isSelected(), client_.isSelected());

            if(check_username_birth){
                setVisible(false);
                dispose();

                newPassword_reset npr = new newPassword_reset();
                npr.usernameGmail_tofind = usernameOrGmail;
                npr.seller = seller_.isSelected();
                npr.client = client_.isSelected();
                npr.setVisible(true);
            }

            else{
                client_.setSelected(false);
                seller_.setSelected(false);
                new unsuccessfull_window().control_Unsuccessful_popUp_window_forgotPassword();
            }
        }
    }//GEN-LAST:event_proceed_ActionPerformed

    private void cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ActionPerformed

        usernameOrGmail = "";
        gmail = "";
        day = 0;
        month = 0;
        year = 0;

        new unsuccessfull_window(this).control_Unsuccessful_popUp_window_signUp_forgotPassword(); //Show "cancelation successfull"; and open login window
    }//GEN-LAST:event_cancel_ActionPerformed

    private void day_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_ActionPerformed
        if(!day_.getText().isEmpty()){
            day = Integer.parseInt(day_.getText());
            if(day > 31 || day <= 0){
                new unsuccessfull_window().control_unsuccessful_popUp_window_month_day();
                day_.setText("");
            }
        }
        else{
            new unsuccessfull_window().control_unsuccessful_popUp_window_month_day();
        }
    }//GEN-LAST:event_day_ActionPerformed

    private void usernameOrGmail_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameOrGmail_ActionPerformed
        usernameOrGmail = usernameOrGmail_.getText();
    }//GEN-LAST:event_usernameOrGmail_ActionPerformed


    
    
    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new forgotPassword().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_;
    private javax.swing.JCheckBox client_;
    private javax.swing.JTextField day_;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField month_;
    private javax.swing.JButton proceed_;
    private javax.swing.JLabel resest_password;
    private javax.swing.JCheckBox seller_;
    private javax.swing.JTextField usernameOrGmail_;
    private javax.swing.JTextField year_;
    // End of variables declaration//GEN-END:variables
}
