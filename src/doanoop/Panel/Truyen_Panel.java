/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package doanoop.Panel;

/**
 *
 * @author 84907
 */
public class Truyen_Panel extends javax.swing.JPanel {

    
    public Truyen_Panel() {
        initComponents();
    }

   public boolean Mau(){
       if(chxTomau.isSelected())
           return true;
       else return false;
   }
   public String test(){
       return "alo";
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chxTomau = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        chxTomau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chxTomau.setForeground(new java.awt.Color(177, 8, 33));
        chxTomau.setText("Được tô màu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(chxTomau)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(chxTomau)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox chxTomau;
    // End of variables declaration//GEN-END:variables
}
