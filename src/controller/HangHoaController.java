package controller;

import java.sql.ResultSet;
import model.ChiTietHoaDon;

public class HangHoaController {

    private Connector cn = new Connector();

    public int UpdateData(ChiTietHoaDon h) {
        cn.getConnection();
        String sql = "UPDATE hanghoa SET SoLuong = SoLuong - " + h.getSoLuong()
                + " WHERE MaHang = '" + h.getMaHang() + "'";
        return cn.InsertData(sql);

    }

    public ResultSet seachData(String maHD) {
        String sql = "SELECT hanghoa.TenHang, hanghoa.MauSac, chitiethoadon.SoLuong, hanghoa.DonGia,"
                + "hanghoa.DonGia * chitiethoadon.SoLuong"
                + "FROM chitiethoadon INNER JOIN hanghoa"
                + "on chitiethoadon.MaHang = hanghoa.MaHang"
                + "WHERE MaHD ='"+maHD+"'";
        cn.getConnection();
       return  cn.loadData(sql);
    }

}
