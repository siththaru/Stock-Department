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
public class supplierModelTest {
    
    public supplierModelTest() {
    }
    /**
     * Test of insertSupplier method, of class supplierModel.
     */
    @Test
    public void testInsertSupplier() {
        System.out.println("insertSupplier");
        String mobile = "0774690754";
        String name = "Susil";
        String company = "1";
        String email = "sss";
        boolean active = false;
        supplierModel instance = new supplierModel();
        String expResult = "Success";
        String result = instance.insertSupplier(mobile, name, company, email, active);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertBrand method, of class supplierModel.
     */
    @Test
    public void testInsertBrand() {
        System.out.println("insertBrand");
        String bname = "";
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.insertBrand(bname);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertCompany method, of class supplierModel.
     */
    @Test
    public void testInsertCompany() {
        System.out.println("insertCompany");
        String cname = "";
        String address = "";
        boolean activity = false;
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.insertCompany(cname, address, activity);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadTable method, of class supplierModel.
     */
    @Test
    public void testLoadTable() {
        System.out.println("loadTable");
        String keyword = "";
        DefaultTableModel supplierTableModel = null;
        supplierModel instance = new supplierModel();
        instance.loadTable(keyword, supplierTableModel);
    }

    /**
     * Test of loadCompanyTable method, of class supplierModel.
     */
    @Test
    public void testLoadCompanyTable() {
        System.out.println("loadCompanyTable");
        String keyword = "";
        DefaultTableModel companyTableModel = null;
        supplierModel instance = new supplierModel();
        instance.loadCompanyTable(keyword, companyTableModel);
    }

    /**
     * Test of getSelectedSupplierDataByMob method, of class supplierModel.
     */
    @Test
    public void testGetSelectedSupplierDataByMob() {
        System.out.println("getSelectedSupplierDataByMob");
        int smob = 0;
        supplierModel instance = new supplierModel();
        Object[] expResult = null;
        Object[] result = instance.getSelectedSupplierDataByMob(smob);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of updateSupplier method, of class supplierModel.
     */
    @Test
    public void testUpdateSupplier() {
        System.out.println("updateSupplier");
        String name = "";
        String email = "";
        boolean active = false;
        String mobile = "";
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.updateSupplier(name, email, active, mobile);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateBrand method, of class supplierModel.
     */
    @Test
    public void testUpdateBrand() {
        System.out.println("updateBrand");
        String bid = "";
        String bname = "";
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.updateBrand(bid, bname);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateCompany method, of class supplierModel.
     */
    @Test
    public void testUpdateCompany() {
        System.out.println("updateCompany");
        String cid = "";
        String cname = "";
        String address = "";
        boolean activity = false;
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.updateCompany(cid, cname, address, activity);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteSupplier method, of class supplierModel.
     */
    @Test
    public void testDeleteSupplier() {
        System.out.println("deleteSupplier");
        String mob = "";
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.deleteSupplier(mob);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteBrand method, of class supplierModel.
     */
    @Test
    public void testDeleteBrand() {
        System.out.println("deleteBrand");
        String bid = "";
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.deleteBrand(bid);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteCompany method, of class supplierModel.
     */
    @Test
    public void testDeleteCompany() {
        System.out.println("deleteCompany");
        String cid = "";
        supplierModel instance = new supplierModel();
        String expResult = "";
        String result = instance.deleteCompany(cid);
        assertEquals(expResult, result);
    }
    
}
