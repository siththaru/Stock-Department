
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class invoiceModel {
    Connection conn;
    static Logger log = Logger.getLogger(invoiceModel.class.getName());
    int id = 0;
    
    public invoiceModel(){
        conn = db.dbConnection.getConnection();
    }
    
   
    public Object[] getSelectedData(String bcode) {
        String runningQuery = "SELECT * FROM product WHERE `barcode` = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(runningQuery);
            ps.setString(1, bcode);
            
            ResultSet rs = ps.executeQuery();
            Object[] rowData = null;
            while(rs.next()){
                String pname = rs.getString("product_name");
                Double sellPrice = rs.getDouble("selling_price");
                
                rowData = new Object[]{pname,sellPrice};
            }
            return rowData;
        } catch (Exception e) {
            e.printStackTrace();
            log.debug(e.getMessage());
        }
        return null;
    }
    
    public String updateStock(String bcode, String qty) {
        String msg = null;
       String query = "UPDATE stock SET qty=qty-? WHERE barcode=? ";
    
        try {
            PreparedStatement psm = conn.prepareStatement(query);
            psm.setString(1, qty);
            psm.setString(2, bcode);
            psm.execute();
            msg="Success";
        } catch (Exception e) {
            e.printStackTrace();
            msg="Error : "+e.getMessage();
            log.debug(e.getMessage());
        }
    return msg;
    }

    public void loadTable(String keyword, DefaultTableModel invoiceTableModel2) {
        String runningQuery = "SELECT * FROM invoice WHERE invoice_id LIKE ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(runningQuery);
            ps.setString(1, "%"+keyword+"%");
            
            ResultSet rs = ps.executeQuery();
            Object[] rowData;
            invoiceTableModel2.setRowCount(0);
            while(rs.next()){
                int invId = rs.getInt("invoice_id");
                Date date = rs.getDate("date_n_time");
                double total = rs.getDouble("total");
                double discount = rs.getDouble("discount");
                int mobile = rs.getInt("customer_mobile");
                
                rowData = new Object[]{invId,date,total,discount,mobile};
                invoiceTableModel2.addRow(rowData);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            log.debug(e.getMessage());
        }
    }
    
    public void loadTable(Date dt, DefaultTableModel invoiceTableModel2) {
        String runningQuery = "SELECT * FROM invoice WHERE date_n_time LIKE ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(runningQuery);
            ps.setString(1, "%"+dt+"%");
            
            ResultSet rs = ps.executeQuery();
            Object[] rowData;
            invoiceTableModel2.setRowCount(0);
            while(rs.next()){
                int invId = rs.getInt("invoice_id");
                Date date = rs.getDate("date_n_time");
                double total = rs.getDouble("total");
                double discount = rs.getDouble("discount");
                int mobile = rs.getInt("customer_mobile");
                
                rowData = new Object[]{invId,date,total,discount,mobile};
                invoiceTableModel2.addRow(rowData);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            log.debug(e.getMessage());
        }
    }

    public void getSelectedDataById(int invId, DefaultTableModel invoiceTableModel3) {
        String runningQuery = "SELECT * FROM invoice_item ii, product p, brand b WHERE"
                + " ii.barcode=p.barcode AND p.brand_id=b.brand_id AND `invoice_id` = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(runningQuery);
            ps.setInt(1, invId);
            
            ResultSet rs = ps.executeQuery();
            Object[] rowData;
            invoiceTableModel3.setRowCount(0);
            while(rs.next()){
                String bcode = rs.getString("barcode");
                String brand = rs.getString("brand_name");
                String pname = rs.getString("product_name");
                int qty = rs.getInt("qty");
                Double sellPrice = rs.getDouble("selling_price");
                Double disc = rs.getDouble("discount");
                
                rowData = new Object[]{bcode,brand,pname,qty,sellPrice,disc};
                invoiceTableModel3.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.debug(e.getMessage());
        }
    }

    public String checkqty(String barcodee, String inqtyy) {

        String msg = "";
        String query = "SELECT * FROM stock where barcode='" + barcodee + "'";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String qty = "";
            while (rs.next()) {
                qty = String.valueOf(rs.getInt("qty"));
            }
            double casttqty = Double.parseDouble(qty);
            double invqty = Double.parseDouble(inqtyy);
            if (casttqty<invqty) {
                msg = "Not Avalable qty";
            } else {
                msg = "Avalable";
            }
        } catch (Exception e) {
            e.printStackTrace();
            msg = "error" + e.getMessage();
            log.debug(e.getMessage());
        }
        return msg;
    }
    
    public void loadStockTable(String keyword, DefaultTableModel stockTableModel) {
        String runningQuery = "SELECT * FROM stock s, product p WHERE p.barcode=s.barcode AND product_name LIKE ? ORDER BY stock_id";
        
        try {
            PreparedStatement ps = conn.prepareStatement(runningQuery);
            ps.setString(1, "%"+keyword+"%");
            
            ResultSet rs = ps.executeQuery();
            Object[] rowData;
            stockTableModel.setRowCount(0);
            while(rs.next()){
                int stkId = rs.getInt("stock_id");
                String bcode = rs.getString("barcode");
                String pname = rs.getString("product_name");
                int qty = rs.getInt("qty");
                
                rowData = new Object[]{stkId,bcode,pname,qty};
                stockTableModel.addRow(rowData);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            log.debug(e.getMessage());
        }
    }
    
}
