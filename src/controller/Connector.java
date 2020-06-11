
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {
    private Connection con =null;

    public Connector() {
    }
    
    public void getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/btl_java",
                    "root", "123456");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet loadData(String sql)
    {
        ResultSet rs = null;
        try {
            Statement stm = con.createStatement();
            rs= stm.executeQuery(sql);
        } catch (SQLException ex) {
            return null;
        }
        return rs;
    }
    public int InsertData(String sql)
    {
       
        try {
             Statement stm = con.createStatement();
            return stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
       return 0;
    }
            
}
