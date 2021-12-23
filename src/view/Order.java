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
package view;
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

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
<<<<<<< HEAD
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

<<<<<<< HEAD

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
<<<<<<< HEAD
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
=======
        Qtyfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel10 = new javax.swing.JLabel();
        TotAmtbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTb = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTb = new javax.swing.JTable();
        CustNamelb1 = new javax.swing.JLabel();
        CustNamelb2 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
=======
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Custnamelbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        AddOrder = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        orderID = new javax.swing.JTextField();
        AddtoOrderBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        printBtn = new javax.swing.JButton();
        sumlb = new javax.swing.JLabel();
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

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
                .addGap(454, 454, 454)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(512, 512, 512)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
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

<<<<<<< HEAD
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
=======
        Qtyfield.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Date");

        ProductTable2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        ProductTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

<<<<<<< HEAD
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
=======
            },
            new String [] {
                "Product ID", "Name", "Quantity", "Description", "Category"
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
            }
        ));
        ProductTable2.setSelectionBackground(new java.awt.Color(255, 0, 51));
        ProductTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable2);

        CustomerTable2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        CustomerTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Phone"
            }
        ));
        CustomerTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable2);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("CUSTOMERS LIST");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("PRODUCT LIST");

<<<<<<< HEAD
        TotAmtbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TotAmtbl.setForeground(new java.awt.Color(255, 0, 51));
        TotAmtbl.setText("Amount");
=======
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("CustomerName");

        Custnamelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Custnamelbl.setText("Customer Name");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("OrderID");
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

        Datelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Datelbl.setText("Date");

<<<<<<< HEAD
        CustomerTb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
=======
        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Orders");
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

        AddOrder.setBackground(new java.awt.Color(255, 0, 51));
        AddOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddOrder.setForeground(new java.awt.Color(255, 255, 255));
        AddOrder.setText("Add Order");
        AddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOrderMouseClicked(evt);
            }
<<<<<<< HEAD
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

        BillTb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BillTb.setModel(new javax.swing.table.DefaultTableModel(
=======
        });

        HomeBtn.setBackground(new java.awt.Color(255, 0, 51));
        HomeBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setText("Home");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });

        BillTable.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "Price", "Total"
            }
        ));
<<<<<<< HEAD
        BillTb.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BillTb.setRowHeight(30);
        BillTb.setSelectionBackground(new java.awt.Color(255, 0, 51));
        BillTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTbMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BillTb);

        CustNamelb1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustNamelb1.setForeground(new java.awt.Color(255, 0, 51));
        CustNamelb1.setText("CustName");
=======
        jScrollPane3.setViewportView(BillTable);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("Price");

        orderID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        AddtoOrderBtn.setBackground(new java.awt.Color(255, 0, 51));
        AddtoOrderBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddtoOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddtoOrderBtn.setText("AddtoOrder");
        AddtoOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddtoOrderBtnMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("Quantity");

        Price.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        printBtn.setBackground(new java.awt.Color(255, 0, 51));
        printBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("Print");
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBtnMouseClicked(evt);
            }
        });
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

        sumlb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        sumlb.setForeground(new java.awt.Color(255, 0, 51));
        sumlb.setText("Amount");

        Price.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Price");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
=======
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(217, 217, 217)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addComponent(TotAmtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PrintBtn))))
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
                                        .addComponent(CustNamelb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(341, 341, 341)))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
=======
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(AddOrder)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Custnamelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Qtytb, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddToBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))))
=======
                                .addGap(10, 10, 10)
                                .addComponent(jButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(HomeBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Qtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddtoOrderBtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sumlb, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216)
                        .addComponent(printBtn)))
                .addContainerGap())
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(740, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
<<<<<<< HEAD
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
                        .addComponent(AddToBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
=======
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotAmtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
=======
                            .addComponent(jLabel8)
                            .addComponent(Custnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddOrder)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(HomeBtn)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Qtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddtoOrderBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printBtn)
                            .addComponent(sumlb))
                        .addGap(5, 5, 5)))
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(270, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
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
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
        );

        pack();
        setLocationRelativeTo(null);
<<<<<<< HEAD
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTbMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomerTb.getModel();
        int myIndex = CustomerTb.getSelectedRow();
        //CustId.setText(model.getValueAt(myIndex, 0).toString());
        //ProdName.setText(model.getValueAt(myIndex, 1).toString());
        CustNamelb1.setText(model.getValueAt(myIndex, 1).toString());
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
=======
    }// </editor-fold>                        

    private void ProductTable1MouseClicked(java.awt.event.MouseEvent evt) {                                           
        /*
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int myIndex = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(myIndex, 0).toString());
        ProdName.setText(model.getValueAt(myIndex, 1).toString());
        Qtytb.setText(model.getValueAt(myIndex, 2).toString());
        ProdDesc.setText(model.getValueAt(myIndex, 3).toString()); */
    }                                          

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {                                          
/*
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int myIndex = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(myIndex, 0).toString());
        ProdName.setText(model.getValueAt(myIndex, 1).toString());
        Qtytb.setText(model.getValueAt(myIndex, 2).toString());
        ProdDesc.setText(model.getValueAt(myIndex, 3).toString());
        */
    }                                         
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
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
    }                                      

<<<<<<< HEAD
    private void AddToBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBtnActionPerformed

    private void AddToBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBtnMouseClicked
       if(flag == 0 || Qtytb.getText().isEmpty()|| Price.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Select product and enter qty");
       }
       Uprice = Integer.valueOf(Price.getText());
       tot = Uprice * Integer.valueOf(Qtytb.getText());
       Vector v = new Vector();
       v.add(i);
       v.add(ProdName);
       v.add(Qtytb.getText());
       v.add(Uprice);
       v.add(tot);
       DefaultTableModel dt = (DefaultTableModel)BillTb.getModel();
       dt.addRow(v);
       total = total + tot;
       TotAmtbl.setText("Rs"+ total);
       update();
       i++;
    }//GEN-LAST:event_AddToBtnMouseClicked
=======
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
        /*
        if(ProdId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the product you want to delete");
        }
        else{
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
                String Id = ProdId.getText();
                String query = "Delete from User1.PRODUCTTBL where PRODID = " + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(query);
                SelectProduct();
                JOptionPane.showMessageDialog(this, "Product successfully deleted");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }                                      
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {                                    
/*
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
            PreparedStatement add = Con.prepareStatement("insert into PRODUCTTBL values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(ProdId.getText()));
            add.setString(2, ProdName.getText());
            add.setInt(3, Integer.valueOf(Qtytb.getText()));
            add.setString(4, ProdDesc.getText());
            add.setString(5, CatCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product successfully added");
            Con.close();
            SelectProduct();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }*/
    }                                   

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
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTbMouseClicked

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try{
        BillTb.print();
        }catch(Exception exp){
            exp.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed
=======
    private void AddOrderMouseClicked(java.awt.event.MouseEvent evt) {                                      
        if(orderID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Order you want to add");
        }
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/StoreDB","User1","12345");
            PreparedStatement add = Con.prepareStatement("insert into ORDERTBL values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(orderID.getText()));
            add.setString(2, Custnamelbl.getText());
            add.setString(3, Datelbl.getText());
            add.setInt(4, Integer.valueOf(sumlb.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Order successfully added");
            Con.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }                                     
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df

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

<<<<<<< HEAD
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddToBtn;
    private javax.swing.JTextField BillId;
    private javax.swing.JTable BillTb;
    private javax.swing.JLabel CustNamelb1;
    private javax.swing.JLabel CustNamelb2;
    private javax.swing.JTable CustomerTb;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JTextField Price;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField Qtytb;
    private javax.swing.JLabel TotAmtbl;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
=======
    // Variables declaration - do not modify                     
    private javax.swing.JButton AddOrder;
    private javax.swing.JButton AddtoOrderBtn;
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel Custnamelbl;
    private javax.swing.JTable CustomerTable2;
    private javax.swing.JLabel Datelbl;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField Price;
    private javax.swing.JTable ProductTable2;
    private javax.swing.JTextField Qtyfield;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
>>>>>>> 689207b2cdec0d48e1368d3d9be811d2b97758df
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField orderID;
    private javax.swing.JButton printBtn;
    private javax.swing.JLabel sumlb;
    // End of variables declaration                   
}
