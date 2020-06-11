
package controller;

import java.sql.ResultSet;


public class loadList {
   public Connector cn = new Connector();
   public ResultSet loadList(String sql)
   {
       cn.getConnection();
       return cn.loadData(sql);
       
   }
    
}
