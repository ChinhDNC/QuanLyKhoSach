/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package doanoop.Internal;

import Phieu.Phieu;
import Phieu.PhieuDAO;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import view.Phieu_Detail;

/**
 *
 * @author 84907
 */
public class PhieuNhap extends javax.swing.JInternalFrame {

    public ArrayList<Phieu> pn;
    DefaultTableModel model;
    int index;

    public PhieuNhap() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        model = (DefaultTableModel) tblDsNhap.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã Phiếu", "Người tạo phiếu", "Ngày tạo phiếu", "Thời gian tạo phiếu", "Tổng số tiền"
        });
        DefaultTableCellRenderer dtcr = (DefaultTableCellRenderer) tblDsNhap.getDefaultRenderer(Object.class);
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        pn = new PhieuDAO().selectAllPN();
        showList();
    }

    public void showList() {
        model.setRowCount(0);
        for (Phieu p : pn) {
            model.addRow(new Object[]{
                p.getMaPhieu(), p.getNguoiTao(), p.getNgayTao(), p.getGioTao(), formatCurrent(p.getTotal())
            });
        }
    }

    public String formatCurrent(int cur) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(cur);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDsNhap = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();

        setBorder(null);
        setFrameIcon(null);

        tblDsNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDsNhap.setSelectionBackground(new java.awt.Color(177, 8, 33));
        tblDsNhap.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblDsNhap);

        jButton1.setForeground(new java.awt.Color(177, 8, 33));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Detail_Phieu.png"))); // NOI18N
        jButton1.setText("Xem Chi Tiết");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(177, 8, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU NHẬP");

        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu", "Người tạo", "Thành tiền thấp hơn", "Thành tiền cao hơn" }));

        txtSearch.setForeground(new java.awt.Color(177, 8, 33));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index = tblDsNhap.getSelectedRow();
        if (pn.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách rỗng");
        } else {
            if (index < 0) {
                JOptionPane.showMessageDialog(rootPane, "Chọn 1 phiếu để xem chi tiết");
            } else {
                String x = (String) tblDsNhap.getValueAt(index, 0);
                Phieu_Detail pxd = new Phieu_Detail();
                pxd.getData(x);
                pxd.setVisible(true);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        switch ((String) cbxSearch.getSelectedItem()) {
            case "Mã phiếu":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByMaPhieuN(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
            case "Người tạo":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByNguoiTaoN(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
            case "Thành tiền thấp hơn":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByTotalThapHonN(Integer.parseInt(txtSearch.getText()))) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
            case "Thành tiền cao hơn":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByTotalCaoHonN(Integer.parseInt(txtSearch.getText()))) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
        }
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDsNhap;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
