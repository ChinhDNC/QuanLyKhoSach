/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package doanoop.Internal;

import controller.DAO;
import doanoop.model.Book;
import doanoop.model.TaiKhoan;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author 84907
 */
public class TrangChu extends javax.swing.JInternalFrame {
public ArrayList<Book> list;
    public ArrayList<TaiKhoan> taikhoan;
    int i = 0;
    public TrangChu() {
        list=new DAO().getBookList_inWare();
        taikhoan=new DAO().getTaiKhoan();
        for(TaiKhoan tk : taikhoan){
           if(!tk.getRole().equals("Admin")) i++;
       }
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        demNV = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        demSach = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(null);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(1200, 500));
        jPanel15.setPreferredSize(new java.awt.Dimension(1200, 500));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(232, 228, 228));

        jPanel1.setBackground(new java.awt.Color(177, 8, 33));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        demNV.setBackground(new java.awt.Color(0, 204, 204));
        demNV.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        demNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        demNV.setText((String.valueOf(i)));
        demNV.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                demNVComponentShown(evt);
            }
        });
        demNV.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                demNVInputMethodTextChanged(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/nhanvien.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(demNV, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(demNV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jPanel15.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 220, 140));

        lblname.setBackground(new java.awt.Color(0, 204, 102));
        lblname.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setDoubleBuffered(true);
        jPanel15.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 180, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("TÀI KHOẢN TRUY CẬP:");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 210, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Ngày hôm nay:");
        jPanel15.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 140, 50));

        today.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jPanel15.add(today, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, 190, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Đầu sách");
        jPanel15.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 140, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nhân viên");
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 150, 77));

        jPanel10.setBackground(new java.awt.Color(232, 228, 228));

        jPanel2.setBackground(new java.awt.Color(177, 8, 33));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        demSach.setBackground(new java.awt.Color(0, 204, 204));
        demSach.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        demSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        demSach.setText((String.valueOf(list.size())));
        demSach.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                demSachComponentShown(evt);
            }
        });
        demSach.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                demSachInputMethodTextChanged(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/sachTrangChu.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(demSach, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(demSach, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        jPanel15.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/bookManager-removebg-preview.png"))); // NOI18N
        jPanel15.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void demNVComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_demNVComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_demNVComponentShown

    private void demNVInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_demNVInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_demNVInputMethodTextChanged

    private void demSachComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_demSachComponentShown

    }//GEN-LAST:event_demSachComponentShown

    private void demSachInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_demSachInputMethodTextChanged

    }//GEN-LAST:event_demSachInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel demNV;
    private javax.swing.JLabel demSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JLabel lblname;
    public javax.swing.JLabel today;
    // End of variables declaration//GEN-END:variables
}
