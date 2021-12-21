/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Lo Linh Chi
 */

public class ConnectionDB {

    Connection conn = null;
    Statement sT = null;
    ResultSet rS = null;
    public void getConnectDB(){
        try {
            String uRL = "jdbc:derby://localhost:1527/StoreDB";
            String uSer = "User1";
            String pass = "12345";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = (Connection) DriverManager.getConnection(uRL,uSer,pass);
            System.out.println("Connection ok!");
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    public void showDataTable(String query, JTable tbl){
    try {
        getConnectDB();
        sT = conn.createStatement();
        rS = sT.executeQuery(query);
        tbl.setModel(DbUtils.resultSetToTableModel(rS));
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public PreparedStatement addData(String query ){
        PreparedStatement add = null;
        try {
            add = conn.prepareStatement(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return add;
    }
    public ResultSet getData(String query){
        getConnectDB();
        try {
            sT = conn.createStatement();
            rS = sT.executeQuery(query);
        } catch (Exception e) {
        }
        return rS;
    }
    public void deleteData(String query){
        getConnectDB();
        try {
           sT = (Statement) conn.createStatement();
           sT.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void updateData(String query){
        getConnectDB();
        try {
            sT = (Statement) conn.createStatement();
            sT.executeUpdate(query);
        } catch (Exception e) {
        }
    }
        
}
