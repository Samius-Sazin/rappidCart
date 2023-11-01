package seller;

import java.sql.*;
import javax.swing.*;
import pop_up.*;

public class seller_add_product extends javax.swing.JFrame {
    
    private ResultSet read_result;
    private JFrame seller_dashBoard_frame;

    private String product_name = "";
    private String product_category = "";
    private String product_brandName = "";
    private String product_details = "";
    private String product_forWhome = "";
    private double product_buyPrice = 0.0;
    private double product_sellPrice = 0.0;
    private int product_ammount = 0;
    private String setNullValue = null;

    public seller_add_product() {
        initComponents();
    }
    
    public seller_add_product(JFrame seller_dashBoard_frame, ResultSet read_result) {
        initComponents();
        
        this.read_result = read_result;
        this.seller_dashBoard_frame = seller_dashBoard_frame;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        category_ = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        brand_name_ = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        details_ = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        product_name_ = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        for_whome_ = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        selling_price_ = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ammounts_ = new javax.swing.JTextField();
        buying_price_ = new javax.swing.JTextField();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        usersPhoto_2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        closeProfgramButtono_2 = new javax.swing.JButton();
        closeProfgramButtono_3 = new javax.swing.JButton();
        cancel_ = new javax.swing.JButton();
        saveEdit_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(240, 85, 35));

        category_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        category_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Appliances", "Beauty", "Clothing", "Accessories", "Electronics", "Furniture", "Grocery", "Health", "Home and Kitchen", "Industrial and Scientific", "Jewelry", "Musical Instruments", "Office Products", "Others" }));
        category_.setBorder(null);
        category_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        category_.setMaximumSize(new java.awt.Dimension(99, 22));
        category_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Buying Price");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Details");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Name");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Brand Name");

        brand_name_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        brand_name_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Apple", "Aarong", "Bakers", "Casio", "Chaser", "Dell", "Doel", "Farmer's Hut", "LG", "Otobi", "Pran", "RFL", "Rayans", "Tech Land", "Samsung", "Others" }));
        brand_name_.setBorder(null);
        brand_name_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brand_name_.setMaximumSize(new java.awt.Dimension(99, 22));
        brand_name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand_name_ActionPerformed(evt);
            }
        });

        details_.setColumns(20);
        details_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        details_.setLineWrap(true);
        details_.setRows(2);
        details_.setTabSize(4);
        details_.setWrapStyleWord(true);
        details_.setBorder(null);
        jScrollPane1.setViewportView(details_);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Category");

        product_name_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        product_name_.setBorder(null);
        product_name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("For Whome");

        for_whome_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        for_whome_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Child", "Adult", "For all", "Others" }));
        for_whome_.setBorder(null);
        for_whome_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        for_whome_.setMaximumSize(new java.awt.Dimension(99, 22));
        for_whome_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                for_whome_ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Selling Price");

        selling_price_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selling_price_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        selling_price_.setBorder(null);
        selling_price_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selling_price_ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Ammounts");

        ammounts_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ammounts_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ammounts_.setBorder(null);
        ammounts_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammounts_ActionPerformed(evt);
            }
        });

        buying_price_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buying_price_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buying_price_.setBorder(null);
        buying_price_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buying_price_ActionPerformed(evt);
            }
        });

        jDesktopPane4.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane4.setForeground(new java.awt.Color(0, 0, 0));
        jDesktopPane4.setMaximumSize(new java.awt.Dimension(181, 68));
        jDesktopPane4.setMinimumSize(new java.awt.Dimension(181, 68));
        jDesktopPane4.setName(""); // NOI18N
        jDesktopPane4.setPreferredSize(new java.awt.Dimension(170, 270));

        usersPhoto_2.setBackground(new java.awt.Color(255, 255, 255));
        usersPhoto_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersPhoto_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart 2.png"))); // NOI18N

        jDesktopPane4.setLayer(usersPhoto_2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addComponent(usersPhoto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usersPhoto_2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(240, 85, 35));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Add photo");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        cancel_.setBackground(new java.awt.Color(240, 85, 35));
        cancel_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel_.setText("Cancel");
        cancel_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ActionPerformed(evt);
            }
        });

        saveEdit_.setBackground(new java.awt.Color(240, 85, 35));
        saveEdit_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveEdit_.setText("Save & Exit");
        saveEdit_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveEdit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveEdit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEdit_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeProfgramButtono_3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ammounts_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(selling_price_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buying_price_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(for_whome_, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel14))
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(brand_name_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(category_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(product_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveEdit_, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(closeProfgramButtono_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(product_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(category_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(for_whome_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(buying_price_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selling_price_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ammounts_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cancel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveEdit_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void product_name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_ActionPerformed
        product_name = product_name_.getText();
    }//GEN-LAST:event_product_name_ActionPerformed

    private void brand_name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand_name_ActionPerformed
        product_brandName = brand_name_.getSelectedItem().toString();
    }//GEN-LAST:event_brand_name_ActionPerformed

    private void category_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_ActionPerformed
        product_category = category_.getSelectedItem().toString();
    }//GEN-LAST:event_category_ActionPerformed

    private void for_whome_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_for_whome_ActionPerformed
        product_forWhome = for_whome_.getSelectedItem().toString();
    }//GEN-LAST:event_for_whome_ActionPerformed

    private void selling_price_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selling_price_ActionPerformed
        product_sellPrice = Double.parseDouble(selling_price_.getText());
    }//GEN-LAST:event_selling_price_ActionPerformed

    private void ammounts_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ammounts_ActionPerformed
        product_ammount = Integer.parseInt(ammounts_.getText());
    }//GEN-LAST:event_ammounts_ActionPerformed

    private void buying_price_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buying_price_ActionPerformed
        product_buyPrice = Double.parseDouble(buying_price_.getText());
    }//GEN-LAST:event_buying_price_ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeProfgramButtono_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_2ActionPerformed
        setVisible(false);
        dispose();
        seller_dashBoard_frame.setVisible(true);
    }//GEN-LAST:event_closeProfgramButtono_2ActionPerformed

    private void closeProfgramButtono_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProfgramButtono_3ActionPerformed

    private void cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ActionPerformed
        product_name_.setText(setNullValue);
        category_.setSelectedItem("Select");
        brand_name_.setSelectedItem("Select");
        details_.setText(setNullValue);
        for_whome_.setSelectedItem("Select");
        buying_price_.setText(setNullValue);
        selling_price_.setText(setNullValue);
        ammounts_.setText(setNullValue);
        new unsuccessfull_window().cancel_update_seller_client_profile("Cancellation successful!");
    }//GEN-LAST:event_cancel_ActionPerformed

    private void saveEdit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEdit_ActionPerformed
        String category = category_.getSelectedItem().toString();
        String brandName = brand_name_.getSelectedItem().toString();
        product_details = details_.getText();
        
        try{
            String sellerUserName = read_result.getString("user_name");
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            ResultSet read_result_addProduct = statement.executeQuery("SELECT * FROM rappid_cart.seller_product;");
            
            int Count = 1;
            while(read_result_addProduct.next()){
                Count++;
            }
            
            String productID = setNullValue;
            if(Count < 10){
                productID = "0000000" + Count;
            } else if(Count < 100){
                productID = "000000" + Count;
            } else if(Count < 1000){
                productID = "00000" + Count;
            } else if(Count < 10000){
                productID = "0000" + Count;
            } else if(Count < 100000){
                productID = "000" + Count;
            } else if(Count < 100000){
                productID = "00" + Count;
            }
            
            statement.execute("INSERT INTO `rappid_cart`.`seller_product` (`serial_number`, `user_name`, `product_id`, `product_name`, `category`, `brand_name`, `details`, `for_whome`, `buying_price`, `selling_price`, `ammounts`) VALUES ('"+Count+"', '"+sellerUserName+"', '"+productID+"', '"+product_name+"', '"+product_category+"', '"+product_brandName+"', '"+product_details+"', '"+product_forWhome+"', '"+product_buyPrice+"', '"+product_sellPrice+"', '"+product_ammount+"');");
        }
        catch (Exception e){
            e.printStackTrace();
        }        

        new successfull_window(this).add_seller_product("Item added successfully!", seller_dashBoard_frame);
    }//GEN-LAST:event_saveEdit_ActionPerformed


    public static void main(String args[]) {
        new seller_add_product().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammounts_;
    private javax.swing.JComboBox<String> brand_name_;
    private javax.swing.JTextField buying_price_;
    private javax.swing.JButton cancel_;
    private javax.swing.JComboBox<String> category_;
    private javax.swing.JButton closeProfgramButtono_2;
    private javax.swing.JButton closeProfgramButtono_3;
    private javax.swing.JTextArea details_;
    private javax.swing.JComboBox<String> for_whome_;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField product_name_;
    private javax.swing.JButton saveEdit_;
    private javax.swing.JTextField selling_price_;
    private javax.swing.JLabel usersPhoto_2;
    // End of variables declaration//GEN-END:variables
}
