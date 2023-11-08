package client;

import rappidcart.login;
import pop_up.*;
import java.sql.*;
import javax.swing.*;

public class client_profile extends javax.swing.JFrame {
    private ResultSet read_result;
    private JFrame client_dash_board_frame;
    
    private String firstName = "";
    private String lastName = "";
    private String userName = "";
    private String gmail = "";
    private int day = 0, month = 0, year = 0;
    private String country = "";
    private String city = "";
    private String address = "";
    
    
    public client_profile() {
        initComponents();
    }
    
    public client_profile(JFrame client_dash_board_frame, ResultSet read_result ) {
        initComponents();
        
        setVisible(true);
        this.read_result = read_result;
        this.client_dash_board_frame = client_dash_board_frame;
     
        try {
            firstName = this.read_result.getString("first_name");
            lastName = this.read_result.getString("last_name");
            userName = this.read_result.getString("user_name");
            gmail = this.read_result.getString("gmail");
            day = this.read_result.getInt("day");
            month = this.read_result.getInt("month");
            year = this.read_result.getInt("year");
            country = this.read_result.getString("country");
            city = this.read_result.getString("city");
            address = this.read_result.getString("address");
            
            if(this.read_result.getString("country").isEmpty() || this.read_result.getString("city").isEmpty() || this.read_result.getString("address").isEmpty()){
                showVarifyStatus_.setText("Account is not varified");
            }
            else{
                showVarifyStatus_.setText("Varified Account");
            }
            
            usersName_.setText(this.read_result.getString("first_name") + " " + this.read_result.getString("last_name"));
            first_name_.setText(this.read_result.getString("first_name"));
            last_name_.setText(this.read_result.getString("last_name"));
            user_name_.setText(this.read_result.getString("user_name"));
            gmail_.setText(this.read_result.getString("gmail"));
            day_.setText(this.read_result.getString("day"));
            month_.setText(this.read_result.getString("month"));
            year_.setText(this.read_result.getString("year"));
            country_.setSelectedItem(this.read_result.getString("country"));
            city_.setSelectedItem(this.read_result.getString("city"));
            address_.setText(this.read_result.getString("address"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        usersPhoto_2 = new javax.swing.JLabel();
        usersName_ = new javax.swing.JLabel();
        showVarifyStatus_ = new javax.swing.JLabel();
        edit_photo_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        saveEdit_ = new javax.swing.JButton();
        cancel_ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        country_ = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        gmail_ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        month_ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        last_name_ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        year_ = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        day_ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        user_name_ = new javax.swing.JTextField();
        city_ = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        address_ = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        first_name_ = new javax.swing.JTextField();
        closeProfgramButtono_ = new javax.swing.JButton();
        closeProfgramButtono_2 = new javax.swing.JButton();
        saveEdit_1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jDesktopPane4.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane4.setForeground(new java.awt.Color(0, 0, 0));
        jDesktopPane4.setMaximumSize(new java.awt.Dimension(181, 68));
        jDesktopPane4.setMinimumSize(new java.awt.Dimension(181, 68));
        jDesktopPane4.setName(""); // NOI18N
        jDesktopPane4.setPreferredSize(new java.awt.Dimension(170, 270));

        usersPhoto_2.setBackground(new java.awt.Color(255, 255, 255));
        usersPhoto_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersPhoto_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profile.png"))); // NOI18N
        usersPhoto_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usersName_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usersName_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersName_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        showVarifyStatus_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showVarifyStatus_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showVarifyStatus_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        edit_photo_.setBackground(new java.awt.Color(240, 85, 35));
        edit_photo_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_photo_.setText("Edit photo");
        edit_photo_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit_photo_.setBorderPainted(false);
        edit_photo_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_photo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_photo_ActionPerformed(evt);
            }
        });

        jDesktopPane4.setLayer(usersPhoto_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(usersName_, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(showVarifyStatus_, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(edit_photo_, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showVarifyStatus_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usersPhoto_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usersName_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(edit_photo_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addComponent(usersPhoto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_photo_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersName_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showVarifyStatus_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        saveEdit_.setBackground(new java.awt.Color(240, 85, 35));
        saveEdit_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveEdit_.setText("Save Edit");
        saveEdit_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveEdit_.setBorderPainted(false);
        saveEdit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveEdit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEdit_ActionPerformed(evt);
            }
        });

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

        jPanel2.setBackground(new java.awt.Color(240, 85, 35));

        country_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        country_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Bangladesh", "Bhutan", "China", "India", "Pakistan", "Nepal", "Srilanka", "Mayanmar" }));
        country_.setBorder(null);
        country_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        country_.setMaximumSize(new java.awt.Dimension(99, 22));
        country_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country_ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("year");

        gmail_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gmail_.setBorder(null);
        gmail_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmail_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("User Name");

        month_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        month_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        month_.setBorder(null);
        month_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month_ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Last Name");

        last_name_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        last_name_.setBorder(null);
        last_name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_name_ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Address");

        year_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        year_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        year_.setBorder(null);
        year_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("month");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("First Name ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("City");

        day_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        day_.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        day_.setBorder(null);
        day_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Gmail");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Birth Info");

        user_name_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        user_name_.setBorder(null);
        user_name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_name_ActionPerformed(evt);
            }
        });

        city_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        city_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Barisal", "Chittagong", "Dhaka", "Khulna", "Mymensingh", "Rajshahi", "Rangpur", "Sylhet" }));
        city_.setBorder(null);
        city_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        city_.setMaximumSize(new java.awt.Dimension(99, 22));
        city_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_ActionPerformed(evt);
            }
        });

        address_.setColumns(20);
        address_.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        address_.setLineWrap(true);
        address_.setRows(2);
        address_.setTabSize(4);
        address_.setWrapStyleWord(true);
        address_.setBorder(null);
        jScrollPane1.setViewportView(address_);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("day");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Country");

        first_name_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        first_name_.setBorder(null);
        first_name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeProfgramButtono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(first_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(last_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(user_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47)
                        .addComponent(gmail_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(city_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(country_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(day_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(month_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(year_, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeProfgramButtono_, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeProfgramButtono_2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(last_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(first_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(user_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gmail_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(year_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveEdit_1.setBackground(new java.awt.Color(240, 85, 35));
        saveEdit_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveEdit_1.setText("Logout");
        saveEdit_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveEdit_1.setBorderPainted(false);
        saveEdit_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveEdit_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEdit_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(saveEdit_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveEdit_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveEdit_)
                    .addComponent(cancel_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveEdit_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void edit_photo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_photo_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_photo_ActionPerformed

    private void saveEdit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEdit_ActionPerformed
        String countryValue = country_.getSelectedItem().toString();
        String cityValue = city_.getSelectedItem().toString();

        if(first_name_.getText().compareTo(firstName)==0 && last_name_.getText().compareTo(lastName)==0 && user_name_.getText().compareTo(userName)==0 && gmail_.getText().compareTo(gmail)==0 && Integer.parseInt(day_.getText()) == day && Integer.parseInt(month_.getText()) == month && Integer.parseInt(year_.getText()) == year && countryValue.compareTo(country)==0 && cityValue.compareTo(firstName)==0 && address_.getText().compareTo(address)==0){

        }
        else{
            try{
                int serial_num = Integer.parseInt(read_result.getString("serial_number"));
                String user_name = read_result.getString("user_name");
                String gmail = read_result.getString("gmail");

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

                Statement statement = connection.createStatement();

                statement.execute("UPDATE `rappid_cart`.`client_profile` SET `first_name` = '"+first_name_.getText()+"', `last_name` = '"+last_name_.getText()+"', `user_name` = '"+user_name_.getText()+"', `day` = '"+Integer.parseInt(day_.getText())+"', `month` = '"+Integer.parseInt(month_.getText())+"', `year` = '"+Integer.parseInt(year_.getText())+"', `gmail` = '"+gmail_.getText()+"', `country` = '"+countryValue+"', `city` = '"+cityValue+"', `address` = '"+address_.getText()+"' WHERE (`serial_number` = '"+serial_num+"') and (`user_name` = '"+user_name+"') and (`gmail` = '"+gmail+"');");
            }
            catch (Exception e){
                e.printStackTrace();
            }

            try{
                String user_name = read_result.getString("user_name");
                String gmail = read_result.getString("gmail");

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rappid_cart", "root", "sami12334");

                Statement statement = connection.createStatement();

                statement.execute("UPDATE `rappid_cart`.`login_signup_client` SET `first_name` = '"+first_name_.getText()+"', `last_name` = '"+last_name_.getText()+"', `user_name` = '"+user_name_.getText()+"', `day` = '"+Integer.parseInt(day_.getText())+"', `month` = '"+Integer.parseInt(month_.getText())+"', `year` = '"+Integer.parseInt(year_.getText())+"', `gmail` = '"+gmail_.getText()+"' WHERE (`user_name` = '"+user_name+"') and (`gmail` = '"+gmail+"');");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        new successfull_window(this).update_seller_client_profile("Successful! Please login again");
    }//GEN-LAST:event_saveEdit_ActionPerformed

    private void cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ActionPerformed
        try{
            usersName_.setText(read_result.getString("first_name") + " " + read_result.getString("last_name"));
            first_name_.setText(read_result.getString("first_name"));
            last_name_.setText(read_result.getString("last_name"));
            user_name_.setText(read_result.getString("user_name"));
            gmail_.setText(read_result.getString("gmail"));
            day_.setText(read_result.getString("day"));
            month_.setText(read_result.getString("month"));
            year_.setText(read_result.getString("year"));
            country_.setSelectedItem(read_result.getString("country"));
            city_.setSelectedItem(read_result.getString("city"));
            address_.setText(read_result.getString("address"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        new unsuccessfull_window().cancel_update_seller_client_profile("Cancellation successful!");
    }//GEN-LAST:event_cancel_ActionPerformed

    private void country_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_country_ActionPerformed

    }//GEN-LAST:event_country_ActionPerformed

    private void gmail_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmail_ActionPerformed

    }//GEN-LAST:event_gmail_ActionPerformed

    private void month_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month_ActionPerformed

    }//GEN-LAST:event_month_ActionPerformed

    private void last_name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_name_ActionPerformed

    }//GEN-LAST:event_last_name_ActionPerformed

    private void year_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_ActionPerformed

    }//GEN-LAST:event_year_ActionPerformed

    private void day_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_ActionPerformed

    }//GEN-LAST:event_day_ActionPerformed

    private void user_name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_name_ActionPerformed

    }//GEN-LAST:event_user_name_ActionPerformed

    private void city_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_ActionPerformed

    }//GEN-LAST:event_city_ActionPerformed

    private void first_name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_ActionPerformed

    }//GEN-LAST:event_first_name_ActionPerformed

    private void closeProfgramButtono_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeProfgramButtono_ActionPerformed

    private void closeProfgramButtono_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProfgramButtono_2ActionPerformed
        setVisible(false);
        dispose();
        client_dash_board_frame.setVisible(true);
    }//GEN-LAST:event_closeProfgramButtono_2ActionPerformed

    private void saveEdit_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEdit_1ActionPerformed
        setVisible(false);
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_saveEdit_1ActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new client_profile().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_;
    private javax.swing.JButton cancel_;
    private javax.swing.JComboBox<String> city_;
    private javax.swing.JButton closeProfgramButtono_;
    private javax.swing.JButton closeProfgramButtono_2;
    private javax.swing.JComboBox<String> country_;
    private javax.swing.JTextField day_;
    private javax.swing.JButton edit_photo_;
    private javax.swing.JTextField first_name_;
    private javax.swing.JTextField gmail_;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last_name_;
    private javax.swing.JTextField month_;
    private javax.swing.JButton saveEdit_;
    private javax.swing.JButton saveEdit_1;
    private javax.swing.JLabel showVarifyStatus_;
    private javax.swing.JTextField user_name_;
    private javax.swing.JLabel usersName_;
    private javax.swing.JLabel usersPhoto_2;
    private javax.swing.JTextField year_;
    // End of variables declaration//GEN-END:variables
}
