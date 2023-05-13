/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package doanoop.Internal;

import Dialog.GK;
import Dialog.GT;
import Dialog.TR;
import Dialog.SK;
import controller.DAO;
import doanoop.Home;
import doanoop.Panel.GiaoKhoa_Panel;
import doanoop.Panel.GiaoTrinh_Panel;
import doanoop.Panel.SachKhac_Panel;
import doanoop.Panel.Truyen_Panel;
import doanoop.model.Book;
import doanoop.model.GiaoTrinh;
import doanoop.model.Sachgiaokhoa;
import doanoop.model.Truyen;
import doanoop.model.SachKhac;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.batik.ext.swing.GridBagConstants;
import view.GiaoKhoa_Detail;
import view.GiaoTrinh_Detail;
import view.Truyen_Detail;
import view.SachKhac_Detail;

import view.Update_GT;
import view.Update_SGK;
import view.Update_TR;
import view.Update_SK;

/**
 *
 * @author 84907
 */
public class QuanLyDauSach extends javax.swing.JInternalFrame {

    GridBagLayout grid = new GridBagLayout();
    GiaoTrinh_Panel gt;
    Truyen_Panel tr;
    GiaoKhoa_Panel gk;
    SachKhac_Panel sk;
    public ArrayList<Book> list;
    public ArrayList<GiaoTrinh> list_GT;
    public ArrayList<Truyen> list_TR;
    public ArrayList<Sachgiaokhoa> list_GK;
    public ArrayList<SachKhac> list_SK;
    public DefaultTableModel model;
    int selectedIndex;

    public QuanLyDauSach() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setSize(1200, 686);
        model = (DefaultTableModel) tbllist.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Giá"
        });
        DefaultTableCellRenderer dtcr = (DefaultTableCellRenderer) tbllist.getDefaultRenderer(Object.class);
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);
        list = new DAO().getBookList();
        list_GT = new DAO().getGTBook();
        list_TR = new DAO().getTRBook();
        list_GK = new DAO().getGKBook();
        list_SK = new DAO().getSKBook();

        showTable();
        gt = new GiaoTrinh_Panel();
        tr = new Truyen_Panel();
        gk = new GiaoKhoa_Panel();
        sk = new SachKhac_Panel();
        panel.setLayout(grid);
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        panel.add(gt, gc);
        panel.add(tr, gc);
        panel.add(gk, gc);
        panel.add(sk, gc);
        gt.setVisible(true);
        tr.setVisible(false);
        gk.setVisible(false);
        sk.setVisible(false);

        selectedIndex = tbllist.getSelectedRow();

    }

    public String formatCurrent(int cur) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(cur);
    }

    public void showTable() {
        model.setRowCount(0);
        for (Book book : new DAO().getBookList()) {
            model.addRow(new Object[]{
                book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), formatCurrent(book.getGia())
            });
        }
    }

    void valid() {
        if (txtMasach.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Điền vào Mã sách");
        } else if (txtTensach.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Điền vào tên sách");
        } else if (txtTacgia.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Điền vào tác giả");
        } else if (txtNXB.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Điền vào Nhà xuất bản");
        } else if (lbl.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Điền vào Năm xuất bản");
        } else if (txtGia.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Điền vào giá sách");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMasach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTensach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTacgia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNXB = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        txtNamXB = new javax.swing.JTextField();
        txtNamXB1 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        txtNamXB2 = new javax.swing.JLabel();
        cbxTheloai = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbxSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbllist = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(177, 8, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(177, 8, 33));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mã sách");

        txtMasach.setForeground(new java.awt.Color(177, 8, 33));
        txtMasach.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtMasach.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasachActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(177, 8, 33));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tên sách");

        txtTensach.setForeground(new java.awt.Color(177, 8, 33));
        txtTensach.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtTensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTensachActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(177, 8, 33));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tác giả");

        txtTacgia.setForeground(new java.awt.Color(177, 8, 33));
        txtTacgia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtTacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTacgiaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(177, 8, 33));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nhà xuất bản");

        txtNXB.setForeground(new java.awt.Color(177, 8, 33));
        txtNXB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNXBActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl.setForeground(new java.awt.Color(177, 8, 33));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("Năm xuất bản");

        txtNamXB.setForeground(new java.awt.Color(177, 8, 33));
        txtNamXB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtNamXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamXBActionPerformed(evt);
            }
        });
        txtNamXB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamXBKeyTyped(evt);
            }
        });

        txtNamXB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNamXB1.setForeground(new java.awt.Color(177, 8, 33));
        txtNamXB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNamXB1.setText("Đơn giá");

        txtGia.setForeground(new java.awt.Color(177, 8, 33));
        txtGia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 8, 33)));
        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });
        txtGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGiaKeyTyped(evt);
            }
        });

        txtNamXB2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNamXB2.setForeground(new java.awt.Color(177, 8, 33));
        txtNamXB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNamXB2.setText("Thể loại");

        cbxTheloai.setForeground(new java.awt.Color(177, 8, 33));
        cbxTheloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giáo trình", "Truyện", "Sách giáo khoa", "Khác" }));
        cbxTheloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxTheloaiMouseClicked(evt);
            }
        });
        cbxTheloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTheloaiActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(177, 8, 33));
        jLabel2.setText("QUẢN LÝ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(177, 8, 33));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/bookshelf.png"))); // NOI18N

        jLabel10.setForeground(new java.awt.Color(227, 227, 227));
        jLabel10.setText("________________________________________________________________________________");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(177, 8, 33));
        jLabel8.setText("ĐẦU SÁCH");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(177, 8, 33))); // NOI18N

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(177, 8, 33));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/detail.png"))); // NOI18N
        jButton3.setText("Chi tiết");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(177, 8, 33));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Update.png"))); // NOI18N
        jButton2.setText("Sửa");
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(177, 8, 33));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanoop/img/Add.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(177, 8, 33))); // NOI18N

        cbxSearch.setForeground(new java.awt.Color(177, 8, 33));
        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Tác giả", "Giá thấp hơn", "Giá cao hơn" }));
        cbxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSearchActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(txtNamXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNamXB2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel8)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(86, 86, 86)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamXB2)
                    .addComponent(cbxTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl)
                            .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNamXB1)
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMasachActionPerformed

    private void txtTensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTensachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTensachActionPerformed

    private void txtTacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTacgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTacgiaActionPerformed

    private void txtNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNXBActionPerformed

    private void txtNamXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamXBActionPerformed

    private void cbxTheloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTheloaiActionPerformed

        switch ((String) cbxTheloai.getSelectedItem()) {
            case "Giáo trình":
                gt.setVisible(true);
                tr.setVisible(false);
                gk.setVisible(false);
                sk.setVisible(false);

                break;
            case "Truyện":
                gt.setVisible(false);
                tr.setVisible(true);
                gk.setVisible(false);
                sk.setVisible(false);

                break;
            case "Sách giáo khoa":
                gt.setVisible(false);
                tr.setVisible(false);
                gk.setVisible(true);
                sk.setVisible(false);

                break;
            case "Khác":
                gt.setVisible(false);
                tr.setVisible(false);
                gk.setVisible(false);
                sk.setVisible(true);

        }

    }//GEN-LAST:event_cbxTheloaiActionPerformed

    private void cbxTheloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTheloaiMouseClicked

    }//GEN-LAST:event_cbxTheloaiMouseClicked

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed

    private void txtGiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtGiaKeyTyped

    private void txtNamXBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamXBKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtNamXBKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        selectedIndex = tbllist.getSelectedRow();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách rỗng");
        } else if (selectedIndex == -1)
        JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 sách để xem chi tiết");
        else {
            String ma = tbllist.getValueAt(selectedIndex, 0).toString();
            String theloai = tbllist.getValueAt(selectedIndex, 2).toString();
            switch (theloai) {
                case "Giáo trình":
                GiaoTrinh_Detail gd = new GiaoTrinh_Detail();
                gd.getData(new DAO().getGiaoTrinh(ma));
                gd.setVisible(true);
                break;
                case "Truyện":
                Truyen_Detail tr = new Truyen_Detail();
                tr.getData(new DAO().getTruyen(ma));
                tr.setVisible(true);
                break;
                case "Sách giáo khoa":
                GiaoKhoa_Detail gkd = new GiaoKhoa_Detail();
                gkd.getData(new DAO().getGiaoKhoa(ma));
                gkd.setVisible(true);
                break;
                case "Khác":
                SachKhac_Detail skd = new SachKhac_Detail();
                skd.getData(new DAO().getSachKhac(ma));
                skd.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedIndex = tbllist.getSelectedRow();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách rỗng");
        } else if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 sách để sửa");
        } else {
            String ma = tbllist.getValueAt(selectedIndex, 0).toString();
            String theloai = tbllist.getValueAt(selectedIndex, 2).toString();
            switch (theloai) {
                case "Giáo trình":
                GT x = new GT(this);
                x.getData(new DAO().getGiaoTrinh(ma));
                x.setVisible(true);
                break;
                case "Truyện":
                TR y = new TR(this);
                y.getData(new DAO().getTruyen(ma));
                y.setVisible(true);
                break;
                case "Sách giáo khoa":
                GK z = new GK(this);
                z.getData(new DAO().getGiaoKhoa(ma));
                z.setVisible(true);
                break;
                case "Khác":
                SK j = new SK(this);
                j.getData(new DAO().getSachKhac(ma));
                j.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        valid();
        switch ((String) cbxTheloai.getSelectedItem()) {
            case "Giáo trình":
            GiaoTrinh gtr = new GiaoTrinh();
            gtr.setMasach(txtMasach.getText());
            gtr.setTensach(txtTensach.getText());
            gtr.setTacgia(txtTacgia.getText());
            gtr.setNhaxuatban(txtNXB.getText());
            gtr.setNamxuatban(Integer.parseInt(txtNamXB.getText()));
            gtr.setGia(Integer.parseInt(txtGia.getText()));
            gtr.setLinhvuc(gt.getLinhvuc());

            if (new DAO().addGT(gtr)) {
                JOptionPane.showMessageDialog(this, "Thêm thành công! ");
                list.add((Book) gtr);
                list_GT.add(gtr);
                gt.txtLinhvuc.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
            }
            break;
            case "Truyện":
            Truyen truyen = new Truyen();
            truyen.setMasach(txtMasach.getText());
            truyen.setTensach(txtTensach.getText());
            truyen.setTacgia(txtTacgia.getText());
            truyen.setNhaxuatban(txtNXB.getText());
            truyen.setNamxuatban(Integer.parseInt(txtNamXB.getText()));
            truyen.setGia(Integer.parseInt(txtGia.getText()));
            truyen.setTomau(tr.Mau());
            if (new DAO().addTR(truyen)) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                list.add((Book) truyen);
                list_TR.add(truyen);
                tr.chxTomau.setSelected(false);

            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
            }

            case "Sách giáo khoa":
            Sachgiaokhoa sgk = new Sachgiaokhoa();
            sgk.setMasach(txtMasach.getText());
            sgk.setTensach(txtTensach.getText());
            sgk.setTacgia(txtTacgia.getText());
            sgk.setNhaxuatban(txtNXB.getText());
            sgk.setNamxuatban(Integer.parseInt(txtNamXB.getText()));
            sgk.setGia(Integer.parseInt(txtGia.getText()));
            sgk.setKhoi(gk.getKhoi());
            if (new DAO().addSGK(sgk)) {
                list.add((Book) sgk);
                list_GK.add(sgk);
                gk.cbxLop.setSelectedIndex(1);
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!");
            }
            case "Khác":
            SachKhac skhac = new SachKhac();
            skhac.setMasach(txtMasach.getText());
            skhac.setTensach(txtTensach.getText());
            skhac.setTacgia(txtTacgia.getText());
            skhac.setNhaxuatban(txtNXB.getText());
            skhac.setNamxuatban(Integer.parseInt(txtNamXB.getText()));
            skhac.setGia(Integer.parseInt(txtGia.getText()));
            skhac.setLoai(sk.getLoai());
            if (new DAO().addSK(skhac)) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                list.add((Book) skhac);
                list_SK.add(skhac);
                sk.txtLoai.setText("");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!");
            }
            break;
            default:
            Book sach = new Book();
            sach.setMasach(txtMasach.getText());
            sach.setTensach(txtTensach.getText());
            sach.setTacgia(txtTacgia.getText());
            sach.setNhaxuatban(txtNXB.getText());
            sach.setNamxuatban(Integer.parseInt(txtNamXB.getText()));
            sach.setGia(Integer.parseInt(txtGia.getText()));
            if (new DAO().addBook(sach)) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                list.add((Book) sach);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm thất bại!");
            }

        }
        txtMasach.setText("");
        txtTensach.setText("");
        txtTacgia.setText("");
        txtNXB.setText("");
        txtNamXB.setText("");
        txtGia.setText("");
        showTable();
        selectedIndex = new Integer(-1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        switch ((String) cbxSearch.getSelectedItem()) {
            case "Mã sách":
            model.setRowCount(0);
            for (Book book : new DAO().findByMasach(txtSearch.getText())) {
                model.addRow(new Object[]{
                    book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getGia()
                });
            }
            break;
            case "Tên sách":
            model.setRowCount(0);
            for (Book book : new DAO().findByTensach(txtSearch.getText())) {
                model.addRow(new Object[]{
                    book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getGia()
                });
            }
            break;
            case "Tác giả":

            model.setRowCount(0);
            for (Book book : new DAO().findByTacgia(txtSearch.getText())) {
                model.addRow(new Object[]{
                    book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getGia()
                });
            }
            break;
            case "Giá thấp hơn":
            model.setRowCount(0);
            selectedIndex = -1;
            for (Book book : new DAO().findByGiaThapHon(Integer.parseInt(txtSearch.getText()))) {
                model.addRow(new Object[]{
                    book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getGia()
                });
            }
            break;
            case "Giá cao hơn":
            model.setRowCount(0);
            selectedIndex = -1;
            for (Book book : new DAO().findByGiaCaoHon(Integer.parseInt(txtSearch.getText()))) {
                model.addRow(new Object[]{
                    book.getMasach(), book.getTensach(), book.getTheloai(), book.getTacgia(), book.getGia()
                });
            }
            break;
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JComboBox<String> cbxTheloai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbllist;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMasach;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JLabel txtNamXB1;
    private javax.swing.JLabel txtNamXB2;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTacgia;
    private javax.swing.JTextField txtTensach;
    // End of variables declaration//GEN-END:variables
}
