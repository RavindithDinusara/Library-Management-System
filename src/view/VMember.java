package view;

import controller.CMember;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class VMember extends javax.swing.JFrame 
{

    public VMember() 
    {
        setSize(947,654);
        initComponents();
        Member_Load();
        
    }
    CMember memberController = new CMember();
    
    public void Member_Load()
    {
        DefaultTableModel model = (DefaultTableModel) tblMember.getModel();
        memberController.loadMembers(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        txttel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(947, 654));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                            ADD NEW MEMBER");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 950, -1));

        tblMember.setBackground(new java.awt.Color(0, 0, 0));
        tblMember.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblMember.setForeground(new java.awt.Color(255, 255, 255));
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
        tblMember.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblMember.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMember);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 850, 220));

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 260, 40));

        btnupdate.setBackground(new java.awt.Color(0, 51, 204));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 260, 40));

        btndelete.setBackground(new java.awt.Color(204, 0, 51));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 260, 40));

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Close");
        btncancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 260, 40));

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtaddress.setRows(5);
        txtaddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane2.setViewportView(txtaddress);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 60));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        rbMale.setBackground(new java.awt.Color(102, 102, 102));
        btnGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbMale.setForeground(new java.awt.Color(255, 255, 255));
        rbMale.setText("Male");
        jPanel1.add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        rbFemale.setBackground(new java.awt.Color(102, 102, 102));
        btnGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbFemale.setForeground(new java.awt.Color(255, 255, 255));
        rbFemale.setText("female");
        jPanel1.add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        txttel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Member Tel");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        txtMS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMS.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Search Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        txtMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSActionPerformed(evt);
            }
        });
        jPanel1.add(txtMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 260, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/BackGR.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 947, 654));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
    String name = txtname.getText();
    String address = txtaddress.getText();
    String telephone = txttel.getText();
    String gender = "";

    if (rbMale.isSelected()) 
    {
        gender = "Male";
    }
    else if (rbFemale.isSelected()) 
    {
        gender = "Female";
    }

    CMember add = new CMember();
    add.addMember(name, address, telephone, gender);

    Member_Load();

    txtname.setText("");
    txtaddress.setText("");
    txttel.setText("");
    btnGender.clearSelection();
    txtname.requestFocus();
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberMouseClicked
              
    }//GEN-LAST:event_tblMemberMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
               
    String id = txtMS.getText().trim();
    if (id.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Please enter a member ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        int memberId = Integer.parseInt(id);

        CMember update = new CMember();
        update.updateMember(memberId, txtname.getText(), txtaddress.getText(), txttel.getText(), rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "");

        txtname.setText("");
        txtaddress.setText("");
        txttel.setText("");
        btnGender.clearSelection();

        txtname.requestFocus();
        Member_Load();
        btnadd.setEnabled(true);
    } 
    catch (NumberFormatException e) 
    {
        JOptionPane.showMessageDialog(this, "Invalid member ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
    String id = txtMS.getText().trim();
    if (id.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Please enter a member ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        int memberId = Integer.parseInt(id);

        CMember delete = new CMember();
        delete.deleteMember(memberId);

        txtname.setText("");
        txtaddress.setText("");
        txttel.setText("");
        btnGender.clearSelection();

        txtname.requestFocus();
        Member_Load();
        btnadd.setEnabled(true);
    } 
    catch (NumberFormatException e)
    {
        JOptionPane.showMessageDialog(this, "Invalid member ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        VMain m = new VMain();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSActionPerformed
        
    String id = txtMS.getText().trim();

    if (id.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Please enter a member ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        int memberId = Integer.parseInt(id);
        CMember controller = new CMember();
        ResultSet rs = controller.searchMemberById(memberId);

        if (rs.next()) 
        {
            txtname.setText(rs.getString("name"));
            txtaddress.setText(rs.getString("address"));
            txttel.setText(rs.getString("tel"));
            String gender = rs.getString("gender");
            
            if (gender.equals("Male"))
            {
                rbMale.setSelected(true);
            }
            else if (gender.equals("Female"))
            {
                rbFemale.setSelected(true);
            }
            btnadd.setEnabled(false);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Member not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    catch (NumberFormatException e)
    {
        JOptionPane.showMessageDialog(this, "Invalid member ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
    } 
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_txtMSActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblMember;
    private javax.swing.JTextField txtMS;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
