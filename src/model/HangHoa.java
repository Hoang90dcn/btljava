
package model;




public class HangHoa {
    private String maHang;
    private String tenHang;
    private String nhaSX;
    private  String mauSac;
    private String  serial;
    private String donGia;
    private int soLuong;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, String nhaSX, String mauSac, String serial, String donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSX = nhaSX;
        this.mauSac = mauSac;
        this.serial = serial;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getSerial() {
        return serial;
    }

    public String getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
    
             
}
