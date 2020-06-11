package views.hoadon;

import controller.Connector;
import controller.HoaDonController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import views.hoadon.ThemHoaDon;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;

public class GDQuanLyHoaDon extends javax.swing.JFrame {

    private DefaultTableModel tb;
    private int index = -1;

    private List<HoaDon> mylist;
    private Connector cn;

    public GDQuanLyHoaDon() {
        initComponents();
        tb = (DefaultTableModel) tableHD.getModel();
        mylist = new ArrayList<>();
        cn = new Connector();
        cn.getConnection();
        hienThiDS();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHD = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ HÓA ĐƠN");

        jLabel2.setText("Nhập Mã Hóa Đơn");

        tableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Ma Nhan Vien", "Ngày Mua", "Loại Hình TT", "Chiết Khấu", "Tổng tiền"
            }
        ));
        tableHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHD);

        jButton1.setText("Thêm Hóa Đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm ");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa Hóa Đơn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(485, 485, 485)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnTimKiem)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ThemHoaDon t = new ThemHoaDon(this, rootPaneCheckingEnabled);
        t.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (txtMaHoaDon.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn cần nhập mã hóa đơn tìm kiếm");
        } else {
            HoaDonController p1 = new HoaDonController();
            ResultSet rs = p1.seachData((String) txtMaHoaDon.getText());
            HoaDon h = new HoaDon();
            h.setMaHD("K");
            try {

                while (rs.next()) {

                    h.setMaHD(rs.getString("MaHD"));
                    h.setMaKH(rs.getString("MaKH"));
                    h.setMaNV(rs.getString("NgayMua"));
                    h.setLoaiHinhTT(rs.getString("LoaiHinhTT"));
                    h.setChietKhau(rs.getDouble("ChietKhau"));
                    h.setTongTien(rs.getDouble("TongTien"));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Có lỗi hệ thống ");
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(rootPane, "Không tồn tại mã hóa đơn " + txtMaHoaDon.getText());
            }

            try {
                if (h.getMaHD().equals("K")) {
                    JOptionPane.showMessageDialog(rootPane, "Không tồn tại mã hóa đơn " + txtMaHoaDon.getText());
                } else {
                    JOptionPane.showMessageDialog(rootPane, "OK ");
                    SuaHoaDon edit = new SuaHoaDon(this, rootPaneCheckingEnabled);
                    edit.SetData(h);
                    edit.setVisible(true);
                   
                }
            } catch (NullPointerException ex) {
                //JOptionPane.showMessageDialog(rootPane, "Không tồn tại mã hóa đơn " + txtMaHoaDon.getText());
            }

        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHDMouseClicked
        index = tableHD.getWidth() - 1;
    }//GEN-LAST:event_tableHDMouseClicked

    public void hienThi(HoaDon t) {

        DecimalFormat df = new DecimalFormat("###,###,###.0#");

        tb.addRow(new Object[]{t.getMaHD(), t.getMaKH(), t.getMaNV(),
            t.getNgayMua(), t.getLoaiHinhTT(),
            t.getChietKhau(), df.format(t.getTongTien())

        });

    }

    public void hienThiDS() {
        tb.setRowCount(0);
        String sql = "select * from hoadon";
        ResultSet rs = cn.loadData(sql);
        try {
            while (rs.next()) {
                HoaDon h = new HoaDon();
                h.setMaHD(rs.getString("MaHD"));
                h.setMaKH(rs.getString("MaKH"));
                h.setMaNV(rs.getString("MaNv"));
                h.setNgayMua(rs.getString("NgayMua"));
                h.setLoaiHinhTT(rs.getString("LoaiHinhTT"));
                h.setChietKhau(rs.getDouble("ChietKhau"));
                h.setTongTien(rs.getDouble("TongTien"));
                hienThi(h);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Truy vấn thất bại");
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDQuanLyHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHD;
    private javax.swing.JTextField txtMaHoaDon;
    // End of variables declaration//GEN-END:variables
}
