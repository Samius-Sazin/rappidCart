package rappidcart;

import javax.swing.JFrame;
import pop_up.successfull_window;
import pop_up.unsuccessfull_window;


public class login extends javax.swing.JFrame {

    private String usernameOrGmail;
    private String password;
    JFrame homepage;
    
    public login() {
        initComponents();
        homepage = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_1_ = new javax.swing.JPanel();
        panel_2_ = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cart_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_3_ = new javax.swing.JPanel();
        login_part_Panel_ = new javax.swing.JPanel();
        login_with_google = new javax.swing.JButton();
        username_ = new javax.swing.JTextField();
        password_ = new javax.swing.JPasswordField();
        rememberMe_ = new javax.swing.JCheckBox();
        login_ = new javax.swing.JButton();
        signup = new javax.swing.JTextField();
        login_with_fb = new javax.swing.JButton();
        forgot_password_ = new javax.swing.JButton();
        signUp_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seller_ = new javax.swing.JCheckBox();
        client_ = new javax.swing.JCheckBox();
        logo_panel_ = new javax.swing.JPanel();
        rappidcart_logo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel_1_.setBackground(new java.awt.Color(255, 255, 255));

        panel_2_.setBackground(new java.awt.Color(240, 85, 35));

        jPanel4.setBackground(new java.awt.Color(240, 85, 35));

        cart_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart_1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("The Ultimate Solution");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cart_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(85, 85, 85))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cart_logo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_2_Layout = new javax.swing.GroupLayout(panel_2_);
        panel_2_.setLayout(panel_2_Layout);
        panel_2_Layout.setHorizontalGroup(
            panel_2_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_2_Layout.setVerticalGroup(
            panel_2_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        panel_3_.setBackground(new java.awt.Color(255, 255, 255));

        login_part_Panel_.setBackground(new java.awt.Color(255, 255, 255));

        login_with_google.setBackground(new java.awt.Color(240, 85, 35));
        login_with_google.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_with_google.setText("Login with google");
        login_with_google.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_with_google.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        username_.setBackground(new java.awt.Color(204, 204, 204));
        username_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        username_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_ActionPerformed(evt);
            }
        });

        password_.setBackground(new java.awt.Color(204, 204, 204));
        password_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        password_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_ActionPerformed(evt);
            }
        });

        rememberMe_.setBackground(new java.awt.Color(255, 255, 255));
        rememberMe_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rememberMe_.setText("Remember me");
        rememberMe_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rememberMe_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rememberMe_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberMe_ActionPerformed(evt);
            }
        });

        login_.setBackground(new java.awt.Color(240, 85, 35));
        login_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_.setText("Login");
        login_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_MouseClicked(evt);
            }
        });
        login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ActionPerformed(evt);
            }
        });

        signup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signup.setText("Don't have an account?");
        signup.setBorder(null);

        login_with_fb.setBackground(new java.awt.Color(240, 85, 35));
        login_with_fb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_with_fb.setText("Login with facebook");
        login_with_fb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_with_fb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        forgot_password_.setBackground(new java.awt.Color(240, 85, 35));
        forgot_password_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        forgot_password_.setText("Forgot password?");
        forgot_password_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        forgot_password_.setBorderPainted(false);
        forgot_password_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_password_ActionPerformed(evt);
            }
        });

        signUp_.setBackground(new java.awt.Color(240, 85, 35));
        signUp_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUp_.setText("Sign up");
        signUp_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUp_.setBorderPainted(false);
        signUp_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Username or gmail");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Password");

        seller_.setBackground(new java.awt.Color(255, 255, 255));
        seller_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seller_.setText("I am a seller");
        seller_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seller_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seller_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_ActionPerformed(evt);
            }
        });

        client_.setBackground(new java.awt.Color(255, 255, 255));
        client_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        client_.setText("I am a client");
        client_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        client_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_part_Panel_Layout = new javax.swing.GroupLayout(login_part_Panel_);
        login_part_Panel_.setLayout(login_part_Panel_Layout);
        login_part_Panel_Layout.setHorizontalGroup(
            login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_part_Panel_Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(login_part_Panel_Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUp_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(username_)
                        .addComponent(password_)
                        .addGroup(login_part_Panel_Layout.createSequentialGroup()
                            .addComponent(rememberMe_)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(forgot_password_, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(login_with_google, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(login_with_fb, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(login_part_Panel_Layout.createSequentialGroup()
                        .addComponent(seller_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(client_)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        login_part_Panel_Layout.setVerticalGroup(
            login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_part_Panel_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_with_google, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_with_fb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seller_)
                    .addComponent(client_))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rememberMe_)
                    .addComponent(forgot_password_))
                .addGap(12, 12, 12)
                .addComponent(login_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(login_part_Panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUp_))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo_panel_.setBackground(new java.awt.Color(255, 255, 255));

        rappidcart_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout logo_panel_Layout = new javax.swing.GroupLayout(logo_panel_);
        logo_panel_.setLayout(logo_panel_Layout);
        logo_panel_Layout.setHorizontalGroup(
            logo_panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_panel_Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(rappidcart_logo)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        logo_panel_Layout.setVerticalGroup(
            logo_panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logo_panel_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rappidcart_logo)
                .addGap(16, 16, 16))
        );

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

        javax.swing.GroupLayout panel_3_Layout = new javax.swing.GroupLayout(panel_3_);
        panel_3_.setLayout(panel_3_Layout);
        panel_3_Layout.setHorizontalGroup(
            panel_3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_part_Panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo_panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3_Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_3_Layout.setVerticalGroup(
            panel_3_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3_Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(5, 5, 5)
                .addComponent(logo_panel_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_part_Panel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_1_Layout = new javax.swing.GroupLayout(panel_1_);
        panel_1_.setLayout(panel_1_Layout);
        panel_1_Layout.setHorizontalGroup(
            panel_1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1_Layout.createSequentialGroup()
                .addComponent(panel_2_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_3_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_1_Layout.setVerticalGroup(
            panel_1_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_2_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_3_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel_1_, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void username_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_ActionPerformed
        if(!seller_.isSelected() && !client_.isSelected()){
            username_.setText("");
            new unsuccessfull_window().signUp_check_valid_gmail_password("Please select SELLER/CLIENT category");
        }
        
        usernameOrGmail = username_.getText();
        String password_frm_rememberMe = new database().get_password_rememberMe(usernameOrGmail, seller_.isSelected(), client_.isSelected());
        
        if(password_frm_rememberMe != "-1"){
            password_.setText(password_frm_rememberMe);
            password = password_.getText();
        }
    }//GEN-LAST:event_username_ActionPerformed

    private void signUp_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_ActionPerformed
        setVisible(false);
        dispose();
        
        new signup().setVisible(true);
    }//GEN-LAST:event_signUp_ActionPerformed

    private void password_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_ActionPerformed
        password = password_.getText();
    }//GEN-LAST:event_password_ActionPerformed

    private void login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ActionPerformed
        if((!seller_.isSelected() && !client_.isSelected()) || username_.getText().isEmpty() || password_.getText().isEmpty()){
            rememberMe_.setSelected(false);
            new unsuccessfull_window().control_unsuccessful_popUp_window_proceed();
        }
        
        else{
            database d_b = new database();
            Boolean checked_username_pass = d_b.check_usernameOrGmail_password(usernameOrGmail, password, seller_.isSelected(), client_.isSelected());

            if(checked_username_pass){
                new successfull_window(this, seller_.isSelected(), client_.isSelected(), usernameOrGmail).control_successful_popUp_window_login();
                
                if(rememberMe_.isSelected()){
                    new database().rememberMe(usernameOrGmail, password, seller_.isSelected(), client_.isSelected());
                }
            }

            else{
                password_.setText("");
                new unsuccessfull_window().control_Unsuccessful_popUp_window_login();
            }
        } 
    }//GEN-LAST:event_login_ActionPerformed

    private void login_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_login_MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void forgot_password_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_password_ActionPerformed
        setVisible(false);
        new forgotPassword().setVisible(true);
    }//GEN-LAST:event_forgot_password_ActionPerformed

    private void rememberMe_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberMe_ActionPerformed

    }//GEN-LAST:event_rememberMe_ActionPerformed

    private void seller_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_ActionPerformed
        if(!seller_.isSelected()){
            username_.setText("");
            password_.setText("");
        }
        
        if(seller_.isSelected()){
            
            if(client_.isSelected()){
                new unsuccessfull_window().signUp_check_valid_gmail_password("Please select any one of two");
                client_.setSelected(false);
                seller_.setSelected(false);
            }
        }
    }//GEN-LAST:event_seller_ActionPerformed

    private void client_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_ActionPerformed
        if(!client_.isSelected()){
            username_.setText("");
            password_.setText("");
        }
        
        if(client_.isSelected()){
            
            if(seller_.isSelected()){
                new unsuccessfull_window().signUp_check_valid_gmail_password("Please select any one of two");
                seller_.setSelected(false);
                client_.setSelected(false);
            }
        }
    }//GEN-LAST:event_client_ActionPerformed

    
    
//    public static void main(String args[]) {
//        login lg = new login();
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                lg.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cart_logo;
    private javax.swing.JCheckBox client_;
    private javax.swing.JButton forgot_password_;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login_;
    private javax.swing.JPanel login_part_Panel_;
    private javax.swing.JButton login_with_fb;
    private javax.swing.JButton login_with_google;
    private javax.swing.JPanel logo_panel_;
    private javax.swing.JPanel panel_1_;
    private javax.swing.JPanel panel_2_;
    private javax.swing.JPanel panel_3_;
    private javax.swing.JPasswordField password_;
    private javax.swing.JLabel rappidcart_logo;
    private javax.swing.JCheckBox rememberMe_;
    private javax.swing.JCheckBox seller_;
    private javax.swing.JButton signUp_;
    private javax.swing.JTextField signup;
    private javax.swing.JTextField username_;
    // End of variables declaration//GEN-END:variables
}
