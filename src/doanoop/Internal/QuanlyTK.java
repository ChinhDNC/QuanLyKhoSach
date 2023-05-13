/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package doanoop.Internal;

import controller.DAO;
import doanoop.model.TaiKhoan;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import view.AddTK;
import view.UpdateTK;

public class QuanlyTK extends javax.swing.JInternalFrame {

    ArrayList<TaiKhoan> taikhoan;
    DefaultTableModel model;
    int selectedIndex;

    public QuanlyTK() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        taikhoan = new DAO().getTaiKhoan();
        model = (DefaultTableModel) tblDSNV.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Username", "Role", "Phone", "Status"
        });
        DefaultTableCellRenderer dtcr = (DefaultTableCellRenderer) tblDSNV.getDefaultRenderer(Object.class);
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        selectedIndex = tblDSNV.getSelectedRow();
        showTable();
    }

    public void showTable() {
        tblDSNV.removeAll();
        model.setRowCount(0);
        for (TaiKhoan tk : new DAO().getTaiKhoan()) {
            model.addRow(new Object[]{
                tk.getUser(), tk.getRole(), tk.getPhone(), tk.getStatus()
            });
        }
    }
  
    public TaiKhoan getAcc(){
        int i = tblDSNV.getSelectedRow();
        String user = tblDSNV.getValueAt(i, 0).toString();
        return new DAO().getTK(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSNV = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cbxSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();

        setBorder(null);
        setFrameIcon(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(1426, 839));

        tblDSNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDSNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDSNV.setSelectionBackground(new java.awt.Color(177, 8, 33));
        tblDSNV.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblDSNV);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("UTM A&S Signwriter", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(177, 3, 8));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/image_users.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(177, 3, 88))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(177, 3, 88));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(177, 3, 8));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Add.png"))); // NOI18N
        jButton5.setText("THÊM");
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(177, 3, 8));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Update.png"))); // NOI18N
        jButton6.setText("SỬA");
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(177, 3, 8));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/trash_can_50px.png"))); // NOI18N
        jButton7.setText("XOÁ");
        jButton7.setBorder(null);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(177, 3, 8));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/excel.png"))); // NOI18N
        jButton8.setText("XUẤT FILE EXCEL");
        jButton8.setBorder(null);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(31, 31, 31)
                .addComponent(jButton7)
                .addGap(32, 32, 32)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(177, 3, 88))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(177, 3, 88));

        cbxSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxSearch.setForeground(new java.awt.Color(177, 8, 33));
        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Username", "Role", "Phone" }));
        cbxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(177, 8, 33));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        AddTK da = new AddTK(this);
        da.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        selectedIndex = tblDSNV.getSelectedRow();
        if (taikhoan.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách nhân viên rỗng");
        } else if (selectedIndex < 0)
        JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 tài khoản để sửa");
        else {
            UpdateTK edit = new UpdateTK(this);
            edit.editDataTK();
            edit.setVisible(true);

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        selectedIndex = tblDSNV.getSelectedRow();
        TaiKhoan a = new TaiKhoan();

        if (taikhoan.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách nhân viên rỗng");
        } else if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 tài khoản để xóa");
        } else {
            if (taikhoan.get(selectedIndex).getRole().equals("Admin")) {
                JOptionPane.showMessageDialog(rootPane, "Không thể xóa Admin");
            } else {
                int res = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc xóa?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_OPTION) {
                    if (new DAO().deleteTK(taikhoan.get(selectedIndex))) {
                        JOptionPane.showMessageDialog(rootPane, "Đã xóa");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Xóa thất bại");
                    }
                    QuanlyTK qlK = new QuanlyTK();
                    showTable();
                }
                if (res == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(rootPane, "Đã hủy việc xóa");
                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\84907\\Desktop");
        XSSFWorkbook wb = null;
        XSSFSheet sheet = null;
        BufferedOutputStream outputStream = null;
        fileChooser.setDialogTitle("Save As");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        int file = fileChooser.showSaveDialog(null);

        if (file == JFileChooser.APPROVE_OPTION) {

            FileOutputStream excel = null;
            try {
                wb = new XSSFWorkbook();
                sheet = wb.createSheet("Danh sách thành viên");
                XSSFRow row = null;
                Cell cell = null;
                row = sheet.createRow(0);
                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue("Username");
                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue("Password");
                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Vai trò");
                cell = row.createCell(3, CellType.NUMERIC);
                cell.setCellValue("Số điện thoại");

                for (int i = 0; i < taikhoan.size(); i++) {
                    row = sheet.createRow(1 + i);
                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellValue(taikhoan.get(i).getUser());
                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(taikhoan.get(i).getPass());
                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(taikhoan.get(i).getRole());
                    cell = row.createCell(3, CellType.NUMERIC);
                    cell.setCellValue(taikhoan.get(i).getPhone());

                }
                excel = new FileOutputStream(fileChooser.getSelectedFile() + ".xlsx");
                outputStream = new BufferedOutputStream(excel);
                wb.write(outputStream);
                JOptionPane.showMessageDialog(null, "Xuất file excel thành công!");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
            } finally {
                try {
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (excel != null) {
                        excel.close();
                    }
                    if (wb != null) {
                        wb.close();
                    }
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cbxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        switch ((String) cbxSearch.getSelectedItem()) {
            case "Username":
            model.setRowCount(0);
            for (TaiKhoan tk : new DAO().findByUser(txtSearch.getText())) {
                model.addRow(new Object[]{
                    tk.getUser(), tk.getRole(), tk.getPhone(), tk.getStatus()
                });
            }
            break;
            case "Role":
            model.setRowCount(0);
            for (TaiKhoan tk : new DAO().findByRole(txtSearch.getText())) {
                model.addRow(new Object[]{
                    tk.getUser(), tk.getRole(), tk.getPhone(), tk.getStatus()
                });
            }
            break;
            case "Phone":
            model.setRowCount(0);
            for (TaiKhoan tk : new DAO().findByPhone(txtSearch.getText())) {
                model.addRow(new Object[]{
                    tk.getUser(), tk.getRole(), tk.getPhone(), tk.getStatus()
                });
            }
            break;
        }
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSNV;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
