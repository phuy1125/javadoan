/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.KhuyenMaiBUS;
import GUI.Dialog.KhuyenMaiDialog_add;
import GUI.Dialog.KhuyenMaiDialog_edit;
import Model.KHUYENMAI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import table.TableKhuyenMai;


/**
 *
 * @author NK
 */
public class KhuyenMai extends javax.swing.JPanel {
    KHUYENMAI s = new KHUYENMAI();
    KhuyenMaiBUS khuyenMaiBUS;
    DefaultTableModel defaultTableModel;
    JScrollPane scrollTableKhuyenMai;
    

    /**
     * Creates new form KhuyenMai
     */
    public KhuyenMai() {
        initComponents();
       
        khuyenMaiBUS = new KhuyenMaiBUS();
        tableKhuyenMai1.getColumnModel().getColumn(0).setPreferredWidth(10);
        tableKhuyenMai1.getColumnModel().getColumn(1).setPreferredWidth(90);
        tableKhuyenMai1.getColumnModel().getColumn(2).setPreferredWidth(90);
        tableKhuyenMai1.getColumnModel().getColumn(3).setPreferredWidth(150);
        tableKhuyenMai1.getColumnModel().getColumn(4).setPreferredWidth(50);
        tableKhuyenMai1.getColumnModel().getColumn(5).setPreferredWidth(100);
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        tableKhuyenMai1.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã khuyến mãi ");
        defaultTableModel.addColumn("Mã sản phẩm");
        defaultTableModel.addColumn("Chương trình khuyến mãi");
        defaultTableModel.addColumn("Chiết khẩu");
        defaultTableModel.addColumn("Ngày bắt đầu");
        defaultTableModel.addColumn("Ngày kết thúc");
       
        
        
        setDataTable(khuyenMaiBUS.selectAll(s));
        
        
//        defaultTableModel = new DefaultTableModel();
//        String[] header = new String[]{"Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Ngày tham gia"};
//        defaultTableModel.setColumnIdentifiers(header);
//        tableKhuyenMai1.setModel(defaultTableModel);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableKhuyenMai1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tableKhuyenMai1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tableKhuyenMai1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tableKhuyenMai1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tableKhuyenMai1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tableKhuyenMai1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
    }
    

    public void setDataTable(ArrayList<KHUYENMAI> kmDao) {
        for (KHUYENMAI kmKhuyenMai : kmDao){
            defaultTableModel.addRow(new Object[]{kmKhuyenMai.getMaKM(),kmKhuyenMai.getMaSP(),kmKhuyenMai.getCtkm(),
                kmKhuyenMai.getChietKhau(),kmKhuyenMai.getNgayBD(), kmKhuyenMai.getNgayKT()
            });
        }
    }
    
    public void refreshTable(){
        defaultTableModel.setRowCount(0);
        setDataTable(khuyenMaiBUS.selectAll(s));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKhuyenMai1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        tableKhuyenMai1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tableKhuyenMai1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 80));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Nhập thông tin khuyến mại tìm kiếm");
        jTextField1.setPreferredSize(new java.awt.Dimension(350, 40));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1clicktimkiemsanpham(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        jLabel1.setText("Xóa");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(70, 70));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        jLabel2.setText("Thêm");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 70));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        jLabel3.setText("Sửa");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(70, 70));
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1clicktimkiemsanpham(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1clicktimkiemsanpham
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField1.setForeground(Color.black);
        TableRowSorter<DefaultTableModel> rowSorter;

         rowSorter = new TableRowSorter<>(defaultTableModel);
        tableKhuyenMai1.setRowSorter(rowSorter);

        // Tạo JTextField để nhập từ khóa tìm kiếm
        
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = jTextField1.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });
    }//GEN-LAST:event_jTextField1clicktimkiemsanpham

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed
  
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        KhuyenMaiDialog_add a = new KhuyenMaiDialog_add();
        a.setVisible(true); 
        a.setOnProductAddedListener(new KhuyenMaiDialog_add.OnProductAddedListener() {
        @Override
            public void onProductAdded() {
                refreshTable();
            }
        });
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int row = tableKhuyenMai1.getSelectedRow();
           
           if(row==-1){
            JOptionPane.showMessageDialog(this,"Hãy chọn sản phẩm cần sửa","Thông báo",JOptionPane.ERROR_MESSAGE);
        }else{
            String maKM = tableKhuyenMai1.getValueAt(row, 0).toString();
            String maSP = tableKhuyenMai1.getValueAt(row,1).toString();
            String tenKM = tableKhuyenMai1.getValueAt(row,2).toString();
            String chietKhau = tableKhuyenMai1.getValueAt(row,3).toString();
            String ngayBD= tableKhuyenMai1.getValueAt(row,4).toString();
            String ngayKT= tableKhuyenMai1.getValueAt(row,5).toString();
            KhuyenMaiDialog_edit b = new  KhuyenMaiDialog_edit(maKM);
            b.setVisible(true);
            b.setText(maSP, tenKM, chietKhau, ngayBD, ngayKT);
            
            b.setOnProductAddedListener(new KhuyenMaiDialog_edit.OnProductAddedListener() {
            @Override
                public void onProductAdded() {
                    refreshTable();
                }
            });
        }
    }//GEN-LAST:event_jLabel3MouseClicked
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int row = tableKhuyenMai1.getSelectedRow();
        
        if (row == -1 ){
            JOptionPane.showMessageDialog(this, "Hãy chọn khuyến mãi cần xóa","Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int rs= JOptionPane.showConfirmDialog(this, "Xác nhận xóa khuyến mãi", "Xóa khuyến mãi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(rs==JOptionPane.YES_OPTION){
                String maKM = tableKhuyenMai1.getValueAt(row,0).toString();
            
                s.setMaKM(maKM);
                khuyenMaiBUS.delete(s);
            }
            
        }
        defaultTableModel.setRowCount(0);
        setDataTable(khuyenMaiBUS.selectAll(s));
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableKhuyenMai1;
    // End of variables declaration//GEN-END:variables
}
