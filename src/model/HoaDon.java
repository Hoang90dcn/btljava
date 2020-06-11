
package model;


public class HoaDon {
    private String maHD;
    
    private String maKH;
    private String maNV;
    private String ngayMua;
    private String loaiHinhTT;
    private double ChietKhau;
    private  double tongTien;

    public HoaDon() {
    }

    public HoaDon(String maHD, String maKH, String maNV, String ngayMua, String loaiHinhTT, double ChietKhau, double tongTien) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayMua = ngayMua;
        this.loaiHinhTT = loaiHinhTT;
        this.ChietKhau = ChietKhau;
        this.tongTien = tongTien;
    }
    
    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getLoaiHinhTT() {
        return loaiHinhTT;
    }

    public void setLoaiHinhTT(String loaiHinhTT) {
        this.loaiHinhTT = loaiHinhTT;
    }

    public double getChietKhau() {
        return ChietKhau;
    }

    public void setChietKhau(double ChietKhau) {
        this.ChietKhau = ChietKhau;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
    
    
   
   

    
    
}
