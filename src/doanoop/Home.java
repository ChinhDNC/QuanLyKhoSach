/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanoop;

import com.formdev.flatlaf.FlatLightLaf;
import controller.DAO;
import doanoop.Internal.QuanLyDauSach;
import doanoop.Internal.TonKho;
import doanoop.Internal.TrangChu;
import doanoop.Internal.QuanlyTK;
import doanoop.model.Book;
import doanoop.model.TaiKhoan;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.poi.hwpf.model.types.TCAbstractType;
import org.bouncycastle.asn1.cmc.TaggedRequest;
import doanoop.Internal.XuatKho;
import doanoop.Internal.NhapKho;
import doanoop.Internal.PhieuNhap;
import doanoop.Internal.PhieuXuat;
import doanoop.Internal.TaiKhoanCuaToi;

/**
 *
 * @author 84907
 */
public class Home extends javax.swing.JFrame {

    Color Defauft, Click;
    TrangChu tc = new TrangChu();
    QuanLyDauSach qlds;
    TonKho tk = new TonKho();
    QuanlyTK tkhoan;
    XuatKho xk;
    NhapKho nk;
    PhieuNhap pn;
    PhieuXuat px;
    TaiKhoanCuaToi tkct;

    public void getName(String name) {
        tc.lblname.setText(name);
    }

    public void Today() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        tc.today.setText(date.format(formatter));
    }

    public Home() {
        initComponents();
        panel.add(tc).setVisible(true);
        tc.setSize(1202, 700);
        this.setLocationRelativeTo(null);
        Defauft = new Color(0, 0, 0);
        Click = new Color(177, 8, 33);
        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Defauft);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TC = new javax.swing.JPanel();
        lbltc = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HTK = new javax.swing.JPanel();
        lblhtk = new javax.swing.JLabel();
        QLDS = new javax.swing.JPanel();
        lblqlds = new javax.swing.JLabel();
        XK = new javax.swing.JPanel();
        lblxk = new javax.swing.JLabel();
        NK = new javax.swing.JPanel();
        lblnk = new javax.swing.JLabel();
        PN = new javax.swing.JPanel();
        lblpn = new javax.swing.JLabel();
        PX = new javax.swing.JPanel();
        lblpx = new javax.swing.JLabel();
        QLTK = new javax.swing.JPanel();
        lblqltk = new javax.swing.JLabel();
        TKCT = new javax.swing.JPanel();
        lblqltk1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 8, 33));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HỆ THỐNG QUẢN LÍ KHO SÁCH");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 680, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/home_50px.png"))); // NOI18N
        jLabel2.setText("Thủ kho");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TC.setBackground(new java.awt.Color(51, 51, 51));
        TC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltc.setForeground(new java.awt.Color(255, 255, 255));
        lbltc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/book_35px.png"))); // NOI18N
        lbltc.setText("Trang chủ");
        lbltc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltcMouseClicked(evt);
            }
        });
        TC.add(lbltc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        jPanel2.add(TC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 60));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Tính năng");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 60));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 320, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Logout Rounded_35px.png"))); // NOI18N
        jLabel5.setText("Đăng xuất");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 320, 60));

        HTK.setBackground(new java.awt.Color(0, 0, 0));

        lblhtk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblhtk.setForeground(new java.awt.Color(255, 255, 255));
        lblhtk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhtk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/product_35px.png"))); // NOI18N
        lblhtk.setText("Hàng tồn kho");
        lblhtk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhtkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HTKLayout = new javax.swing.GroupLayout(HTK);
        HTK.setLayout(HTKLayout);
        HTKLayout.setHorizontalGroup(
            HTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HTKLayout.createSequentialGroup()
                .addComponent(lblhtk, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        HTKLayout.setVerticalGroup(
            HTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblhtk, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(HTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 320, 60));

        QLDS.setBackground(new java.awt.Color(0, 0, 0));

        lblqlds.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblqlds.setForeground(new java.awt.Color(255, 255, 255));
        lblqlds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblqlds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/management_35px.png"))); // NOI18N
        lblqlds.setText("Quản lý đầu sách");
        lblqlds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblqldsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout QLDSLayout = new javax.swing.GroupLayout(QLDS);
        QLDS.setLayout(QLDSLayout);
        QLDSLayout.setHorizontalGroup(
            QLDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLDSLayout.createSequentialGroup()
                .addComponent(lblqlds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        QLDSLayout.setVerticalGroup(
            QLDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblqlds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(QLDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 320, 60));

        XK.setBackground(new java.awt.Color(0, 0, 0));

        lblxk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblxk.setForeground(new java.awt.Color(255, 255, 255));
        lblxk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblxk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/export_35px.png"))); // NOI18N
        lblxk.setText("Xuất kho");
        lblxk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblxkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout XKLayout = new javax.swing.GroupLayout(XK);
        XK.setLayout(XKLayout);
        XKLayout.setHorizontalGroup(
            XKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XKLayout.createSequentialGroup()
                .addComponent(lblxk, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        XKLayout.setVerticalGroup(
            XKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblxk, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(XK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 320, 60));

        NK.setBackground(new java.awt.Color(0, 0, 0));

        lblnk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblnk.setForeground(new java.awt.Color(255, 255, 255));
        lblnk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Import_35px.png"))); // NOI18N
        lblnk.setText("Nhập kho");
        lblnk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblnkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NKLayout = new javax.swing.GroupLayout(NK);
        NK.setLayout(NKLayout);
        NKLayout.setHorizontalGroup(
            NKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NKLayout.createSequentialGroup()
                .addComponent(lblnk, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        NKLayout.setVerticalGroup(
            NKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblnk, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(NK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 320, 60));

        PN.setBackground(new java.awt.Color(0, 0, 0));

        lblpn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblpn.setForeground(new java.awt.Color(255, 255, 255));
        lblpn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/phieu_nhap_35px.png"))); // NOI18N
        lblpn.setText("Phiếu Nhập");
        lblpn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PNLayout = new javax.swing.GroupLayout(PN);
        PN.setLayout(PNLayout);
        PNLayout.setHorizontalGroup(
            PNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLayout.createSequentialGroup()
                .addComponent(lblpn, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        PNLayout.setVerticalGroup(
            PNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblpn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(PN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 320, 60));

        PX.setBackground(new java.awt.Color(0, 0, 0));

        lblpx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblpx.setForeground(new java.awt.Color(255, 255, 255));
        lblpx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/phieu_xuat_35px.png"))); // NOI18N
        lblpx.setText("Phiếu Xuất");
        lblpx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PXLayout = new javax.swing.GroupLayout(PX);
        PX.setLayout(PXLayout);
        PXLayout.setHorizontalGroup(
            PXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PXLayout.createSequentialGroup()
                .addComponent(lblpx, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        PXLayout.setVerticalGroup(
            PXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblpx, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(PX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 320, 60));

        QLTK.setBackground(new java.awt.Color(0, 0, 0));

        lblqltk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblqltk.setForeground(new java.awt.Color(255, 255, 255));
        lblqltk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblqltk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/users_35px.png"))); // NOI18N
        lblqltk.setText("Quản lý Tài Khoản");
        lblqltk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblqltkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout QLTKLayout = new javax.swing.GroupLayout(QLTK);
        QLTK.setLayout(QLTKLayout);
        QLTKLayout.setHorizontalGroup(
            QLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLTKLayout.createSequentialGroup()
                .addComponent(lblqltk, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        QLTKLayout.setVerticalGroup(
            QLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLTKLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblqltk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(QLTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 320, 60));

        TKCT.setBackground(new java.awt.Color(0, 0, 0));

        lblqltk1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblqltk1.setForeground(new java.awt.Color(255, 255, 255));
        lblqltk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblqltk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/my_acc_35px.png"))); // NOI18N
        lblqltk1.setText("Tài khoản của tôi");
        lblqltk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblqltk1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TKCTLayout = new javax.swing.GroupLayout(TKCT);
        TKCT.setLayout(TKCTLayout);
        TKCTLayout.setHorizontalGroup(
            TKCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TKCTLayout.createSequentialGroup()
                .addComponent(lblqltk1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        TKCTLayout.setVerticalGroup(
            TKCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TKCTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblqltk1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(TKCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 320, 60));

        panel.setPreferredSize(new java.awt.Dimension(1200, 500));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1203, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int res = JOptionPane.showConfirmDialog(rootPane, "Đăng xuất khỏi tài khoản", "", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            this.dispose();
            Login login = new Login();
            login.txtuser.setText("");
            login.txtpass.setText("");
            login.setVisible(true);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void lbltcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltcMouseClicked

        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Defauft);
        panel.removeAll();
        panel.add(tc).setVisible(true);
        tc.setSize(1200, 700);
    }//GEN-LAST:event_lbltcMouseClicked

    private void lblhtkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhtkMouseClicked
        lbltc.setBackground(Defauft);
        QLDS.setBackground(Defauft);
        HTK.setBackground(Click);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Defauft);
        tk = new TonKho();
        panel.removeAll();
        panel.add(tk).setVisible(true);
        tk.setSize(1200, 700);
    }//GEN-LAST:event_lblhtkMouseClicked

    private void lblqldsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblqldsMouseClicked
        lbltc.setBackground(Defauft);
        QLDS.setBackground(Click);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        qlds = new QuanLyDauSach();
        TKCT.setBackground(Defauft);
        panel.removeAll();
        panel.add(qlds).setVisible(true);
        qlds.setSize(1200, 700);
    }//GEN-LAST:event_lblqldsMouseClicked

    private void lblqltkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblqltkMouseClicked
        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Click);
        TKCT.setBackground(Defauft);
        tkhoan = new QuanlyTK();
        panel.removeAll();
        panel.add(tkhoan).setVisible(true);
        tkhoan.setSize(1200, 700);
    }//GEN-LAST:event_lblqltkMouseClicked

    private void lblxkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblxkMouseClicked
        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Click);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Defauft);
        xk = new XuatKho();
        xk.lblname.setText(tc.lblname.getText());
        panel.removeAll();
        panel.add(xk).setVisible(true);
        xk.setSize(1200, 700);
    }//GEN-LAST:event_lblxkMouseClicked

    private void lblnkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnkMouseClicked
        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Click);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Defauft);
        nk = new NhapKho();
        nk.lblname.setText(tc.lblname.getText());
        panel.removeAll();
        panel.add(nk).setVisible(true);
        nk.setSize(1200, 700);
    }//GEN-LAST:event_lblnkMouseClicked

    private void lblpnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpnMouseClicked
        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Click);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Defauft);
        pn = new PhieuNhap();
        panel.removeAll();
        panel.add(pn).setVisible(true);
        pn.setSize(1200, 700);
    }//GEN-LAST:event_lblpnMouseClicked

    private void lblpxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpxMouseClicked
        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Click);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Defauft);
        px = new PhieuXuat();
        panel.removeAll();
        panel.add(px).setVisible(true);
        px.setSize(1200, 700);
    }//GEN-LAST:event_lblpxMouseClicked

    private void lblqltk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblqltk1MouseClicked
        QLDS.setBackground(Defauft);
        HTK.setBackground(Defauft);
        XK.setBackground(Defauft);
        NK.setBackground(Defauft);
        PN.setBackground(Defauft);
        PX.setBackground(Defauft);
        QLTK.setBackground(Defauft);
        TKCT.setBackground(Click);
        tkct = new TaiKhoanCuaToi();
        panel.removeAll();
        panel.add(tkct).setVisible(true);
        tkct.username=tc.lblname.getText();
        tkct.getData(tc.lblname.getText());
        tkct.setSize(1200, 700);    }//GEN-LAST:event_lblqltk1MouseClicked

//    public static void main(String args[]) {
//        try {
//            UIManager.setLookAndFeel(new FlatLightLaf());
//        } catch (Exception ex) {
//            System.err.println(" Failed to initialize LaF");
//        }
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HTK;
    private javax.swing.JPanel NK;
    private javax.swing.JPanel PN;
    private javax.swing.JPanel PX;
    private javax.swing.JPanel QLDS;
    private javax.swing.JPanel QLTK;
    private javax.swing.JPanel TC;
    private javax.swing.JPanel TKCT;
    private javax.swing.JPanel XK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblhtk;
    private javax.swing.JLabel lblnk;
    private javax.swing.JLabel lblpn;
    private javax.swing.JLabel lblpx;
    private javax.swing.JLabel lblqlds;
    private javax.swing.JLabel lblqltk;
    private javax.swing.JLabel lblqltk1;
    private javax.swing.JLabel lbltc;
    private javax.swing.JLabel lblxk;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
