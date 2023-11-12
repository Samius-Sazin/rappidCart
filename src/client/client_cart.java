package client;

import pop_up.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class client_cart extends javax.swing.JFrame {
    private String userNameGmail = "";
    private ResultSet read_result;
    
    private int product_id;
    private String product_name = "";
    private String product_brandName = "";
    private String product_details = "";
    private int product_selected = 0;
    private double product_price = 0.0;
    
    private double total_cost = 0.00;
    
    
    public client_cart() {
        initComponents();
    }

    public client_cart(String userNameGmail, ResultSet read_result) {
        initComponents();
        
        this.userNameGmail = userNameGmail;
        this.read_result = read_result;
        
        try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                Statement statement = connection.createStatement();
                ResultSet read_result_cart = statement.executeQuery("SELECT * FROM rappid_cart.client_cart;");
                
                DefaultTableModel table = (DefaultTableModel)table_.getModel();
                
                //show item to cart jTable from client cart databaseTable
                while(read_result_cart.next()){
                    if(read_result.getString("user_name").compareTo(read_result_cart.getString("client_name")) == 0){
                        product_id = read_result_cart.getInt("product_id");
                        product_name = read_result_cart.getString("product_name");
                        product_brandName = read_result_cart.getString("brand");
                        product_details = read_result_cart.getString("details");
                        product_price = read_result_cart.getDouble("price");
                        product_selected = read_result_cart.getInt("selected");
                                
                        table.addRow(new Object[]{product_id, product_name, product_brandName, product_details, product_price, product_selected});
                    }
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        confirm_2_ = new javax.swing.JButton();
        cancel_2_ = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        product_id_2_ = new javax.swing.JTextField();
        ammount_2_ = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        product_id_1_ = new javax.swing.JTextField();
        ammount_1_ = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cancel_1_ = new javax.swing.JButton();
        confirm_1_ = new javax.swing.JButton();
        closeProfgramButtono_4 = new javax.swing.JButton();
        closeProfgramButtono_ = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        total_cost_ = new javax.swing.JLabel();
        cancel_3_ = new javax.swing.JButton();
        confirm_3_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(240, 85, 35));
        jPanel2.setPreferredSize(new java.awt.Dimension(566, 490));

        table_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Brand", "Details", "Price", "Selected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_.setMaximumSize(new java.awt.Dimension(75, 100));
        table_.setRowHeight(25);
        table_.setRowSelectionAllowed(false);
        table_.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Remove from Cart :");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        confirm_2_.setBackground(new java.awt.Color(138, 48, 19));
        confirm_2_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm_2_.setForeground(new java.awt.Color(255, 255, 255));
        confirm_2_.setText("Confirm");
        confirm_2_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirm_2_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm_2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_2_ActionPerformed(evt);
            }
        });

        cancel_2_.setBackground(new java.awt.Color(138, 48, 19));
        cancel_2_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel_2_.setForeground(new java.awt.Color(255, 255, 255));
        cancel_2_.setText("Cancel");
        cancel_2_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_2_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_2_ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Ammount");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Product ID");

        product_id_2_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        product_id_2_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_id_2_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ammount_2_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ammount_2_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ammount_2_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Order Item :");
        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Product ID");

        product_id_1_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        product_id_1_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_id_1_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ammount_1_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ammount_1_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ammount_1_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Ammount");

        cancel_1_.setBackground(new java.awt.Color(138, 48, 19));
        cancel_1_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel_1_.setForeground(new java.awt.Color(255, 255, 255));
        cancel_1_.setText("Cancel");
        cancel_1_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_1_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_1_ActionPerformed(evt);
            }
        });

        confirm_1_.setBackground(new java.awt.Color(138, 48, 19));
        confirm_1_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm_1_.setForeground(new java.awt.Color(255, 255, 255));
        confirm_1_.setText("Confirm");
        confirm_1_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirm_1_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm_1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_1_ActionPerformed(evt);
            }
        });

        closeProfgramButtono_4.setBackground(new java.awt.Color(138, 48, 19));
        closeProfgramButtono_4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        closeProfgramButtono_4.setForeground(new java.awt.Color(255, 255, 255));
        closeProfgramButtono_4.setText("←");
        closeProfgramButtono_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeProfgramButtono_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeProfgramButtono_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProfgramButtono_4ActionPerformed(evt);
            }
        });

        closeProfgramButtono_.setBackground(new java.awt.Color(138, 48, 19));
        closeProfgramButtono_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeProfgramButtono_.setForeground(new java.awt.Color(255, 255, 255));
        closeProfgramButtono_.setText("X");
        closeProfgramButtono_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeProfgramButtono_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeProfgramButtono_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProfgramButtono_ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Total Cost");

        total_cost_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_cost_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_cost_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        total_cost_.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cancel_3_.setBackground(new java.awt.Color(138, 48, 19));
        cancel_3_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel_3_.setForeground(new java.awt.Color(255, 255, 255));
        cancel_3_.setText("Discard Order");
        cancel_3_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_3_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_3_ActionPerformed(evt);
            }
        });

        confirm_3_.setBackground(new java.awt.Color(138, 48, 19));
        confirm_3_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm_3_.setForeground(new java.awt.Color(255, 255, 255));
        confirm_3_.setText("Confirm Order");
        confirm_3_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirm_3_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm_3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_3_ActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(cancel_1_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(confirm_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(product_id_1_)
                                        .addComponent(ammount_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeProfgramButtono_4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cancel_2_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(confirm_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(product_id_2_)
                                            .addComponent(ammount_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cancel_3_)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(confirm_3_))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(total_cost_, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeProfgramButtono_4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel_3_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirm_3_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(confirm_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(total_cost_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(product_id_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ammount_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancel_2_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(confirm_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(product_id_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ammount_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancel_1_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
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

    private void closeProfgramButtono_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProfgramButtono_ActionPerformed

    private void closeProfgramButtono_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_4ActionPerformed
        setVisible(false);
        dispose();
        new client_dash_board(userNameGmail).setVisible(true);
    }//GEN-LAST:event_closeProfgramButtono_4ActionPerformed

    private void confirm_1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_1_ActionPerformed
        if(total_cost > 0){
            new unsuccessfull_window().random_alert_show("Please finish the current order");
        }
        else{
            Boolean check = false, check_valid_item=false;
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                Statement statement = connection.createStatement();
                ResultSet read_result_cart = statement.executeQuery("SELECT * FROM rappid_cart.client_cart;");

                while(read_result_cart.next()){
                    if(Integer.parseInt(read_result_cart.getString("product_id")) == Integer.parseInt(product_id_1_.getText()) && read_result.getString("user_name").compareTo(read_result_cart.getString("client_name")) == 0 && Integer.parseInt(read_result_cart.getString("selected")) < Integer.parseInt(ammount_1_.getText())){
                        new unsuccessfull_window().random_alert_show("Not enough item!");
                        check = true;
                    }
                    if(Integer.parseInt(read_result_cart.getString("product_id")) == Integer.parseInt(product_id_1_.getText()) && read_result.getString("user_name").compareTo(read_result_cart.getString("client_name")) == 0){
                        check_valid_item = true;
                    }
                }
                if(!check_valid_item){
                    new unsuccessfull_window().random_alert_show("Enter correct ID!");
                    check = true;
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

            if(!check){
                try{
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                    Statement statement = connection.createStatement();
                    ResultSet read_result_cart = statement.executeQuery("SELECT * FROM rappid_cart.client_cart;");

                    while(read_result_cart.next()){
                        if(read_result_cart.getInt("product_id") == Integer.parseInt(product_id_1_.getText())){
                            total_cost = read_result_cart.getDouble("price") * Double.parseDouble(ammount_1_.getText());
                        }
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }

                total_cost_.setText(String.format("%.2f", total_cost) + " tk");
            }
        }
    }//GEN-LAST:event_confirm_1_ActionPerformed

    private void cancel_1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_1_ActionPerformed
        product_id_1_.setText("");
        ammount_1_.setText("");
    }//GEN-LAST:event_cancel_1_ActionPerformed

    private void cancel_2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_2_ActionPerformed
        product_id_2_.setText("");
        ammount_2_.setText("");
    }//GEN-LAST:event_cancel_2_ActionPerformed

    private void confirm_2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_2_ActionPerformed
        if(total_cost > 0){
            new unsuccessfull_window().random_alert_show("Please finish the current order");
        }
        else{
            Boolean check = false, check_valid_item=false;
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                Statement statement = connection.createStatement();
                ResultSet read_result_cart = statement.executeQuery("SELECT * FROM rappid_cart.client_cart;");

                while(read_result_cart.next()){
                    if(Integer.parseInt(read_result_cart.getString("product_id")) == Integer.parseInt(product_id_2_.getText()) && read_result.getString("user_name").compareTo(read_result_cart.getString("client_name")) == 0 && Integer.parseInt(read_result_cart.getString("selected")) < Integer.parseInt(ammount_2_.getText())){
                        new unsuccessfull_window().random_alert_show("Not enough item!");
                        check = true;
                    }
                    if(Integer.parseInt(read_result_cart.getString("product_id")) == Integer.parseInt(product_id_2_.getText()) && read_result.getString("user_name").compareTo(read_result_cart.getString("client_name")) == 0){
                        check_valid_item = true;
                    }
                }
                if(!check_valid_item){
                    new unsuccessfull_window().random_alert_show("Enter correct ID!");
                    check = true;
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            if(!check){
                try{
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                    Statement statement = connection.createStatement();
                    ResultSet read_result_cart = statement.executeQuery("SELECT * FROM rappid_cart.client_cart;");

                    int new_selected_item = 0, sn = 0;

                    while(read_result_cart.next()){
                        if(Integer.parseInt(read_result_cart.getString("product_id")) == Integer.parseInt(product_id_2_.getText()) && read_result.getString("user_name").compareTo(read_result_cart.getString("client_name")) == 0){
                            new_selected_item = read_result_cart.getInt("selected") - Integer.parseInt(ammount_2_.getText());
                            sn = read_result_cart.getInt("serial_number");
                            break;
                        }
                    }

                    if(new_selected_item == 0){
                        statement.execute("DELETE FROM `rappid_cart`.`client_cart` WHERE (`serial_number` = '"+sn+"');");
                    } else{
                        statement.execute("UPDATE `rappid_cart`.`client_cart` SET `selected` = '"+new_selected_item+"' WHERE (`serial_number` = '"+sn+"');");
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                new successfull_window().confirm_order("Successfully edit item in cart", this, userNameGmail);
            }
        }
    }//GEN-LAST:event_confirm_2_ActionPerformed

    private void cancel_3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_3_ActionPerformed
        total_cost_.setText("0.00");
        total_cost = 0.0;
        new unsuccessfull_window().random_alert_show("Order Cancelled");
    }//GEN-LAST:event_cancel_3_ActionPerformed

    private void confirm_3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_3_ActionPerformed
        if(total_cost == 0.0){
            new unsuccessfull_window().random_alert_show("Please select an item first");
        }
        
        else{
            //edit/delete client cart database table
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                Statement statement = connection.createStatement();
                ResultSet read_result_cart = statement.executeQuery("SELECT * FROM rappid_cart.client_cart;");

                int new_selected_ammount = 0, sn = 0;
                while(read_result_cart.next()){
                    if(read_result_cart.getInt("product_id") == Integer.parseInt(product_id_1_.getText()) && read_result.getString("user_name").compareTo(read_result_cart.getString("client_name")) == 0){
                        new_selected_ammount = read_result_cart.getInt("selected") - Integer.parseInt(ammount_1_.getText());
                        sn = read_result_cart.getInt("serial_number");
                        break;
                    }
                }
                if(new_selected_ammount == 0){
                    statement.execute("DELETE FROM `rappid_cart`.`client_cart` WHERE (`serial_number` = '"+sn+"');");
                } else{
                    statement.execute("UPDATE `rappid_cart`.`client_cart` SET `selected` = '"+new_selected_ammount+"' WHERE (`serial_number` = '"+sn+"');");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

            String CLIENT_NAME = "";
            String PRODUCT_NAME = "";
            int PRODUCT_ID = 0, ITEM_BOUGHT = 0;
            double PRICE = 0.0;
            
            
            //edit seller product database table
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                Statement statement = connection.createStatement();
                ResultSet read_result_seller_product2 = statement.executeQuery("SELECT * FROM rappid_cart.seller_product;");

                int new_ammount = 0, new_sold = 0;

                int getProductID = Integer.parseInt(product_id_1_.getText());
                String productID = "";
                if(getProductID < 10){
                    productID = "0000000" + getProductID;
                } else if(getProductID < 100){
                    productID = "000000" + getProductID;
                } else if(getProductID < 1000){
                    productID = "00000" + getProductID;
                } else if(getProductID < 10000){
                    productID = "0000" + getProductID;
                } else if(getProductID < 100000){
                    productID = "000" + getProductID;
                } else if(getProductID < 100000){
                    productID = "00" + getProductID;
                }
                
                CLIENT_NAME = read_result.getString("user_name");
                
                while(read_result_seller_product2.next()){
                    if(read_result_seller_product2.getString("product_id").compareTo(productID) == 0){
                        PRODUCT_NAME = read_result_seller_product2.getString("product_name");
                        PRODUCT_ID = Integer.parseInt(read_result_seller_product2.getString("product_id"));
                        ITEM_BOUGHT = Integer.parseInt(ammount_1_.getText());
                        PRICE = Double.parseDouble(String.format("%.2f", read_result_seller_product2.getDouble("selling_price") * Integer.parseInt(ammount_1_.getText())));
                        
                        new_ammount = read_result_seller_product2.getInt("ammounts") - Integer.parseInt(ammount_1_.getText());
                        new_sold = read_result_seller_product2.getInt("sold") + Integer.parseInt(ammount_1_.getText());
                        break;
                    }
                }
                statement.execute("UPDATE `rappid_cart`.`seller_product` SET `ammounts` = '"+new_ammount+"', `sold` = '"+new_sold+"' WHERE (`product_id` = '"+productID+"');");
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            //edit ordered product database table
            try{
                Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                Statement statement2 = connection2.createStatement();
                ResultSet read_result_order = statement2.executeQuery("SELECT * FROM rappid_cart.ordered_product;");

                statement2.execute("INSERT INTO `rappid_cart`.`ordered_product` (`client_name`, `product_id`, `name`, `item_bought`, `price`, `rating`, `write_something`) VALUES ('"+CLIENT_NAME+"', '"+PRODUCT_ID+"', '"+PRODUCT_NAME+"', '"+ITEM_BOUGHT+"', '"+PRICE+"', '0', '');");
            }
            catch (Exception e){
                e.printStackTrace();
            }

            new successfull_window().confirm_order("Your order has been placed!", this, userNameGmail);
        }
    }//GEN-LAST:event_confirm_3_ActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new client_cart().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammount_1_;
    private javax.swing.JTextField ammount_2_;
    private javax.swing.JButton cancel_1_;
    private javax.swing.JButton cancel_2_;
    private javax.swing.JButton cancel_3_;
    private javax.swing.JButton closeProfgramButtono_;
    private javax.swing.JButton closeProfgramButtono_4;
    private javax.swing.JButton confirm_1_;
    private javax.swing.JButton confirm_2_;
    private javax.swing.JButton confirm_3_;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField product_id_1_;
    private javax.swing.JTextField product_id_2_;
    private javax.swing.JTable table_;
    private javax.swing.JLabel total_cost_;
    // End of variables declaration//GEN-END:variables
}
