package views.hoadon;

import controller.ChiTietHDController;
import controller.Connector;
import controller.HangHoaController;
import controller.HoaDonController;

import controller.KhachHangController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDon;
import model.HangHoa;
import model.HoaDon;
import model.KhachHang;

public class ThemHoaDon extends javax.swing.JDialog {

    //private double t = 0;
    private DefaultTableModel mode;
    private GDQuanLyHoaDon qlhd;
    private int index = -1;
    private double tong=0;
    private ArrayList<ChiTietHoaDon> dsSP = new ArrayList<>();
    private controller.Connector cn = new Connector();

    public ThemHoaDon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setVisible(false);
        setLocationRelativeTo(null);
        mode = (DefaultTableModel) TableKetQua.getModel();
        txtTongTien.setVisible(false);
        tenSanPham.setVisible(false);
        txtNgayMua.setVisible(false);
        cn.getConnection();
        loadNhaSX();

        qlhd = (GDQuanLyHoaDon) parent;

    }

    private void loadNhaSX() {
        String sql = "SELECT DISTINCT NhaSX FROM hanghoa";
        ResultSet rs = cn.loadData(sql);
        try {
            while (rs.next()) {
                cbbNhasx.addItem(rs.getString(1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btnXuatHD = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableKetQua = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbbMasp = new javax.swing.JComboBox();
        btnThemSP = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbbloaiHinhTT = new javax.swing.JComboBox();
        txtSdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTrieuKhau = new javax.swing.JTextField();
        btnXoaSanPham = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        tenSanPham = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtNgayMua = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbbNhasx = new javax.swing.JComboBox();
        txtSoLuong = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUẢN LÝ BÁN HÀNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel1.setText("Ngày mua:");

        jLabel2.setText("Tên Khách hàng:");

        jLabel3.setText("Số Điện Thoại:");

        jLabel4.setText("Tên Sản Phẩm:");

        jLabel5.setText("Mã sản phẩm");

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        jButton4.setText("Xóa Text");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnXuatHD.setText("Xuất Hóa Đơn");
        btnXuatHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHDActionPerformed(evt);
            }
        });

        btnThoat.setText("Hủy");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        TableKetQua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên Sản Phẩm", "Màu Sắc", "Số Lượng", "Đơn Gía", "Thành Tiền"
            }
        ));
        TableKetQua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableKetQuaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableKetQua);

        jLabel9.setText("THÔNG TIN SẢN PHẨM");

        jLabel10.setText("Hãng SX");

        cbbMasp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMaspItemStateChanged(evt);
            }
        });
        cbbMasp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbbMaspMouseExited(evt);
            }
        });
        cbbMasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaspActionPerformed(evt);
            }
        });

        btnThemSP.setText("Thêm sản phẩm vào HĐ");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        jLabel11.setText("Phương thức thanh toán");

        cbbloaiHinhTT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiền Mặt", "Online ", "Chuyển Khoản", " " }));

        jLabel6.setText("Chiết Khấu");

        txtTrieuKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrieuKhauActionPerformed(evt);
            }
        });

        btnXoaSanPham.setText("Xóa khỏi HĐ");
        btnXoaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSanPhamActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã Hóa Đơn");

        txtMaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHoaDonActionPerformed(evt);
            }
        });

        jLabel7.setText("Tổng Hóa Đơn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Mã Khách Hàng");

        jLabel13.setText("Số lượng");

        cbbNhasx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNhasxActionPerformed(evt);
            }
        });

        jLabel14.setText("VND");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(tenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbNhasx, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(491, 491, 491)
                                        .addComponent(btnThemSP)
                                        .addGap(54, 54, 54)
                                        .addComponent(btnXoaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(451, 451, 451)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                        .addComponent(txtMaKH)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(371, 371, 371)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)))
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel13)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbbMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(btnXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(149, 149, 149))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(128, 128, 128)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cbbloaiHinhTT, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtTrieuKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(118, 118, 118)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(txtNgayMua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbbNhasx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaSanPham)
                            .addComponent(btnThemSP))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTrieuKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbbloaiHinhTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btnThoat)
                    .addComponent(btnXuatHD))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed

    }//GEN-LAST:event_txtTenKHActionPerformed

    private void btnXuatHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHDActionPerformed

        String maHD, maKh, maNV, ngayMua, loaiHinhTT, tenKH, soDT;
        maHD = txtMaHoaDon.getText();
        maKh = txtMaKH.getText();
        maNV = "NV01";
        ngayMua = txtNgayMua.getText();
        loaiHinhTT = (String) cbbloaiHinhTT.getSelectedItem();
        tenKH = txtTenKH.getText();
        soDT = txtSdt.getText();

        if (maHD.equals("") || maKh.equals("") || tenKH.equals("") || soDT.equals("")
                || txtTrieuKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn phải điền đầy đủ thông tin");
        } else {
            if (txtTongTien.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hóa ĐƠN CHƯA CÓ SẢN PHẨM NÀO !!!");
            } else {
                boolean ck = true;
                for (ChiTietHoaDon h : dsSP) {
                    if (!checkSoLuong(h)) {
                        ck = false;
                        break;
                    }

                }
                if (ck) {
                    
                    KhachHang kh = new KhachHang(maKh, tenKH, soDT, maKh);
                    tong -= tong*Double.parseDouble(txtTrieuKhau.getText())/100;
                    HoaDon h = new HoaDon(maHD, maKh, maNV, ngayMua, loaiHinhTT,
                            Double.parseDouble(txtTrieuKhau.getText()), tong);
                    KhachHangController p1 = new KhachHangController();
                    HoaDonController p2 = new HoaDonController();
                    ChiTietHDController p3 = new ChiTietHDController();
                    HangHoaController p4= new HangHoaController();
                    if (p1.InsertDaTa(kh) <= 0 || p2.InsertHoaDon(h) <= 0) {
                        JOptionPane.showMessageDialog(null, "Thêm hóa đơn thất bại !!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công !!");
                    }

                    for (ChiTietHoaDon item : dsSP) {
                        if (p3.InsertDaTa(item) <= 0) {
                            JOptionPane.showMessageDialog(null, "Thêm hàng hóa đơn thất bại !!");
                            ck = false;
                            break;
                        }
                        if (p4.UpdateData(item) <= 0) {
                            JOptionPane.showMessageDialog(null, "Cập nhât hóa đơn thất bại !!");
                            ck = false;
                            break;
                        }
                    }
                    if (!ck) {
                        JOptionPane.showMessageDialog(null, "Thêm chi tiết HD thất bại");
                    }

                    qlhd.hienThiDS();
                    clearText();
                    txtMaHoaDon.setText(null);
                    txtMaKH.setText(null);
                    txtTenKH.setText(null);
                    txtSdt.setText(null);
                    txtTongTien.setText(null);
                    mode.setColumnCount(0);
                    dispose();
                }

            }

        }

    }//GEN-LAST:event_btnXuatHDActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbbMaspItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMaspItemStateChanged

    }//GEN-LAST:event_cbbMaspItemStateChanged

    private void cbbMaspMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbMaspMouseExited

    }//GEN-LAST:event_cbbMaspMouseExited

    private void cbbMaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaspActionPerformed
        String item = (String) cbbMasp.getSelectedItem();

        String sql = "SELECT TenHang FROM hanghoa WHERE MaHang ='" + (String) cbbMasp.getSelectedItem() + "'";
        ResultSet rs = cn.loadData(sql);
        try {
            while (rs.next()) {
                tenSanPham.setText(rs.getString(1));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        tenSanPham.setVisible(true);
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        txtNgayMua.setText(df.format(now));
        txtNgayMua.setVisible(true);

    }//GEN-LAST:event_cbbMaspActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed

        if (txtMaHoaDon.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Điền mã hóa đơn");
        } else {

            ChiTietHoaDon h;

            h = new ChiTietHoaDon((String) txtMaHoaDon.getText(), (String) cbbMasp.getSelectedItem(),
                    (int) txtSoLuong.getValue());
            themSP(h);
            hienThiDS();

            clearText();
            

        }

    }//GEN-LAST:event_btnThemSPActionPerformed

    private void txtTrieuKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrieuKhauActionPerformed


    }//GEN-LAST:event_txtTrieuKhauActionPerformed

    private void txtMaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHoaDonActionPerformed

    }//GEN-LAST:event_txtMaHoaDonActionPerformed

    private void TableKetQuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableKetQuaMouseClicked
        index = TableKetQua.getSelectedRowCount() - 1;

        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chọn danh mục muốn xóa");
        } else {
            tenSanPham.setText(mode.getValueAt(index, 1).toString());
            tenSanPham.setVisible(true);

            cbbMasp.setSelectedItem("IPHONE");
            cbbNhasx.setSelectedItem("Đen");
            txtSoLuong.setValue(mode.getValueAt(index, 3));
        }


    }//GEN-LAST:event_TableKetQuaMouseClicked

    private void btnXoaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSanPhamActionPerformed

        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chọn danh mục muốn xóa");
        } else {
            //mode.removeRow(index);
            clearText();
            dsSP.remove(index);

            hienThiDS();

        }
        index = -1;
    }//GEN-LAST:event_btnXoaSanPhamActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearText();
        txtMaHoaDon.setText(null);
        txtMaKH.setText(null);
        txtTenKH.setText(null);
        txtSdt.setText(null);
        txtTongTien.setText(null);
        mode.setColumnCount(0);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbbNhasxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNhasxActionPerformed
        cbbMasp.removeAllItems();
        tenSanPham.setVisible(false);
        String item = (String) cbbNhasx.getSelectedItem();
        String sql = "SELECT MaHang FROM hanghoa where NhaSX='" + item + "'";

        ResultSet rs = cn.loadData(sql);
        try {
            while (rs.next()) {
                cbbMasp.addItem(rs.getString(1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbbNhasxActionPerformed

    public void hienThi(String ten, ChiTietHoaDon h, int donGia, String mauSac, int i) {

        mode.addRow(new Object[]{i++, ten, mauSac,
            h.getSoLuong(), donGia, h.getSoLuong() * donGia});
    }

    public void hienThiDS() {
        tong=0;
        xoaDuLieu();
        int i = 1;
        for (ChiTietHoaDon h : dsSP) {
            String sql = "SELECT * FROM hanghoa WHERE MaHang='" + h.getMaHang() + "'";
            ResultSet rs = cn.loadData(sql);
            String ten = null;

            String mauSac = null;

            int donGia = 0;
            try {
                while (rs.next()) {
                    ten = rs.getString("TenHang");
                    donGia = rs.getInt("DonGia");
                    mauSac = rs.getString("MauSac");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
            hienThi(ten, h, donGia, mauSac, i++);
            tong += h.getSoLuong() * donGia;
        }
       
        DecimalFormat df = new DecimalFormat("###,###,###.0#");

        txtTongTien.setText(df.format(tong));
        txtTongTien.setVisible(true);
    }

    public void themSP(ChiTietHoaDon h) {
        boolean kt = true;
        for (ChiTietHoaDon item : dsSP) {
            if (item.getMaHang().compareTo(h.getMaHang()) == 0) {
                 kt = false;
                ChiTietHoaDon temp = new ChiTietHoaDon(item.getMaHD(),item.getMaHang(),
                item.getSoLuong()+h.getSoLuong());
                
                
                if (checkSoLuong(temp)) {
                    item.setSoLuong(h.getSoLuong() + item.getSoLuong());
                    
                    break;
                }
                else
                {
                    clearText();
                }
                

            }
        }
        System.out.println(kt);
        if(checkSoLuong(h) && kt==true)
        {
            dsSP.add(h);
            System.out.println("thêm");
        }
    }

    public boolean checkSoLuong(ChiTietHoaDon h) {
        String sql = "SELECT * FROM hanghoa WHERE MaHang='" + h.getMaHang() + "'";
        ResultSet rs = cn.loadData(sql);
        int soLuong = 0;
        try {
            while (rs.next()) {
                soLuong = rs.getInt("SoLuong");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (h.getSoLuong() > soLuong) {
            JOptionPane.showMessageDialog(null, "Mã hàng " + h.getMaHang() + " không đủ số lươngg");
            return false;
        }
        return true;
    }

    public void clearText() {

        tenSanPham.setText(null);
        txtSoLuong.setValue(0);

    }

    public void xoaDuLieu() {
        int row = mode.getRowCount() - 1;
        for (int i = row; i >= 0; i--) {
            mode.removeRow(i);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemHoaDon dialog = new ThemHoaDon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableKetQua;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaSanPham;
    private javax.swing.JButton btnXuatHD;
    private javax.swing.JComboBox cbbMasp;
    private javax.swing.JComboBox cbbNhasx;
    private javax.swing.JComboBox cbbloaiHinhTT;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tenSanPham;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JLabel txtNgayMua;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JSpinner txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JLabel txtTongTien;
    private javax.swing.JTextField txtTrieuKhau;
    // End of variables declaration//GEN-END:variables
}
