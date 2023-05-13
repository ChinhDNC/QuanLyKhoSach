/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package doanoop.Panel;

import com.sun.source.tree.ParenthesizedTree;

/**
 *
 * @author 84907
 */
public class SachKhac_Panel extends javax.swing.JPanel {

    public SachKhac_Panel() {
        initComponents();
    }
    public String getLoai(){
        return txtLoai.getText();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLoai = new javax.swing.JTextField();
        txtNamXB1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        txtLoai.setForeground(new java.awt.Color(177, 8, 33));
        txtLoai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiActionPerformed(evt);
            }
        });

        txtNamXB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNamXB1.setForeground(new java.awt.Color(177, 8, 33));
        txtNamXB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNamXB1.setText("Loại");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(txtNamXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamXB1)
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField txtLoai;
    private javax.swing.JLabel txtNamXB1;
    // End of variables declaration//GEN-END:variables
}
