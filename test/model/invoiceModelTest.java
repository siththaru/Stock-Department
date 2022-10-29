/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Siththaru
 */
public class invoiceModelTest {
    
    public invoiceModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSelectedData method, of class invoiceModel.
     */
    @Test
    public void testGetSelectedData() {
        System.out.println("getSelectedData");
        String bcode = "";
        invoiceModel instance = new invoiceModel();
        Object[] expResult = null;
        Object[] result = instance.getSelectedData(bcode);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStock method, of class invoiceModel.
     */
    @Test
    public void testUpdateStock() {
        System.out.println("updateStock");
        String bcode = "";
        String qty = "";
        invoiceModel instance = new invoiceModel();
        String expResult = "";
        String result = instance.updateStock(bcode, qty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadTable method, of class invoiceModel.
     */
    @Test
    public void testLoadTable_String_DefaultTableModel() {
        System.out.println("loadTable");
        String keyword = "";
        DefaultTableModel invoiceTableModel2 = null;
        invoiceModel instance = new invoiceModel();
        instance.loadTable(keyword, invoiceTableModel2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadTable method, of class invoiceModel.
     */
    @Test
    public void testLoadTable_Date_DefaultTableModel() {
        System.out.println("loadTable");
        Date dt = null;
        DefaultTableModel invoiceTableModel2 = null;
        invoiceModel instance = new invoiceModel();
        instance.loadTable(dt, invoiceTableModel2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedDataById method, of class invoiceModel.
     */
    @Test
    public void testGetSelectedDataById() {
        System.out.println("getSelectedDataById");
        int invId = 0;
        DefaultTableModel invoiceTableModel3 = null;
        invoiceModel instance = new invoiceModel();
        instance.getSelectedDataById(invId, invoiceTableModel3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkqty method, of class invoiceModel.
     */
    @Test
    public void testCheckqty() {
        System.out.println("checkqty");
        String barcodee = "";
        String inqtyy = "";
        invoiceModel instance = new invoiceModel();
        String expResult = "";
        String result = instance.checkqty(barcodee, inqtyy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadStockTable method, of class invoiceModel.
     */
    @Test
    public void testLoadStockTable() {
        System.out.println("loadStockTable");
        String keyword = "";
        DefaultTableModel stockTableModel = null;
        invoiceModel instance = new invoiceModel();
        instance.loadStockTable(keyword, stockTableModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
