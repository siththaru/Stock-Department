
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.log4j.Logger;

public class userModel {
        Connection conn;
        static Logger log = Logger.getLogger(userModel.class.getName());
    public userModel(){
        conn = db.dbConnection.getConnection();
    }
    
    public String adminLogin(String username, String password){
        String msg = "";
        String query = "SELECT * FROM `user`";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String un = "";
            String pw = "";
            while(rs.next()){
                un = rs.getString("username");
                pw = rs.getString("password");
            }
            if(un.equalsIgnoreCase(username)&& pw.equalsIgnoreCase(password)){
                msg = "Welcome";
            }else{
                msg="Invalid username or password";
            }
        } catch (Exception e) {
            msg="Error"+e.getMessage();
            log.debug(e.getMessage());
        }
        return msg;
    }
}