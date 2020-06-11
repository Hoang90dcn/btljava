
package model;


public class ChiTietHoaDon {
    private String maHD;
    private String maHang;
    private int soLuong;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String maHD, String maHang, int soLuong) {
        this.maHD = maHD;
        this.maHang = maHang;
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}

