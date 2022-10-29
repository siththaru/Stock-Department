/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Siththaru
 */
public class backupRestoreCodeTest {
    
    public backupRestoreCodeTest() {
    }
    /**
     * Test of backupDB method, of class backupRestoreCode.
     */
    @Test
    public void testBackupDB() {
        System.out.println("backupDB");
        String path = "";
        backupRestoreCode instance = new backupRestoreCode();
        String expResult = "";
        String result = instance.backupDB(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restoreDB method, of class backupRestoreCode.
     */
    @Test
    public void testRestoreDB() {
        System.out.println("restoreDB");
        String path = "";
        backupRestoreCode instance = new backupRestoreCode();
        String expResult = "";
        String result = instance.restoreDB(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
