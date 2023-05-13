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
public class GiaoTrinh_Panel extends javax.swing.JPanel {

    public GiaoTrinh_Panel() {
        initComponents();
    }
    public String getLinhvuc(){
        return txtLinhvuc.getText();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLinhvuc = new javax.swing.JTextField();
        txtNamXB1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        txtLinhvuc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtLinhvuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinhvucActionPerformed(evt);
            }
        });

        txtNamXB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNamXB1.setForeground(new java.awt.Color(177, 8, 33));
        txtNamXB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNamXB1.setText("Lĩnh vực");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(txtNamXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLinhvuc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamXB1)
                    .addComponent(txtLinhvuc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLinhvucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinhvucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinhvucActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField txtLinhvuc;
    private javax.swing.JLabel txtNamXB1;
    // End of variables declaration//GEN-END:variables
}
