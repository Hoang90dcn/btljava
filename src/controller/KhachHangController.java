
package controller;

import java.sql.ResultSet;
import model.KhachHang;


public class KhachHangController {
    private Connector cn = new Connector();
    
    public  int  InsertDaTa(KhachHang h)
    {
        String sql = "INSERT INTO khachhang" + " VALUES "
                + "('"+h.getMaKH()+"','"+h.getTenKH()+"','"+h.getSoDienThoa()+"','"
                +h.getGhiChu()+"')";
                
        cn.getConnection();
        return cn.InsertData(sql);
        
    }
    public ResultSet seachData(String maKH)
    
    {
        cn.getConnection();
        String sql ="SELECT * FROM `khachhang` WHERE MaKH = '"+maKH+"'";
        return cn.loadData(sql);
    }
}
