
package controller;

import model.ChiTietHoaDon;



public class ChiTietHDController {
    private Connector cn = new Connector();
    public  int  InsertDaTa(ChiTietHoaDon h)
    {
        String sql = "INSERT INTO chitiethoadon  VALUES ('"+h.getMaHD()+"','"+
                h.getMaHang()+"','"+h.getSoLuong()+"')";
                
                
        cn.getConnection();
        return cn.InsertData(sql);
        
    }
}
