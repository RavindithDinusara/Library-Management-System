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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblMN = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBook = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblReturndate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtElap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFine = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturnBook = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtMID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        lblMN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMN.setForeground(new java.awt.Color(255, 255, 255));
        lblMN.setText("___________________");
        jPanel1.add(lblMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        lblBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBook.setForeground(new java.awt.Color(255, 255, 255));
        lblBook.setText("___________________");
        jPanel1.add(lblBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        lblReturndate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReturndate.setForeground(new java.awt.Color(255, 255, 255));
        lblReturndate.setText("___________________");
        jPanel1.add(lblReturndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Days Elap");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        jPanel1.add(txtElap, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fine");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        jPanel1.add(txtFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 210, -1));

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Return");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 97, 43));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 98, 43));

        btndelete.setBackground(new java.awt.Color(204, 0, 0));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 92, 43));

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 88, 43));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 783, 151));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/BackGR.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 930, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-17, -10, 900, 620));

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
        Main m = new Main();
        this.setVisible(false);
        m.setVisible(true);
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
