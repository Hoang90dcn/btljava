
package model;


public class NhanVien {
    private String maNV;
    private String passWord;
    private String hoTen;

    public NhanVien() {
    }

    public NhanVien(String maNV, String passWord, String hoTen) {
        this.maNV = maNV;
        this.passWord = passWord;
        this.hoTen = hoTen;
    }
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    
}
