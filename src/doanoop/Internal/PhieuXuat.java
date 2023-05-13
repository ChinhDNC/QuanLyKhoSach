/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package doanoop.Internal;

import Phieu.ChiTietPhieu;
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
public class PhieuXuat extends javax.swing.JInternalFrame {

    public ArrayList<Phieu> px;
    public ArrayList<ChiTietPhieu> ctp;
    DefaultTableModel model;
    int index;

    public PhieuXuat() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        model = (DefaultTableModel) tblDsXuat.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã Phiếu", "Người tạo phiếu", "Ngày tạo phiếu", "Thời gian tạo phiếu", "Tổng số tiền"
        });
        DefaultTableCellRenderer dtcr = (DefaultTableCellRenderer) tblDsXuat.getDefaultRenderer(Object.class);
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        px = new PhieuDAO().selectAllPX();
        showList();
    }

    public void showList() {
        for (Phieu p : px) {
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
        tblDsXuat = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxSearch = new javax.swing.JComboBox<>();
        txtSearch1 = new javax.swing.JTextField();

        setBorder(null);
        setFrameIcon(null);

        tblDsXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDsXuat.setSelectionBackground(new java.awt.Color(177, 8, 33));
        tblDsXuat.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblDsXuat);

        jButton1.setForeground(new java.awt.Color(177, 8, 33));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Detail_Phieu.png"))); // NOI18N
        jButton1.setText("Xem Chi Tiết");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(177, 8, 33));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU XUẤT");

        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu", "Người tạo", "Thành tiền thấp hơn", "Thành tiền cao hơn" }));

        txtSearch1.setForeground(new java.awt.Color(177, 8, 33));
        txtSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearch1ActionPerformed(evt);
            }
        });
        txtSearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearch1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(272, 272, 272)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
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
            .addGap(0, 676, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 676, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        index = tblDsXuat.getSelectedRow();
        if (px.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách rỗng");
        } else {
            if (index < 0) {
                JOptionPane.showMessageDialog(rootPane, "Chọn 1 phiếu để xem chi tiết");
            } else {
                String x = (String) tblDsXuat.getValueAt(index, 0);
                Phieu_Detail pxd = new Phieu_Detail();
                pxd.getData(x);
                pxd.setVisible(true);
            }
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearch1KeyReleased
        switch ((String) cbxSearch.getSelectedItem()) {
            case "Mã phiếu":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByMaPhieuX(txtSearch1.getText())) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
            case "Người tạo":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByNguoiTaoX(txtSearch1.getText())) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
            case "Thành tiền thấp hơn":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByTotalThapHonX(Integer.parseInt(txtSearch1.getText()))) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
            case "Thành tiền cao hơn":
                model.setRowCount(0);
                for (Phieu x : new PhieuDAO().findByTotalCaoHonX(Integer.parseInt(txtSearch1.getText()))) {
                    model.addRow(new Object[]{
                        x.getMaPhieu(), x.getNguoiTao(), x.getNgayTao(), x.getGioTao(), formatCurrent(x.getTotal())
                    });
                }
                break;
        }
    }//GEN-LAST:event_txtSearch1KeyReleased

    private void txtSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearch1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDsXuat;
    private javax.swing.JTextField txtSearch1;
    // End of variables declaration//GEN-END:variables
}
