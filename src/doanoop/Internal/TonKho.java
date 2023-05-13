/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package doanoop.Internal;

import controller.DAO;
import doanoop.model.Book;
import doanoop.model.GiaoTrinh;
import doanoop.model.Truyen;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hslf.blip.JPEG;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author 84907
 */
public class TonKho extends javax.swing.JInternalFrame {

    public ArrayList<GiaoTrinh> list_GT;
    public ArrayList<Truyen> list_TR;
    public ArrayList<Book> list;
    DefaultTableModel model;

    public TonKho() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setSize(1200, 686);
        model = (DefaultTableModel) tbllist.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng", "Giá"
        });
        DefaultTableCellRenderer dtcr = (DefaultTableCellRenderer) tbllist.getDefaultRenderer(Object.class);
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        list = new DAO().getBookList_inWare();
        list_GT = new DAO().getGTBook();
        list_TR = new DAO().getTRBook();
        showTable();
    }

    public String formatCurrent(int cur) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(cur);
    }

    public void showTable() {

        for (Book book : list) {
            model.addRow(new Object[]{
                book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), formatCurrent(book.getGia())
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbllist = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(177, 8, 33));
        setBorder(null);
        setFrameIcon(null);

        tbllist.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbllist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbllist.setSelectionBackground(new java.awt.Color(177, 8, 33));
        tbllist.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbllist);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tìm kiếm theo");

        cbxSearch.setForeground(new java.awt.Color(177, 8, 33));
        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Tác giả" }));

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

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/excel.png"))); // NOI18N
        jButton2.setText("Xuất File Excel");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl4.setForeground(new java.awt.Color(177, 8, 33));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Tìm kiếm theo:");

        jLabel1.setFont(new java.awt.Font("UTM A&S Signwriter", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(177, 3, 8));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Số sách hiện có trong kho");

        jPanel5.setBackground(new java.awt.Color(177, 8, 33));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(177, 8, 33));
        jPanel2.setPreferredSize(new java.awt.Dimension(3, 100));

        jPanel3.setBackground(new java.awt.Color(177, 8, 33));
        jPanel3.setPreferredSize(new java.awt.Dimension(3, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        switch ((String) cbxSearch.getSelectedItem()) {
            case "Mã sách":
                model.setRowCount(0);
                for (Book book : new DAO().findByMasach(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), book.getGia()
                    });
                }
                break;
            case "Tên sách":
                model.setRowCount(0);
                for (Book book : new DAO().findByTensach(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), book.getGia()
                    });
                }
                break;
            case "Tác giả":
                model.setRowCount(0);
                for (Book book : new DAO().findByTacgia(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), book.getGia()
                    });
                }
                break;
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        switch ((String) cbxSearch.getSelectedItem()) {
            case "Mã sách":
                model.setRowCount(0);
                for (Book book : new DAO().findByMasach1(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), book.getGia()
                    });
                }
                break;
            case "Tên sách":
                model.setRowCount(0);
                for (Book book : new DAO().findByTensach1(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), book.getGia()
                    });
                }
                break;
            case "Tác giả":
                model.setRowCount(0);
                for (Book book : new DAO().findByTacgia1(txtSearch.getText())) {
                    model.addRow(new Object[]{
                        book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getSoluong(), book.getGia()
                    });
                }
                break;
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
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
                sheet = wb.createSheet("Danh sách hàng");
                XSSFRow row = null;
                Cell cell = null;
                row = sheet.createRow(0);
                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue("Mã sách");
                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue("Tên sách");
                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Thể loại");
                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue("Tác giả");
                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue("Số lượng");
                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue("Nhà xuất bản");
                cell = row.createCell(6, CellType.NUMERIC);
                cell.setCellValue("Năm xuất bản");
                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue("Đơn giá");
                for (int i = 0; i < list.size(); i++) {
                    row = sheet.createRow(1 + i);
                    cell = row.createCell(0, CellType.STRING);
                    cell.setCellValue(list.get(i).getMasach());
                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(list.get(i).getTensach());
                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(list.get(i).getTheloai());
                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(list.get(i).getTacgia());
                    cell = row.createCell(4, CellType.NUMERIC);
                    cell.setCellValue(list.get(i).getSoluong());
                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(list.get(i).getNhaxuatban());
                    cell = row.createCell(6, CellType.NUMERIC);
                    cell.setCellValue(list.get(i).getNamxuatban());
                    cell = row.createCell(7, CellType.NUMERIC);
                    cell.setCellValue(list.get(i).getGia());
                }
                excel = new FileOutputStream(fileChooser.getSelectedFile() + ".xlsx");
                outputStream = new BufferedOutputStream(excel);
                wb.write(outputStream);
                JOptionPane.showMessageDialog(null, "Export file Excel SuccessFully");
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

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTable tbllist;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
