package seller;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import pop_up.*;

public class order_and_review_seller extends javax.swing.JFrame {

    private ResultSet read_result;
    private String userNameGmail;
    
    public order_and_review_seller() {
        initComponents();
    }
    
    public order_and_review_seller(ResultSet read_result, String userNameGmail) {
        initComponents();
        
        this.read_result = read_result;
        this.userNameGmail  = userNameGmail;
        
        
        
        try{
            seller_name_.setText(read_result.getString("first_name") + " " + read_result.getString("last_name"));
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
            Statement statement = connection.createStatement();
            ResultSet read_result_seller_product = statement.executeQuery("SELECT * FROM rappid_cart.seller_product;");
            
            DefaultTableModel table = (DefaultTableModel)table_.getModel();
            
            while(read_result_seller_product.next()){
                if(read_result.getString("user_name").compareTo(read_result_seller_product.getString("user_name")) == 0){
                    
                    if(read_result_seller_product.getInt("sold") == 0){
                        table.addRow(new Object[]{read_result_seller_product.getString("product_id"), read_result_seller_product.getString("product_name"), read_result_seller_product.getInt("sold"), (read_result_seller_product.getDouble("selling_price")*read_result_seller_product.getInt("sold")), ((read_result_seller_product.getDouble("selling_price")*read_result_seller_product.getInt("sold")) - (read_result_seller_product.getDouble("buying_price")*read_result_seller_product.getInt("sold"))), ("0")});
                    }
                    else{
                        table.addRow(new Object[]{read_result_seller_product.getString("product_id"), read_result_seller_product.getString("product_name"), read_result_seller_product.getInt("sold"), (read_result_seller_product.getDouble("selling_price")*read_result_seller_product.getInt("sold")), ((read_result_seller_product.getDouble("selling_price")*read_result_seller_product.getInt("sold")) - (read_result_seller_product.getDouble("buying_price")*read_result_seller_product.getInt("sold"))), (read_result_seller_product.getDouble("rating") + "/5")});
                    }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ = new javax.swing.JTable();
        closeProfgramButtono_2 = new javax.swing.JButton();
        closeProfgramButtono_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        seller_name_ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(240, 85, 35));

        table_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Total Sold(item)", "Total sold(tk)", "Profit", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
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
        table_.setRowHeight(25);
        jScrollPane1.setViewportView(table_);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seller Name");

        seller_name_.setEditable(false);
        seller_name_.setBackground(new java.awt.Color(240, 85, 35));
        seller_name_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seller_name_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seller_name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_name_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seller_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(seller_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void closeProfgramButtono_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_2ActionPerformed
        setVisible(false);
        dispose();
        new seller_dash_board(userNameGmail).setVisible(true);
    }//GEN-LAST:event_closeProfgramButtono_2ActionPerformed

    private void closeProfgramButtono_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProfgramButtono_ActionPerformed

    private void seller_name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_name_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seller_name_ActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new order_and_review_seller().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeProfgramButtono_;
    private javax.swing.JButton closeProfgramButtono_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField seller_name_;
    private javax.swing.JTable table_;
    // End of variables declaration//GEN-END:variables
}
