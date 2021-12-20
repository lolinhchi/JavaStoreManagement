
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Qtyfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
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

        Qtyfield.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Date");

        ProductTable2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        ProductTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Description", "Category"
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

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("CustomerName");

        Custnamelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Custnamelbl.setText("Customer Name");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("OrderID");

        Datelbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Datelbl.setText("Date");

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Orders");

        AddOrder.setBackground(new java.awt.Color(255, 0, 51));
        AddOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddOrder.setForeground(new java.awt.Color(255, 255, 255));
        AddOrder.setText("Add Order");
        AddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOrderMouseClicked(evt);
            }
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
            new Object [][] {

            },
            new String [] {
                "Num", "Product", "Quantity", "Price", "Total"
            }
        ));
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

        sumlb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        sumlb.setForeground(new java.awt.Color(255, 0, 51));
        sumlb.setText("Amount");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(AddOrder)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Custnamelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
    }                                     
                                                       
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     

        System.exit(0);
    }                                    

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {                                     
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
