package seller;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import pop_up.*;

public class seller_manage_product extends javax.swing.JFrame {

    private ResultSet read_result_seller_dashBoard;
    private JFrame seller_dashBoard_frame;
    String productID = "";
    
    private int Count = 0;
    private String product_id = "";
    private String product_name = "";
    private String product_category = "";
    private String product_brandName = "";
    private String product_details = "";
    private String product_forWhome = "";
    private double product_buyPrice = 0.0;
    private double product_sellPrice = 0.0;
    private int product_ammount = 0;
    
    public seller_manage_product() {
        initComponents();
    }
    
    public seller_manage_product(JFrame seller_dashBoardFrame, ResultSet read_result_seller_dashBoard) {
        initComponents();
        
        this.read_result_seller_dashBoard = read_result_seller_dashBoard;
        this.seller_dashBoard_frame = seller_dashBoardFrame;
        
        try{
            if(this.read_result_seller_dashBoard.getString("country").isEmpty() || this.read_result_seller_dashBoard.getString("city").isEmpty() || this.read_result_seller_dashBoard.getString("address").isEmpty() || this.read_result_seller_dashBoard.getString("bank_acc_name").isEmpty() || (this.read_result_seller_dashBoard.getInt("bank_acc_numb") == 0)){
                showVarifyStatus_.setText("Account is not varified");
            } else{
                showVarifyStatus_.setText("Varified Account");
            }
            
            seller_name_.setText(read_result_seller_dashBoard.getString("first_name") + " " + read_result_seller_dashBoard.getString("last_name"));
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            ResultSet read_result_Product = statement.executeQuery("SELECT * FROM rappid_cart.seller_product;");
            
            double overalRating = 0;
            //for table
            DefaultTableModel table = (DefaultTableModel)table_.getModel();
            
            while(read_result_Product.next()){
                if((read_result_seller_dashBoard.getString("user_name").compareTo(read_result_Product.getString("user_name")) == 0)){
                    Count++;
                    
                    product_id = read_result_Product.getString("product_id");
                    product_name = read_result_Product.getString("product_name");
                    product_category = read_result_Product.getString("category");
                    product_brandName = read_result_Product.getString("brand_name");
                    product_details = read_result_Product.getString("details");
                    product_forWhome = read_result_Product.getString("for_whome");
                    product_buyPrice = read_result_Product.getDouble("buying_price");
                    product_sellPrice = read_result_Product.getDouble("selling_price");
                    product_ammount = read_result_Product.getInt("ammounts");

                    //show data on rtable from database
                    table.addRow(new Object[]{product_id, product_name, product_category, product_brandName, product_details, product_forWhome, product_buyPrice, product_sellPrice, product_ammount, Count});
                    
                    overalRating += Double.parseDouble(read_result_Product.getString("rating"));
                }
            }
            
            seller_rating_.setText(String.format("%.1f", overalRating/Count));
            total_products_.setText("" + Count);
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
        jLabel3 = new javax.swing.JLabel();
        seller_name_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        closeProfgramButtono_3 = new javax.swing.JButton();
        closeProfgramButtono_2 = new javax.swing.JButton();
        total_products_ = new javax.swing.JLabel();
        showVarifyStatus_ = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        seller_rating_ = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_ = new javax.swing.JTable();
        cancel_ = new javax.swing.JButton();
        saveEdit_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        serial_number_ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(138, 48, 19));

        jPanel2.setBackground(new java.awt.Color(240, 85, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Seller Name     :");

        seller_name_.setBackground(new java.awt.Color(255, 255, 255));
        seller_name_.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        seller_name_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seller_name_.setToolTipText("");
        seller_name_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total Products :");

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

        total_products_.setBackground(new java.awt.Color(255, 255, 255));
        total_products_.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        total_products_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_products_.setToolTipText("");
        total_products_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        showVarifyStatus_.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        showVarifyStatus_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showVarifyStatus_.setToolTipText("");
        showVarifyStatus_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Account status :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Seller rating");

        seller_rating_.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        seller_rating_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seller_rating_.setToolTipText("");
        seller_rating_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seller_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_products_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showVarifyStatus_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seller_rating_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeProfgramButtono_3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(closeProfgramButtono_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeProfgramButtono_2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seller_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showVarifyStatus_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_products_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seller_rating_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel5))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Category", "Brand Name", "Details", "Audiance", "Buying Price", "Selling Price", "Ammounts", "#"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Short.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        table_.setRowHeight(25);
        table_.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table_.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table_);

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
        saveEdit_.setText("Save changes");
        saveEdit_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveEdit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveEdit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEdit_ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(240, 85, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Enter serial number to delete item :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        serial_number_.setBackground(new java.awt.Color(240, 85, 35));
        serial_number_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        serial_number_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        serial_number_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        serial_number_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serial_number_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serial_number_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveEdit_, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saveEdit_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serial_number_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 768, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeProfgramButtono_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProfgramButtono_3ActionPerformed

    private void closeProfgramButtono_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_2ActionPerformed
        setVisible(false);
        dispose();
        seller_dashBoard_frame.setVisible(true);
    }//GEN-LAST:event_closeProfgramButtono_2ActionPerformed

    private void cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ActionPerformed
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            ResultSet read_result_Product2 = statement.executeQuery("SELECT * FROM rappid_cart.seller_product;");
            
            DefaultTableModel table = (DefaultTableModel)table_.getModel();
            int r = 0;
            
            while(read_result_Product2.next()){
                if((read_result_seller_dashBoard.getString("user_name").compareTo(read_result_Product2.getString("user_name")) == 0)){
                
                    product_id = read_result_Product2.getString("product_id");
                    product_name = read_result_Product2.getString("product_name");
                    product_category = read_result_Product2.getString("category");
                    product_brandName = read_result_Product2.getString("brand_name");
                    product_details = read_result_Product2.getString("details");
                    product_forWhome = read_result_Product2.getString("for_whome");
                    product_buyPrice = read_result_Product2.getDouble("buying_price");
                    product_sellPrice = read_result_Product2.getDouble("selling_price");
                    product_ammount = read_result_Product2.getInt("ammounts");

                    Object[] databaseData = new Object[]{product_id, product_name, product_category, product_brandName, product_details, product_forWhome, product_buyPrice, product_sellPrice, product_ammount};

                    for (int c = 0; c < 9; c++) {
                        table.setValueAt(databaseData[c], r, c);
                    }
                    r++;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } 
        
        new unsuccessfull_window().cancel_update_seller_client_profile("Discard changes!");
    }//GEN-LAST:event_cancel_ActionPerformed

    private void saveEdit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEdit_ActionPerformed
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

            Statement statement = connection.createStatement();
            
            if(serial_number_.getText().compareTo("")!=0 && Integer.parseInt(serial_number_.getText()) > 0){
                statement.execute("DELETE FROM `rappid_cart`.`seller_product` WHERE (`product_id` = '"+productID+"');");
            }
            
            else{
                DefaultTableModel table = (DefaultTableModel)table_.getModel();
            
                Object[] newData = new Object[9];

                int r = 0, COUNT = Count;
                while(COUNT-- > 0){
                    for (int c = 0; c < 9; c++) {
                        newData[c] = table.getValueAt(r, c);
                    }

                    product_id = "" + newData[0];
                    product_name = "" + newData[1];
                    product_category = "" + newData[2];
                    product_brandName = "" + newData[3];
                    product_details = "" + newData[4];
                    product_forWhome = "" + newData[5];
                    product_buyPrice = Double.parseDouble("" + newData[6]);
                    product_sellPrice = Double.parseDouble("" + newData[7]);
                    product_ammount = Integer.parseInt("" + newData[8]);

                    statement.execute("UPDATE `rappid_cart`.`seller_product` SET `product_name` = '"+product_name+"', `category` = '"+product_category+"', `brand_name` = '"+product_brandName+"', `details` = '"+product_details+"', `for_whome` = '"+product_forWhome+"', `buying_price` = '"+product_buyPrice+"', `selling_price` = '"+product_sellPrice+"', `ammounts` = '"+product_ammount+"' WHERE (`product_id` = '"+product_id+"');");

                    r++;
                }
            }
            
        }
        catch (Exception e){
            e.printStackTrace();
        }

        new successfull_window(this).add_seller_product("Changes saved successfully!", seller_dashBoard_frame);
    }//GEN-LAST:event_saveEdit_ActionPerformed

    private void serial_number_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serial_number_ActionPerformed
        DefaultTableModel table = (DefaultTableModel) table_.getModel();
        
        productID = "" + table.getValueAt(Integer.parseInt(serial_number_.getText()) - 1, 0);
        
        table.removeRow(Integer.parseInt(serial_number_.getText()) - 1);
    }//GEN-LAST:event_serial_number_ActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new seller_manage_product().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_;
    private javax.swing.JButton closeProfgramButtono_2;
    private javax.swing.JButton closeProfgramButtono_3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton saveEdit_;
    private javax.swing.JLabel seller_name_;
    private javax.swing.JLabel seller_rating_;
    private javax.swing.JTextField serial_number_;
    private javax.swing.JLabel showVarifyStatus_;
    private javax.swing.JTable table_;
    private javax.swing.JLabel total_products_;
    // End of variables declaration//GEN-END:variables
}
