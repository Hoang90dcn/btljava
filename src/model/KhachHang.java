
package model;


public class KhachHang {
    private String maKH;
    private String tenKH;
    private String soDienThoa;
    private String ghiChu;

    public KhachHang() {
    }
    

    public KhachHang(String maKH, String tenKH, String soDienThoa, String ghiChu) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDienThoa = soDienThoa;
        this.ghiChu = ghiChu;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDienThoa() {
        return soDienThoa;
    }

    public void setSoDienThoa(String soDienThoa) {
        this.soDienThoa = soDienThoa;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
    
    
}
