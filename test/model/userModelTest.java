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
public class userModelTest {
    
    public userModelTest() {
    }
    /**
     * Test of adminLogin method, of class userModel.
     */
    @Test
    public void testAdminLogin() {
        System.out.println("adminLogin");
        String username = "admin";
        String password = "123";
        userModel instance = new userModel();
        String expResult = "Welcome";
        String result = instance.adminLogin(username, password);
        assertEquals(expResult, result);        
    }
    
}
