/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.DefaultTableModel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Siththaru
 */
public class grnModelTest {
    
    public grnModelTest() {
    }

    /**
     * Test of insertGrn method, of class grnModel.
     */
    @Test
    public void testInsertGrn() {
        System.out.println("insertGrn");
        String mob = "";
        grnModel instance = new grnModel();
        String expResult = "";
        String result = instance.insertGrn(mob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertGrnItem method, of class grnModel.
     */
    @Test
    public void testInsertGrnItem() {
        System.out.println("insertGrnItem");
        String gid = "";
        String pid = "";
        String qty = "";
        String buy = "";
        grnModel instance = new grnModel();
        String expResult = "";
        String result = instance.insertGrnItem(gid, pid, qty, buy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadTable method, of class grnModel.
     */
    @Test
    public void testLoadTable() {
        System.out.println("loadTable");
        String keyword = "";
        DefaultTableModel grnTableModel = null;
        grnModel instance = new grnModel();
        instance.loadTable(keyword, grnTableModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTable method, of class grnModel.
     */
    @Test
    public void testSearchTable() {
        System.out.println("searchTable");
        String keyword = "";
        int categoryId = 0;
        DefaultTableModel grnTableModel = null;
        grnModel instance = new grnModel();
        instance.searchTable(keyword, categoryId, grnTableModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadGrnItemTable method, of class grnModel.
     */
    @Test
    public void testLoadGrnItemTable() {
        System.out.println("loadGrnItemTable");
        String keyword = "";
        DefaultTableModel grnTableModel = null;
        grnModel instance = new grnModel();
        instance.loadGrnItemTable(keyword, grnTableModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchGrnItemTable method, of class grnModel.
     */
    @Test
    public void testSearchGrnItemTable() {
        System.out.println("searchGrnItemTable");
        String keyword = "";
        int categoryId = 0;
        DefaultTableModel grnTableModel = null;
        grnModel instance = new grnModel();
        instance.searchGrnItemTable(keyword, categoryId, grnTableModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStock method, of class grnModel.
     */
    @Test
    public void testUpdateStock() {
        System.out.println("updateStock");
        String pid = "";
        String qty = "";
        grnModel instance = new grnModel();
        String expResult = "";
        String result = instance.updateStock(pid, qty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGrn method, of class grnModel.
     */
    @Test
    public void testUpdateGrn() {
        System.out.println("updateGrn");
        String gid = "";
        String total = "";
        grnModel instance = new grnModel();
        String expResult = "";
        String result = instance.updateGrn(gid, total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
