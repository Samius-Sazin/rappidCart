package client;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import pop_up.*;

public class orders_and_review extends javax.swing.JFrame {
    private ResultSet read_result;
    private String userNameGmail;

    public orders_and_review() {
        initComponents();
    }
    
    public orders_and_review(ResultSet read_result, String userNameGmail) {
        initComponents();
        
        this.read_result = read_result;
        this.userNameGmail  = userNameGmail;
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
            Statement statement = connection.createStatement();
            ResultSet read_result_order = statement.executeQuery("SELECT * FROM rappid_cart.ordered_product;");
            
            DefaultTableModel table = (DefaultTableModel)table_.getModel();
            while(read_result_order.next()){
                if(read_result_order.getString("client_name").compareTo(read_result.getString("user_name")) == 0){
                    table.addRow(new Object[]{read_result_order.getInt("product_id"), read_result_order.getString("name"), read_result_order.getDouble("price"), read_result_order.getInt("rating"), read_result_order.getString("write_something")});
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
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(240, 85, 35));

        table_.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        table_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Total price", "Rating", "Write Review"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.Object.class, java.lang.Short.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
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

        jButton11.setBackground(new java.awt.Color(138, 48, 19));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Cancel");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(138, 48, 19));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Save");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void closeProfgramButtono_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_2ActionPerformed
        setVisible(false);
        dispose();
        new client_dash_board(userNameGmail).setVisible(true);
    }//GEN-LAST:event_closeProfgramButtono_2ActionPerformed

    private void closeProfgramButtono_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProfgramButtono_ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setVisible(false);
        dispose();
        
        new orders_and_review(read_result, userNameGmail).setVisible(true);
        new unsuccessfull_window().random_alert_show("Cancelled successfully!");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        DefaultTableModel table = (DefaultTableModel)table_.getModel();
        Object[] newData = new Object[5];
        
        for(int r=0; r<table.getRowCount(); r++){
            for(int c=0; c<table.getColumnCount(); c++){
                newData[c] = table.getValueAt(r, c);
            }
            
            Boolean CHECK = false;
            int PI=0;
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                Statement statement = connection.createStatement();
                ResultSet read_result_order = statement.executeQuery("SELECT * FROM rappid_cart.ordered_product;");

                while(read_result_order.next()){
                    if(read_result_order.getInt("rating") > 0 && read_result_order.getInt("product_id")==Integer.parseInt("" + newData[0]) && read_result_order.getString("client_name").compareTo(read_result.getString("user_name")) == 0 && read_result_order.getInt("price")==Double.parseDouble("" + newData[2])){
                        CHECK = true;
                        break;
                    }
                    if(read_result_order.getInt("product_id")==Integer.parseInt("" + newData[0]) && read_result_order.getString("client_name").compareTo(read_result.getString("user_name")) == 0 && read_result_order.getInt("price")==Double.parseDouble("" + newData[2])){
                        PI = read_result_order.getInt("product_id");
                        statement.execute("UPDATE `rappid_cart`.`ordered_product` SET `rating` = '"+(Integer.parseInt("" + newData[3]))+"', `write_something` = '"+("" + newData[4])+"' WHERE (`serial_number` = '"+(read_result_order.getInt("serial_number"))+"');");
                        break;
                    }
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
            
            if(!CHECK){
                try{
                    Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");
                    Statement statement2 = connection2.createStatement();
                    ResultSet read_result_seller_product2 = statement2.executeQuery("SELECT * FROM rappid_cart.seller_product;");

                    while(read_result_seller_product2.next()){
                        if(Integer.parseInt(read_result_seller_product2.getString("product_id"))== PI){
                            double rrrrr = Double.parseDouble(String.format("%.1f", (((Double.parseDouble("" + newData[3])) + read_result_seller_product2.getDouble("rating")) / 2)));
                            statement2.execute("UPDATE `rappid_cart`.`seller_product` SET `rating` = '"+rrrrr+"' WHERE (`product_id` = '"+read_result_seller_product2.getString("product_id")+"');");
                            break;
                        }
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        new successfull_window().random_alert_show("Review update successfully!");
    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {
        new orders_and_review().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeProfgramButtono_;
    private javax.swing.JButton closeProfgramButtono_2;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_;
    // End of variables declaration//GEN-END:variables
}
