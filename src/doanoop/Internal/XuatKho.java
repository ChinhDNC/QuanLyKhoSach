/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package doanoop.Internal;

import Phieu.ChiTietPhieu;
import Phieu.Phieu;
import Phieu.PhieuDAO;
import controller.DAO;
import Phieu.ChiTietPhieuDAO;
import doanoop.model.Book;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Phieu.ChiTietPhieu;
import Phieu.ChiTietPhieuDAO;
import Phieu.Phieu;
import Phieu.PhieuDAO;
import controller.DAO;
import doanoop.model.Book;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author 84907
 */
public class XuatKho extends javax.swing.JInternalFrame {

    public ArrayList<Book> list;
    public ArrayList<ChiTietPhieu> CTPhieu;
    public ArrayList<Phieu> phieu;
    DefaultTableModel model;
    DefaultTableModel model1;
    int selectedIndex;
    public int tmp = 0;
    static int S = 0;

    public XuatKho() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        lblma.setText(maPhieuXuat(phieu));
        lblNgay.setText(ngayXuat());
        lblGio.setText(gioXuat());
        CTPhieu = new ArrayList<>();
        model = (DefaultTableModel) tblList.getModel();
        model1 = (DefaultTableModel) tblXuat.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng", "Giá"
        });

        model1.setColumnIdentifiers(new Object[]{
            "Mã phiếu", "Mã sách", "Số lượng", "Đơn giá", "Số tiền"
        });
        DefaultTableCellRenderer dtcr = (DefaultTableCellRenderer) tblList.getDefaultRenderer(Object.class);
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer dtc = (DefaultTableCellRenderer) tblXuat.getDefaultRenderer(Object.class);
        dtc.setHorizontalAlignment(SwingConstants.CENTER);
        list = new DAO().getBookList_inWare();
        showTable();
    }

    public String formatCurrent(int cur) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(cur);
    }

    public void showTable() {
        model.setRowCount(0);
        for (Book book : new DAO().getBookList_inWare()) {
            model.addRow(new Object[]{
                book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), formatCurrent(book.getGia())
            });
        }
    }

    public void ShowExport() {
        S = 0;
        model1.setRowCount(0);
        for (ChiTietPhieu ctp : CTPhieu) {
            model1.addRow(new Object[]{
                ctp.getMaPhieu(), ctp.getMaSach(), ctp.getSoLuong(), formatCurrent(ctp.getDonGia()), formatCurrent(ctp.getTong())
            });
            S += ctp.getTong();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblma = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        lblGio = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        sl = new javax.swing.JTextField();
        cbxSearch = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblXuat = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(177, 8, 33));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mã phiếu");

        lblma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblma.setForeground(new java.awt.Color(177, 8, 33));
        lblma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(177, 8, 33));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Người tạo phiếu");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(177, 8, 33));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ngày");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(177, 8, 33));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thời gian");

        lblNgay.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblNgay.setForeground(new java.awt.Color(177, 8, 33));
        lblNgay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblGio.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblGio.setForeground(new java.awt.Color(177, 8, 33));
        lblGio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(177, 8, 33));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(177, 8, 33));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("XUẤT KHO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblma, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(200, 200, 200)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(356, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblList.setSelectionBackground(new java.awt.Color(177, 8, 33));
        tblList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblList);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(177, 8, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách xuất kho");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(177, 8, 33));
        jButton1.setText("Chuyển");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(177, 8, 33));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        sl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sl.setForeground(new java.awt.Color(177, 8, 33));
        sl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                slKeyTyped(evt);
            }
        });

        cbxSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxSearch.setForeground(new java.awt.Color(177, 8, 33));
        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Tác giả" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(177, 8, 33));
        jLabel11.setText("Số lượng xuất");

        tblXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblXuat);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(177, 8, 33));
        jButton2.setText("Hủy xuất");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(177, 8, 33));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thành tiền");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 51));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(177, 8, 33));
        jButton3.setText("Xuất kho");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(177, 8, 33));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sách trong kho");

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/excel.png"))); // NOI18N
        jButton4.setText("XUẤT BẰNG FILE");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton4)
                        .addGap(19, 19, 19))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(139, 139, 139)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int choose = JOptionPane.showConfirmDialog(rootPane, "Xuất danh sách", "Xác nhận xuất", JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            Phieu y = new Phieu();
            y.setMaPhieu(maPhieuXuat(phieu));
            y.setNguoiTao(lblname.getText());
            y.setNgayTao(ngayXuat());
            y.setGioTao(gioXuat());
            y.setTotal(0);
            if (new PhieuDAO().insert(y) != 0) {
                for (ChiTietPhieu x : CTPhieu) {
                    if (new ChiTietPhieuDAO().insert(x) != 0) {
                        for (Book book : list) {
                            if (book.getMasach().equals(x.getMaSach())) {
                                if (new DAO().afterExport(book, x.getMaSach(), x.getSoLuong())) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (new PhieuDAO().Update(y.getMaPhieu(), S)) {
                    showTable();
                    JOptionPane.showMessageDialog(rootPane, "Đã xuất kho");

                    CTPhieu.clear();
                    ShowExport();
                    lblTotal.setText("");
                    lblma.setText(maPhieuXuat(phieu));
                    lblNgay.setText(ngayXuat());
                    lblGio.setText(gioXuat());
                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectedIndex = tblXuat.getSelectedRow();

        if (CTPhieu.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách xuất kho hiện rỗng");
        } else if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 loại sách để xóa khỏi danh sách xuất");
        } else {
            int res = JOptionPane.showConfirmDialog(rootPane, "Xóa khỏi danh sách xuất", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                CTPhieu.remove(CTPhieu.get(selectedIndex));
                ShowExport();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void slKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_slKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        switch ((String) cbxSearch.getSelectedItem()) {
            case "Mã sách":
                model.setRowCount(0);
                for (Book book : new DAO().findByMasach1(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(),formatCurrent(book.getGia())
                    });
                }
                break;
            case "Tên sách":
                model.setRowCount(0);
                for (Book book : new DAO().findByTensach1(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(),formatCurrent(book.getGia())
                    });
                }
                break;
            case "Tác giả":
                model.setRowCount(0);
                for (Book book : new DAO().findByTacgia1(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), formatCurrent(book.getGia())
                    });
                }
                break;
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        selectedIndex = tblList.getSelectedRow();

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách sản phẩm rỗng");
        } else if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 loại sách để thêm vào danh sách xuất");
        } else {
            if (sl.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Nhập số lượng muốn xuất");
            } else {
                String ma = tblList.getValueAt(selectedIndex, 0).toString();
                Book book = new DAO().getBook(ma);
                if (Integer.parseInt(sl.getText()) > book.getSoluong()) {
                    JOptionPane.showMessageDialog(rootPane, "Kho không thể đáp ứng số lượng\nVui lòng nhập số lượng thấp hơn");
                    sl.setText("");
                } else {
                    int flag = 0;
                    int tmp = Integer.parseInt(sl.getText());
                    for (ChiTietPhieu a : CTPhieu) {
                        if ((ma.trim()).equals(a.getMaSach().trim())) {
                            flag = 1;
                            a.setSoLuong(a.getSoLuong() + tmp);
                            a.setTong(a.getSoLuong() * a.getDonGia());
                            sl.setText("");
                            ShowExport();
                        }
                    }
                    if (flag == 0) {
                        ChiTietPhieu x = new ChiTietPhieu();
                        x.setMaPhieu(maPhieuXuat(phieu));
                        x.setMaSach(ma.trim());
                        x.setSoLuong(tmp);
                        x.setDonGia(book.getGia());
                        x.setTong(book.getGia() * x.getSoLuong());
                        CTPhieu.add(x);
                        tmp = 0;
                        sl.setText("");
                        ShowExport();
                        lblTotal.setText(formatCurrent(S));
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FileInputStream FIS = null;
        BufferedInputStream BIS = null;
        XSSFWorkbook wb = null;
        ArrayList<String> notExist = new ArrayList<>();
        ArrayList<String> notEnough = new ArrayList<>();
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\84907\\Desktop");
        int chooser = fileChooser.showOpenDialog(null);
        if (chooser == JFileChooser.APPROVE_OPTION) {
            try {
                File excel = fileChooser.getSelectedFile();
                FIS = new FileInputStream(excel);
                BIS = new BufferedInputStream(FIS);
                wb = new XSSFWorkbook(BIS);
                String maPhieu = lblma.getText();

                XSSFSheet sheet = wb.getSheetAt(0);
                for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    XSSFCell maSach = row.getCell(0);
                    String ms = String.valueOf(maSach);
                    int j = 0;
                    int k = 0;

                    for (Book book : list) {
                        if (ms.trim().equals(book.getMasach().trim())) {
                            continue;
                        }
                        if (!((ms.trim()).equals(book.getMasach().trim())) && j == list.size() - 1) {
                            k += 1;
                            notExist.add(ms);
                            break;
                        }

                        j++;
                    }
                    if (k == 0) {
                        int donGia = new DAO().getBook((String.valueOf(maSach))).getGia();
                        XSSFCell soLuong = row.getCell(1);
                        double t1 = Double.parseDouble(String.valueOf(soLuong));
                        int Sluong = (int) t1;
                        int t = 0;
                        for (Book book : list) {
                            if (book.getSoluong() < Sluong&&book.getMasach().trim().equals(ms.trim())) {
                                t += 1;
                                notEnough.add(ms);
                                break;
                            } else {
                                continue;
                            }
                        }

                        if (t == 0) {
                            int Tong = Sluong * donGia;
                            int flag = 0;
                            for (ChiTietPhieu a : CTPhieu) {
                                if (ms.equals(a.getMaSach())) {
                                    flag = 1;
                                    a.setSoLuong(a.getSoLuong() + Sluong);
                                    a.setTong(a.getSoLuong() * a.getDonGia());
                                    sl.setText("");
                                    ShowExport();
                                }
                            }
                            if (flag == 0) {
                                ChiTietPhieu x = new ChiTietPhieu();
                                x.setMaPhieu(maPhieu);
                                x.setMaSach(ms);
                                x.setSoLuong(Sluong);
                                x.setDonGia(donGia);
                                x.setTong(Tong);
                                CTPhieu.add(x);
                            }
                        }
                        ShowExport();
                    }
                }
               if(!notExist.isEmpty()) JOptionPane.showMessageDialog(rootPane, "Mã sách " + notExist.toString() +" chưa tồn tại trong Quản lý đầu sách");
               if(!notEnough.isEmpty()) JOptionPane.showMessageDialog(rootPane, "Mã sách " + notEnough.toString() +" hiện trong kho không đủ số lượng");
                JOptionPane.showMessageDialog(rootPane, "Nhập dữ liệu từ file thành công");
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public String maPhieuXuat(ArrayList<Phieu> dsPhieu) {
        dsPhieu = new PhieuDAO().selectAllPX();
        int id = dsPhieu.size();
        String check = "";
        for (Phieu phieu : dsPhieu) {
            if (phieu.getMaPhieu().equals("PX" + id)) {
                check = phieu.getMaPhieu();
            }
        }
        while (check.length() != 0) {
            String k = check;
            id++;
            for (int i = 0; i < dsPhieu.size(); i++) {
                if (dsPhieu.get(i).getMaPhieu().equals("PX" + id)) {
                    check = dsPhieu.get(i).getMaPhieu();
                }
            }
            if (check.equals(k)) {
                check = "";
            }
        }
        return "PX" + id;
    }

    public String ngayXuat() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return date.format(formatter);
    }

    public String gioXuat() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGio;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblma;
    public javax.swing.JLabel lblname;
    public javax.swing.JLabel name;
    private javax.swing.JTextField sl;
    private javax.swing.JTable tblList;
    private javax.swing.JTable tblXuat;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
