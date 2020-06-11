
package controller;

import java.sql.ResultSet;
import model.HoaDon;


public class HoaDonController {
    private  Connector cn  = new Connector();
     public  int  InsertHoaDon(HoaDon h)
    {
        String sql ="INSERT INTO hoadon VALUES ('"+h.getMaHD()+"','"+h.getMaKH()+"','"+
            h.getMaNV()+"','"+h.getNgayMua()+"','"+h.getLoaiHinhTT()+"','"
                +h.getChietKhau()+"','"+h.getTongTien()+"')";
                
        cn.getConnection();
        return cn.InsertData(sql);
        
    }
     public ResultSet seachData(String MaHD)
   {
       String sql = "SELECT *FROM hoadon WHERE MaHD ='"+MaHD+"'";
       cn.getConnection();
       return cn.loadData(sql);
   }
}

