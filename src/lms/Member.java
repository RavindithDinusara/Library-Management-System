package lms;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Member extends javax.swing.JFrame {

    public Member() 
    {
        initComponents();
        connect();
        Member_Load();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void connect()
    {      
        try 
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/lms", "root", "");     
    } 
        catch (ClassNotFoundException ex)
        {
        JOptionPane.showMessageDialog(null, "Database Driver Not Found: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
        catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Database Connection Failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }   
    public void Member_Load()
    {
        int columnCount;
    try 
    {
        pst = con.prepareStatement("SELECT * FROM Member");
        rs = pst.executeQuery();
        
        ResultSetMetaData rsMetaData = rs.getMetaData();
        columnCount = rsMetaData.getColumnCount();
        
        DefaultTableModel tableModel = (DefaultTableModel) tblMember.getModel();
        tableModel.setRowCount(0);
        
        while (rs.next()) 
        {
            Vector<String> rowData = new Vector<>();
            
            for (int i = 1; i <= columnCount; i++) 
            {
                rowData.add(rs.getString(i));
            }
            tableModel.addRow(rowData);
        }           
    } 
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Error loading member data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        txttel = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btncancel = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 76, -1, -1));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 61, 219, 55));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 21, 219, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 23, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Member Tel");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 63, -1, -1));

        btnGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbMale.setForeground(new java.awt.Color(255, 255, 255));
        rbMale.setText("Male");
        jPanel2.add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 21, -1, -1));

        btnGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbFemale.setForeground(new java.awt.Color(255, 255, 255));
        rbFemale.setText("female");
        jPanel2.add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 21, -1, -1));
        jPanel2.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 60, 181, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 723, 130));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel3.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 95, 40));

        btndelete.setBackground(new java.awt.Color(204, 0, 51));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 94, 40));

        btnupdate.setBackground(new java.awt.Color(0, 51, 204));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 93, 40));

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel3.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 96, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 723, 61));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Member Address", "Member Tel", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMember);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 723, -1));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW MEMBER");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
    String name = txtname.getText().trim();
    String address = txtaddress.getText().trim();
    String telephone = txttel.getText().trim();
    String gender = "";

    if (rbMale.isSelected())
    {
        gender = "Male";
    } else if (rbFemale.isSelected()) 
    {
        gender = "Female";
    }

    if (name.isEmpty() || address.isEmpty() || telephone.isEmpty() || gender.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        pst = con.prepareStatement("INSERT INTO member(name, address, tel, gender) VALUES(?, ?, ?, ?)");
        pst.setString(1, name);
        pst.setString(2, address);
        pst.setString(3, telephone);
        pst.setString(4, gender);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Member Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtname.setText("");
            txtaddress.setText("");
            txttel.setText("");
            btnGender.clearSelection();
            txtname.requestFocus();
            Member_Load();
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Error adding member", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberMouseClicked
        
    DefaultTableModel d1 = (DefaultTableModel) tblMember.getModel();
    int selectIndex = tblMember.getSelectedRow();
    
    int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
    txtname.setText(d1.getValueAt(selectIndex, 1).toString());
    txtaddress.setText(d1.getValueAt(selectIndex, 2).toString());
    txttel.setText(d1.getValueAt(selectIndex, 3).toString());
    
    String gender = d1.getValueAt(selectIndex, 4).toString();
    if (gender.equals("Male")) {
        rbMale.setSelected(true);
    } else if (gender.equals("Female")) {
        rbFemale.setSelected(true);
    }
    
    btnadd.setEnabled(false);               
    }//GEN-LAST:event_tblMemberMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
               
    DefaultTableModel tableModel = (DefaultTableModel) tblMember.getModel();
    int selectedIndex = tblMember.getSelectedRow();

    if (selectedIndex == -1) 
    {
        JOptionPane.showMessageDialog(this, "Please select a member to update", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());

    String name = txtname.getText().trim();
    String address = txtaddress.getText().trim();
    String telephone = txttel.getText().trim();
    String gender = "";

    if (rbMale.isSelected()) 
    {
        gender = "Male";
    } else if (rbFemale.isSelected()) 
    {
        gender = "Female";
    }

    if (name.isEmpty() || address.isEmpty() || telephone.isEmpty() || gender.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        pst = con.prepareStatement("UPDATE member SET name = ?, address = ?, tel = ?, gender = ? WHERE id = ?");
        pst.setString(1, name);
        pst.setString(2, address);
        pst.setString(3, telephone);
        pst.setString(4, gender);
        pst.setInt(5, id);

        int result = pst.executeUpdate();

        if (result == 1)
        {
            JOptionPane.showMessageDialog(this, "Member Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtname.setText("");
            txtaddress.setText("");
            txttel.setText("");
            btnGender.clearSelection(); 
            txtname.requestFocus();
            btnadd.setEnabled(true);
            Member_Load();
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Error updating member", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
    DefaultTableModel tableModel = (DefaultTableModel) tblMember.getModel();
    int selectedIndex = tblMember.getSelectedRow();

    if (selectedIndex == -1)
    {
        JOptionPane.showMessageDialog(this, "Please select a member to delete", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this member?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) 
    {
        return;
    }

    try 
    {
        pst = con.prepareStatement("DELETE FROM member WHERE id = ?");
        pst.setInt(1, id);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Member Deleted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtname.setText("");
            txtaddress.setText("");
            txttel.setText("");
            btnGender.clearSelection();
            txtname.requestFocus();
            Member_Load();
            btnadd.setEnabled(true);
        } 
        else
        {
            JOptionPane.showMessageDialog(this, "Error deleting member", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblMember;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
