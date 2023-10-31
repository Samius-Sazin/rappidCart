package pop_up;

import client.client_dash_board;
import javax.swing.JFrame;
import rappidcart.signup;
import rappidcart.login;
import seller.seller_dash_board;

public class successfull_window extends javax.swing.JFrame {
    
    private Boolean signUp_check = false;
    private Boolean login_check = false;
    private Boolean newPassword_reset_check = false;
    private JFrame parentFrame;
    private Boolean seller, client;
    private String userNameGmail;
    private Boolean update_seller_proile_check = false;
    private Boolean add_product_check = false;
    private JFrame seller_dash_board_frame;
    
    public successfull_window() {
        initComponents(); 
    }
    
    public successfull_window(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame; 
    }
    
    public successfull_window(JFrame parentFrame, Boolean seller, Boolean client, String userNameGmail) {
        initComponents();
        this.parentFrame = parentFrame;
        this.seller = seller;
        this.client = client;
        this.userNameGmail = userNameGmail;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        continuue_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alert_box_ = new javax.swing.JLabel();
        cross_button_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        continuue_.setBackground(new java.awt.Color(60, 184, 121));
        continuue_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        continuue_.setForeground(new java.awt.Color(255, 255, 255));
        continuue_.setText("Continue");
        continuue_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        continuue_.setBorderPainted(false);
        continuue_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuue_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuue_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(continuue_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(continuue_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_picture.png"))); // NOI18N

        alert_box_.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        alert_box_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cross_button_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cross_button_.setText("X");
        cross_button_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cross_button_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cross_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cross_button_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cross_button_))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alert_box_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cross_button_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alert_box_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void continuue_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuue_ActionPerformed
        if(signUp_check == true){
            signUp_check = false;
            
            alert_box_.setText("");
            setVisible(false);
            dispose();
            
            parentFrame.setVisible(false);
            parentFrame.dispose();
            
            login l_g = new login();
            l_g.setVisible(true);
        }
        
        if(login_check == true){
            login_check = false;
        
            alert_box_.setText("");
            setVisible(false);
            dispose();
            
            if(this.seller){
                new seller_dash_board(this.userNameGmail);
            }
            else if(this.client){
                new client_dash_board(this.userNameGmail);
            }
            
            parentFrame.setVisible(false);
            parentFrame.dispose();
        }
        
        if(newPassword_reset_check == true){
            newPassword_reset_check = false;
        
            alert_box_.setText("");
            setVisible(false);
            dispose();
            
            parentFrame.setVisible(false);
            parentFrame.dispose();
            
            new login().setVisible(true);
        }
        
        if(update_seller_proile_check){
            setVisible(false);
            dispose();
            parentFrame.setVisible(false);
            dispose();
            new login().setVisible(true);
        }
        
        if(add_product_check){
            setVisible(false);
            dispose();
            parentFrame.setVisible(false);
            dispose();
            
            seller_dash_board_frame.setVisible(true);
        }
    }//GEN-LAST:event_continuue_ActionPerformed

    private void cross_button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cross_button_ActionPerformed
        if(signUp_check == true){
            signUp_check = false;
            
            alert_box_.setText("");
            setVisible(false);
            dispose();
            
            parentFrame.setVisible(false);
            parentFrame.dispose();
            
            login l_g = new login();
            l_g.setVisible(true);
        }
        
        if(login_check == true){
            login_check = false;
        
            alert_box_.setText("");
            setVisible(false);
            dispose();
            
            if(this.seller){
                new seller_dash_board(this.userNameGmail);
            }
            else if(this.client){
                new client_dash_board(this.userNameGmail);
            }
            
            parentFrame.setVisible(false);
            parentFrame.dispose();
        }
        
        if(newPassword_reset_check == true){
            newPassword_reset_check = false;
        
            alert_box_.setText("");
            dispose();
        }
        
        if(update_seller_proile_check){
            setVisible(false);
            dispose();
        }
        
        if(add_product_check){
            setVisible(false);
            dispose();
            parentFrame.setVisible(false);
            dispose();
            
            seller_dash_board_frame.setVisible(true);
        }
    }//GEN-LAST:event_cross_button_ActionPerformed
    
    //call from seller_add_product calss
    public void add_seller_product(String show, JFrame seller_dashboardFrame){
        add_product_check = true;
        seller_dash_board_frame = seller_dashboardFrame;
        alert_box_.setText(alert_box_.getText() + show);
        setVisible(true);
    }
    
    //call from seller_profile class
    public void update_seller_client_profile(String show){
        update_seller_proile_check = true;
        alert_box_.setText(alert_box_.getText() + show);
        setVisible(true);
    }
    
    
    //called from newPassword_reset class & control the pop up successful_window for proceed
    public void control_successful_popUp_window_proceed(){
        newPassword_reset_check = true;
        alert_box_.setText(alert_box_.getText() + "Password Changed Successfully");
        setVisible(true);
    }
    
   
    //called from login class & control the pop up successful_window for signUp
    public void control_successful_popUp_window_login(){
        login_check = true;
        alert_box_.setText(alert_box_.getText() + "Login Successfully");
        setVisible(true);
    }
    
    
    
    //called from signup class(proceed button) & control the pop up successful_window for signUp
    public void control_successful_popUp_window_signUp(){
        signUp_check = true;
        alert_box_.setText(alert_box_.getText() + "Account Created Successfully");
        setVisible(true);
    }
    
    
    
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new successfull_window().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert_box_;
    private javax.swing.JButton continuue_;
    private javax.swing.JButton cross_button_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
