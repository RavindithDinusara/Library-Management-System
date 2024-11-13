package lms;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

public class Return_Book extends javax.swing.JFrame {

    public Return_Book() {
        initComponents();
        connect();
        ReturnBook_Load();
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
        
    public void ReturnBook_Load()
    {
        int columnCount;
    try 
    {
        pst = con.prepareStatement("SELECT * FROM returnbook");
        rs = pst.executeQuery();
        
        ResultSetMetaData rsMetaData = rs.getMetaData();
        columnCount = rsMetaData.getColumnCount();
        
        DefaultTableModel tableModel = (DefaultTableModel) tblReturnBook.getModel();
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
        JOptionPane.showMessageDialog(null, "Error loading return book data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMN = new javax.swing.JLabel();
        lblBook = new javax.swing.JLabel();
        lblReturndate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtElap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFine = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturnBook = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member ID");

        txtMID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMIDKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return date");

        lblMN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMN.setForeground(new java.awt.Color(255, 255, 255));
        lblMN.setText("___________________");

        lblBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBook.setForeground(new java.awt.Color(255, 255, 255));
        lblBook.setText("___________________");

        lblReturndate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReturndate.setForeground(new java.awt.Color(255, 255, 255));
        lblReturndate.setText("___________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(txtMID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblReturndate))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMN)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblBook))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblReturndate))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 799, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Days Elap");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel3.add(txtElap, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 186, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fine");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));
        jPanel3.add(txtFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 170, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 799, 63));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Return");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel4.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 97, 43));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 98, 43));

        btndelete.setBackground(new java.awt.Color(204, 0, 0));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 92, 43));

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel4.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 88, 43));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 800, 80));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tblReturnBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member ID", "Member Name", "Book ", "Return Date", "Days Elaped", "Fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblReturnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReturnBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReturnBook);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 799, 210));

        jPanel6.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Book");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 880, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 880, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -10, 880, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            
    String mid = txtMID.getText().trim();
    String membername = lblMN.getText().trim();
    String bookname = lblBook.getText().trim();
    String returndate = lblReturndate.getText().trim();
    String elapdays = txtElap.getText().trim();
    String fine = txtFine.getText().trim();

    if (mid.isEmpty() || membername.isEmpty() || bookname.isEmpty() || returndate.isEmpty() || elapdays.isEmpty() || fine.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try
    {
        pst = con.prepareStatement("INSERT INTO returnbook(mid, mname, bname, returndate, elp, fine) VALUES (?, ?, ?, ?, ?, ?)");
        pst.setString(1, mid);
        pst.setString(2, membername);
        pst.setString(3, bookname);
        pst.setString(4, returndate);
        pst.setString(5, elapdays);
        pst.setString(6, fine);

        int result = pst.executeUpdate();

        pst = con.prepareStatement("DELETE FROM issuebook WHERE member_id = ?");
        pst.setString(1, mid);
        pst.executeUpdate();

        if (result == 1)
        {
            JOptionPane.showMessageDialog(this, "Book Returned Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtMID.setText("");
            lblMN.setText("");
            lblBook.setText("");
            lblReturndate.setText("");
            txtElap.setText("");
            txtFine.setText(""); 
            ReturnBook_Load();
            txtMID.requestFocus();
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Error returning book", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblReturnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReturnBookMouseClicked
        
        DefaultTableModel d1=(DefaultTableModel)tblReturnBook.getModel();
        int selectIndex=tblReturnBook.getSelectedRow();
        
        int id=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        txtMID.setText(d1.getValueAt(selectIndex, 1).toString());
        lblMN.setText(d1.getValueAt(selectIndex, 2).toString());
        lblBook.setText(d1.getValueAt(selectIndex, 3).toString());
        lblReturndate.setText(d1.getValueAt(selectIndex, 4).toString());
        txtElap.setText(d1.getValueAt(selectIndex, 5).toString());
        txtFine.setText(d1.getValueAt(selectIndex, 6).toString());
       
        btnadd.setEnabled(false);
  
    }//GEN-LAST:event_tblReturnBookMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
    DefaultTableModel tableModel = (DefaultTableModel) tblReturnBook.getModel();
    int selectedIndex = tblReturnBook.getSelectedRow();

    if (selectedIndex == -1) 
    {
        JOptionPane.showMessageDialog(this, "Please select a return record to delete", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this return record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) 
    {
        return;
    }

    try 
    {
        pst = con.prepareStatement("DELETE FROM returnbook WHERE id = ?");
        pst.setInt(1, id);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Return record deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtMID.setText("");
            lblMN.setText("");
            lblBook.setText("");
            lblReturndate.setText("");
            txtElap.setText("");
            txtFine.setText(""); 

            txtMID.requestFocus();
            ReturnBook_Load();
            btnadd.setEnabled(true);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Error deleting return record", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    
        DefaultTableModel tableModel = (DefaultTableModel) tblReturnBook.getModel();
    int selectedIndex = tblReturnBook.getSelectedRow();

    if (selectedIndex == -1) 
    {
        JOptionPane.showMessageDialog(this, "Please select a return record to update", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());

    String mid = txtMID.getText().trim();
    String membername = lblMN.getText().trim();
    String book = lblBook.getText().trim();
    String returndate = lblReturndate.getText().trim();
    String elap = txtElap.getText().trim();
    String fine = txtFine.getText().trim();

    if (mid.isEmpty() || membername.isEmpty() || book.isEmpty() || returndate.isEmpty() || elap.isEmpty() || fine.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        pst = con.prepareStatement("UPDATE returnbook SET mid = ?, mname = ?, bname = ?, returndate = ?, elp = ?, fine = ? WHERE id = ?");
        pst.setString(1, mid);
        pst.setString(2, membername);
        pst.setString(3, book);
        pst.setString(4, returndate);
        pst.setString(5, elap);
        pst.setString(6, fine);
        pst.setInt(7, id);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Return record updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtMID.setText("");
            lblMN.setText("");
            lblBook.setText("");
            lblReturndate.setText("");
            txtElap.setText("");
            txtFine.setText(""); 
            
            txtMID.requestFocus();           
            ReturnBook_Load();
            btnadd.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Error updating return record", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtMIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMIDKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {          
        String id = txtMID.getText().trim();

        if (id.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Member ID cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try 
        {
            pst = con.prepareStatement("SELECT m.name, b.bname, i.return_date, DATEDIFF(NOW(), i.return_date) AS elap FROM issuebook i JOIN member m ON i.member_id = m.id JOIN book b ON i.book_id = b.id WHERE i.member_id = ?");
            pst.setString(1, id);
            rs = pst.executeQuery();
            
            if (!rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "Member ID not found", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else 
            {
                String membername = rs.getString("m.name");
                String bname = rs.getString("b.bname");
                String date = rs.getString("i.return_date");
                String elp = rs.getString("elap");

                lblMN.setText(membername.trim());
                lblBook.setText(bname.trim());
                lblReturndate.setText(date);

                int elaped = Integer.parseInt(elp);
                
                if (elaped > 0) 
                {
                    txtElap.setText(elp);
                    int fine = elaped * 100;
                    txtFine.setText(String.valueOf(fine));
                } 
                else
                {
                    txtElap.setText("0");
                    txtFine.setText("0");
                }
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_txtMIDKeyPressed
             
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblMN;
    private javax.swing.JLabel lblReturndate;
    private javax.swing.JTable tblReturnBook;
    private javax.swing.JTextField txtElap;
    private javax.swing.JTextField txtFine;
    private javax.swing.JTextField txtMID;
    // End of variables declaration//GEN-END:variables
}
