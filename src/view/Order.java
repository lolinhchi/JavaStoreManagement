<<<<<<< HEAD
=======

<<<<<<< HEAD
=======
<<<<<<< HEAD
dpackage view;
=======
>>>>>>> df28601a58a0a9da68f94cb05a15453f6fa12ce4
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
<<<<<<< HEAD

=======
>>>>>>> df28601a58a0a9da68f94cb05a15453f6fa12ce4
>>>>>>> 54f3798e12d6380c62d384a48dcfc30dfdfd8131
package view;

import java.sql.Connection;
import java.sql.DriverManager;
<<<<<<< HEAD

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Order extends javax.swing.JFrame {

   
    public Order() {
        initComponents();
        SelectProduct(); 
    }
        Connection Con = null;
}
=======
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
<<<<<<< HEAD
=======
=======
>>>>>>> df28601a58a0a9da68f94cb05a15453f6fa12ce4
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
>>>>>>> 54f3798e12d6380c62d384a48dcfc30dfdfd8131
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Order extends javax.swing.JFrame {

   
public Order() {
        initComponents();
        SelectProduct(); 
        SelectCustomer();
        GetToday();
}
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
public void SelectProduct(){
    try {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from PRODUCTTBL");
        ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void SelectCustomer(){
    try {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from CUSTOMERTBL");
        CustomerTb.setModel(DbUtils.resultSetToTableModel(Rs));
        
    }
    catch (SQLException e) {
        e.printStackTrace();
    }
}
private void GetToday()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/đ HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Datelbl.setText(dtf.format(now));
    }
private void update(){
    int newqty = oldqty - Integer.valueOf(Qtytb.getText());
    try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
                String upDateQuery = "Update User1.PROUCTTBL set PRODQTY='"+newqty + "'" +"where PRODID="+ productid;
                Statement add = Con.createStatement();
                add.executeUpdate(upDateQuery);
                JOptionPane.showMessageDialog(this, "Category edited successfully");
                SelectProduct();
                } catch (Exception e) {
                e.printStackTrace();
            }
}
<<<<<<< HEAD
=======
=======
/**
 *
 * @author Lo Linh Chi
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        SelectProduct();
        SelectCustomer();
        GetToDay();
    }

    Connection Con = null;
<<<<<<< HEAD
    Statement St = null;
    ResultSet Rs = null;
    public void SelectProduct(){
    try {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from PRODUCTTBL");

        ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));

        ProductTable2.setModel(DbUtils.resultSetToTableModel(Rs));
>>>>>>> e0da662 (Create ConnectionDB.java + add, edit, delete button on Product form)
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
=======

    Statement St = null;
    ResultSet Rs = null;
    public void SelectProduct(){
//    try {
//        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
//        St = Con.createStatement();
//        Rs = St.executeQuery("select * from PRODUCTTBL");
//
//        ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
//
//        ProductTable2.setModel(DbUtils.resultSetToTableModel(Rs));
//        
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
>>>>>>> df28601a58a0a9da68f94cb05a15453f6fa12ce4
}
    public void SelectCustomer(){
    try {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from CUSTOMERTBL");
        CustomerTable2.setModel(DbUtils.resultSetToTableModel(Rs));
        
    }
    catch (SQLException e) {
        e.printStackTrace();
    }
}
    private void GetToDay(){
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Datelbl.setText(dft.format(now));
    }
    private void Update(){
        int newQty = oldQty - Integer.valueOf(Qtyfield.getText());
        try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
                String upDateQuery = "Update User1.PRODUCTTBL set PRODQTY="+newQty+ " where PRODID="+ productID;
                Statement add = Con.createStatement();
                add.executeUpdate(upDateQuery);
                //JOptionPane.showMessageDialog(this, "Category edited successfully");
                SelectProduct();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
>>>>>>> 54f3798e12d6380c62d384a48dcfc30dfdfd8131
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BillId = new javax.swing.JTextField();
        Qtytb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        AddToBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TotAmtbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTb = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        CustNamelbl = new javax.swing.JLabel();
        CustNamelb2 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STORE MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MANAGE ORDERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("OderID");

        BillId.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        Qtytb.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Qtytb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtytbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Customer");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Date");

        AddBtn.setBackground(new java.awt.Color(255, 0, 51));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add Order");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        AddToBtn.setBackground(new java.awt.Color(255, 0, 51));
        AddToBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddToBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddToBtn.setText(" AddToOrder");
        AddToBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBtnMouseClicked(evt);
            }
        });
        AddToBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(255, 0, 51));
        UpdateBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("View Orders");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Home");

        ProductTable.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODID", "PRODNAME", "PRODQTY", "PRODDESC", "PRODCAT", "PRICE"
            }
        ));
        ProductTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTable.setRowHeight(30);
        ProductTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("PRODUCTS LIST");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("CUSTOMER LIST");

        TotAmtbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TotAmtbl.setForeground(new java.awt.Color(255, 0, 51));
        TotAmtbl.setText("Amount");

        Datelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Datelbl.setForeground(new java.awt.Color(255, 51, 51));
        Datelbl.setText("Date");

        CustomerTb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustID", "Name", "Phone"
            }
        ));
        CustomerTb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CustomerTb.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CustomerTb.setName(""); // NOI18N
        CustomerTb.setRowHeight(30);
        CustomerTb.setSelectionBackground(new java.awt.Color(255, 0, 51));
        CustomerTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTbMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTb);

        BillTable.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "Price", "Total"
            }
        ));
        BillTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BillTable.setRowHeight(30);
        BillTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BillTable);

        CustNamelbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustNamelbl.setForeground(new java.awt.Color(255, 0, 51));
        CustNamelbl.setText("CustName");

        CustNamelb2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CustNamelb2.setForeground(new java.awt.Color(255, 0, 51));
        CustNamelb2.setText("CustName");

        PrintBtn.setBackground(new java.awt.Color(255, 0, 51));
        PrintBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        newBtn.setBackground(new java.awt.Color(255, 0, 51));
        newBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        newBtn.setForeground(new java.awt.Color(255, 255, 255));
        newBtn.setText("New");
        newBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBtnMouseClicked(evt);
            }
        });
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(526, 526, 526))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(TotAmtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newBtn)
                                        .addGap(35, 35, 35)))
                                .addComponent(PrintBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel10)
                                        .addGap(84, 84, 84))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BillId)
                                            .addComponent(Datelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(CustNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel5))
                        .addContainerGap(161, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(Qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(AddToBtn))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(110, 110, 110))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(360, 360, 360)
                    .addComponent(CustNamelb2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillId, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(Qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddToBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CustNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotAmtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(379, 379, 379)
                    .addComponent(CustNamelb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(211, 211, 211)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTbMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomerTb.getModel();
        int myIndex = CustomerTb.getSelectedRow();
        //CustId.setText(model.getValueAt(myIndex, 0).toString());
        //ProdName.setText(model.getValueAt(myIndex, 1).toString());
        CustNamelbl.setText(model.getValueAt(myIndex, 1).toString());
        //ProdDesc.setText(model.getValueAt(myIndex, 3).toString());
    }//GEN-LAST:event_CustomerTbMouseClicked
    
    int i = 1, Uprice, tot = 0,  total;
    String ProdName;
    int flag = 0,productid, oldqty;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int myIndex = ProductTable.getSelectedRow();
        productid = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        ProdName = model.getValueAt(myIndex, 1).toString();
        oldqty = Integer.valueOf(model.getValueAt(myIndex, 2).toString());
        flag = 1 ;
    }//GEN-LAST:event_ProductTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
/*        if(ProdId.getText().isEmpty()|| ProdName.getText().isEmpty()|| Qtytb.getText().isEmpty()|| ProdDesc.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing object to update");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
                String upDateQuery = "Update User1.PRODUCTTBL set PRODNAME='"+ProdName.getText()+"'" + ",PRODQTY="+Qtytb.getText()+ ""
                + ",PRODDESC='" +ProdDesc.getText()+"'" + ",PRODCAT='"+ CatCb.getSelectedItem().toString()+"'"
                + "where PRODID="+ ProdId.getText();
                Statement add = Con.createStatement();
                add.executeUpdate(upDateQuery);
                JOptionPane.showMessageDialog(this, "Product edited successfully");
                SelectProduct();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
*/
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void AddToBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBtnActionPerformed

    private void AddToBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtnMouseClicked
       DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
       int myIndex = ProductTable.getSelectedRow();
       if(flag == 0 || Qtytb.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Select product and enter qty");
       }
       Uprice = Integer.valueOf(model.getValueAt(myIndex, 5).toString());
       tot = Uprice * Integer.valueOf(Qtytb.getText());
       Vector v = new Vector();
       v.add(i);
       v.add(ProdName);
       v.add(Qtytb.getText());
       v.add(Uprice);
       v.add(tot);
       DefaultTableModel dt = (DefaultTableModel)BillTable.getModel();
       dt.addRow(v);
       total = total + tot;
       TotAmtbl.setText(""+ total);
       update();
       i++;
    }//GEN-LAST:event_AddToBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(BillId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the bill ID");
        }
        else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
                PreparedStatement add = Con.prepareStatement("insert into ORDERTBL values(?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(BillId.getText()));
                add.setString(2, CustNamelbl.getText());
                add.setString(3, Datelbl.getText());
                add.setInt(4, Integer.valueOf(TotAmtbl.getText()));

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Order successfully added");
                Con.close();
                SelectProduct();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void QtytbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtytbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtytbActionPerformed

<<<<<<< HEAD
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
=======
    private void QtytbActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
<<<<<<< HEAD
    }//GEN-LAST:event_QtytbActionPerformed

=======
    }                                     
                                                       
>>>>>>> df28601a58a0a9da68f94cb05a15453f6fa12ce4
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     

        System.exit(0);
    }                                    
<<<<<<< HEAD

    private void ProductTable2MouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
=======

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {                                     
>>>>>>> df28601a58a0a9da68f94cb05a15453f6fa12ce4
        new HomeForm().setVisible(true);
        this.dispose();
    }                                    

    private void CustomerTable2MouseClicked(java.awt.event.MouseEvent evt) {                                            
        DefaultTableModel model = (DefaultTableModel)CustomerTable2.getModel();
        int myIndex = CustomerTable2.getSelectedRow();
        //CusID.setText(model.getValueAt(myIndex, 0).toString());
        Custnamelbl.setText(model.getValueAt(myIndex, 1).toString());
        //CusPhone.setText(model.getValueAt(myIndex, 2).toString());
    }                                           

    int i = 1, price, total=0, sum;
    String proName;
    private void AddtoOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        if(flag ==0|| Qtyfield.getText().isEmpty()|| Price.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select Product and enter quantity");
        }
        else{
        price = Integer.valueOf(Price.getText());
        total = price * Integer.valueOf(Qtyfield.getText());
        Vector v = new Vector();
        v.add(i);
        v.add(proName);
        v.add(Qtyfield.getText());
        v.add(price);
        v.add(total);
        DefaultTableModel dt = (DefaultTableModel)BillTable.getModel();
        dt.addRow(v);
        sum = sum + total;
        sumlb.setText(""+sum);
        Update();
        i++;
        
        }
    }                                          

    int flag = 0, productID, oldQty;
    private void ProductTable2MouseClicked(java.awt.event.MouseEvent evt) {                                           
        DefaultTableModel model = (DefaultTableModel)ProductTable2.getModel();
        int myIndex = ProductTable2.getSelectedRow();
        //orderID.setText(model.getValueAt(myIndex, 0).toString());
        productID = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        proName = model.getValueAt(myIndex, 1).toString();
        oldQty=Integer.valueOf(model.getValueAt(myIndex, 2).toString());
        //ProdDesc.setText(model.getValueAt(myIndex, 3).toString());
        flag =1;
    }                                          

    private void printBtnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        try {
            BillTable.print();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }                                     

<<<<<<< HEAD
    private void BillTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTbMouseClicked
>>>>>>> 54f3798e12d6380c62d384a48dcfc30dfdfd8131
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTableMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try{
        BillTable.print();
        }catch(Exception exp){
            exp.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void newBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newBtnMouseClicked

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        DefaultTableModel dm = (DefaultTableModel) BillTable.getModel();
        int rows = dm.getRowCount();
        for(int i = rows - 1;i>=0; i --)
        {
            dm.removeRow(i);
        }
    }//GEN-LAST:event_newBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddToBtn;
    private javax.swing.JTextField BillId;
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel CustNamelb2;
    private javax.swing.JLabel CustNamelbl;
    private javax.swing.JTable CustomerTb;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField Qtytb;
    private javax.swing.JLabel TotAmtbl;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton newBtn;
    // End of variables declaration//GEN-END:variables
}
