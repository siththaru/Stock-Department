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
public class productModelTest {
    
    public productModelTest() {
    }

    /**
     * Test of loadExpiredProducts method, of class productModel.
     */
    @Test
    public void testLoadExpiredProducts() {
        System.out.println("loadExpiredProducts");
        String barcode = "11111";
        DefaultTableModel productTableModel = null;
        productModel instance = new productModel();
        instance.loadExpiredProducts(barcode, productTableModel);
    }

    /**
     * Test of insertProduct method, of class productModel.
     */
    @Test
    public void testInsertProduct() {
        System.out.println("insertProduct");
        String code = "1111";
        String name = "Panadol";
        String brand = "Gsk";
        String sell = "100.0";
        Date mfd = null;
        Date exp = null;
        boolean active = false;
        productModel instance = new productModel();
        String expResult = "Success";
        String result = instance.insertProduct(code, name, brand, sell, mfd, exp, active);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertStock method, of class productModel.
     */
    @Test
    public void testInsertStock() {
        System.out.println("insertStock");
        String code = "11111";
        productModel instance = new productModel();
        String expResult = "Success";
        String result = instance.insertStock(code);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertBrand method, of class productModel.
     */
    @Test
    public void testInsertBrand() {
        System.out.println("insertBrand");
        String bname = "";
        boolean activity = false;
        productModel instance = new productModel();
        String expResult = "Success";
        String result = instance.insertBrand(bname, activity);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSelectedDataById method, of class productModel.
     */
    @Test
    public void testGetSelectedDataById() {
        System.out.println("getSelectedDataById");
        String barcode = "1111";
        productModel instance = new productModel();
        String expResult = null;
        String result = instance.getSelectedDataById(barcode);
        assertEquals(expResult, result);
    }

}
