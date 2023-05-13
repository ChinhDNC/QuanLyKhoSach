/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanoop;

import com.formdev.flatlaf.FlatLightLaf;
import controller.DAO;
import doanoop.Internal.TrangChu;
import doanoop.model.TaiKhoan;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import doanoop.Home_NVNK;
import doanoop.Home_NVXK;
import doanoop.Home;
/**
 *
 * @author 84907
 */
public class Login extends javax.swing.JFrame {

    List<TaiKhoan> taikhoan;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        taikhoan = new DAO().getTaiKhoan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 82));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("Quản lý kho sách");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 210, 30));

        jLabel10.setForeground(new java.awt.Color(227, 227, 227));
        jLabel10.setText("________________________________________________________________________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(177, 8, 33));
        jLabel11.setText(".");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        txtuser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtuser.setForeground(new java.awt.Color(177, 8, 33));
        txtuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 340, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(177, 8, 33));
        jLabel12.setText("Quên mật khẩu");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 110, 40));

        txtpass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 340, 40));

        jButton.setBackground(new java.awt.Color(177, 8, 33));
        jButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton.setForeground(new java.awt.Color(255, 255, 255));
        jButton.setText("Đăng nhập");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 400, 40));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 80));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(177, 8, 33));
        jLabel14.setText("Tài khoản");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/books (1).png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, 70));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/lock_50px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 50, 50));

        jPanel1.setBackground(new java.awt.Color(177, 8, 33));
        jPanel1.setForeground(new java.awt.Color(177, 8, 33));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/sign_in_book_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(148, 148, 148))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 480, 680));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/user_50px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, 50));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(177, 8, 33));
        jLabel18.setText("Mật khẩu");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, 40));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(177, 8, 33));
        jLabel19.setText("ĐĂNG NHÂP");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        int i = 1;
        if (txtuser.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập Tên tài khoản", "Lỗi đăng nhập", JOptionPane.WARNING_MESSAGE);
        } else {
            if (txtpass.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mật khẩu", "Lỗi đăng nhập", JOptionPane.WARNING_MESSAGE);
            } else {
                for (TaiKhoan tk : taikhoan) {
                    if (txtuser.getText().equals(tk.getUser())) {
                        if (txtpass.getText().equals(tk.getPass())) {
                            if (tk.getStatus().equals("Tạm khóa")) {
                                JOptionPane.showMessageDialog(rootPane, "Tài khoản của bạn hiện đang bị khóa");
                            } else {
                                if(tk.getRole().equals("Thủ kho")){
                                    this.dispose();
                                    Home home = new Home();
                                    home.getName(txtuser.getText());
                                    home.Today();
                                    home.setVisible(true);
                                }
                                if(tk.getRole().equals("Nhân viên xuất")){
                                    this.dispose();
                                    Home_NVXK home = new Home_NVXK();
                                    home.getName(txtuser.getText());
                                    home.Today();
                                    home.setVisible(true);
                                }
                                 if(tk.getRole().equals("Nhân viên nhập")){
                                    this.dispose();
                                    Home_NVNK home = new Home_NVNK();
                                    home.getName(txtuser.getText());
                                    home.Today();
                                    home.setVisible(true);
                                }

                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Sai mật khẩu");
                        }
                        i = 0;
                    }
                    i++;
                    if (i == taikhoan.size() + 1) {
                        JOptionPane.showMessageDialog(rootPane, "Tài khoản không tồn tại");
                    }
                }

            }
        }
    }//GEN-LAST:event_jButtonActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Có mỗi cái mật khẩu mà cũng quên!\nThôi chuẩn bị nộp đơn nghỉ việc là vừa!");
    }//GEN-LAST:event_jLabel12MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println(" Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField txtpass;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
