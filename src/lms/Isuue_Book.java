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

public class Isuue_Book extends javax.swing.JFrame {

    public Isuue_Book() {
        initComponents();
        connect();
        IssueBook_Load();
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
        
    public void IssueBook_Load()
    {
        int columnCount;
    try 
    {
        pst = con.prepareStatement("SELECT i.id, m.name, b.bname, i.issue_date, i.return_date FROM issuebook i JOIN member m ON i.member_id = m.id JOIN book b ON i.book_id = b.id");
        rs = pst.executeQuery();
        
        ResultSetMetaData rsMetaData = rs.getMetaData();
        columnCount = rsMetaData.getColumnCount();
        
        DefaultTableModel tableModel = (DefaultTableModel) tblIssueBook.getModel();
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
        JOptionPane.showMessageDialog(null, "Error loading issued book data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);        
    }            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMID = new javax.swing.JTextField();
        txtMN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBID = new javax.swing.JTextField();
        txtBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DSissuedate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        DSreturndate = new com.toedter.calendar.JDateChooser();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIssueBook = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISSUE BOOK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtMID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 163, -1));

        txtMN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtMN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMNKeyPressed(evt);
            }
        });
        jPanel1.add(txtMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 165, 22));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Book ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        txtBID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtBID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 163, -1));

        txtBN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBNActionPerformed(evt);
            }
        });
        txtBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBNKeyPressed(evt);
            }
        });
        jPanel1.add(txtBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 163, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Issue Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        DSissuedate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(DSissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 100, -1));

        DSreturndate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(DSreturndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 200, -1));

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ISSUE");
        btnadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 250, 40));

        btndelete.setBackground(new java.awt.Color(204, 0, 0));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 250, 40));

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 250, 40));

        tblIssueBook.setBackground(new java.awt.Color(0, 0, 0));
        tblIssueBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblIssueBook.setForeground(new java.awt.Color(255, 255, 255));
        tblIssueBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Book", "Issue Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblIssueBook.setSelectionForeground(new java.awt.Color(0, 204, 255));
        tblIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIssueBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIssueBook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 390, 740, 182));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/BackGR.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 888, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            
    String mid = txtMID.getText().trim();
    String bookid = txtBID.getText().trim();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String issuedate = "";
    String returndate = "";

    if (DSissuedate.getDate() != null) 
    {
        issuedate = dateFormat.format(DSissuedate.getDate());
    }
    if (DSreturndate.getDate() != null) 
    {
        returndate = dateFormat.format(DSreturndate.getDate());
    }

    if (mid.isEmpty() || bookid.isEmpty() || issuedate.isEmpty() || returndate.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        pst = con.prepareStatement("INSERT INTO Issuebook(member_id, book_id, issue_date, return_date) VALUES (?, ?, ?, ?)");
        pst.setString(1, mid);
        pst.setString(2, bookid);
        pst.setString(3, issuedate);
        pst.setString(4, returndate);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Book Issued Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtMID.setText("");
            txtBID.setText("");  
            txtMN.setText("");
            txtBN.setText("");
            DSissuedate.setDate(null);
            DSreturndate.setDate(null);

            IssueBook_Load();
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Error issuing book", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);       
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblIssueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIssueBookMouseClicked
        
        DefaultTableModel d1=(DefaultTableModel)tblIssueBook.getModel();
        int selectIndex=tblIssueBook.getSelectedRow();
        int id=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        btnadd.setEnabled(false);
  
    }//GEN-LAST:event_tblIssueBookMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
         DefaultTableModel tableModel = (DefaultTableModel) tblIssueBook.getModel();
    int selectedIndex = tblIssueBook.getSelectedRow();

    if (selectedIndex == -1) 
    {
        JOptionPane.showMessageDialog(this, "Please select an issue record to delete", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this issue record?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) 
    {
        return;
    }

    try 
    {
        pst = con.prepareStatement("DELETE FROM issuebook WHERE id = ?");
        pst.setInt(1, id);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Issue record deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtMID.setText("");
            txtBN.setText("");
            txtBID.setText("");
            txtBID.setText("");

            txtMID.requestFocus();
            IssueBook_Load();
            btnadd.setEnabled(true);
        } 
        else
        {
            JOptionPane.showMessageDialog(this, "Error deleting issue record", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void txtMIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMIDKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        String mid = txtMID.getText().trim();

        if (mid.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Member ID cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try 
        {
            pst = con.prepareStatement("SELECT * FROM member WHERE id = ?");
            pst.setString(1, mid);
            rs = pst.executeQuery();

            if (!rs.next())
            {
                JOptionPane.showMessageDialog(this, "Member ID not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String memberName = rs.getString("name");
                txtMN.setText(memberName.trim());
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_txtMIDKeyPressed

    private void txtBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBNKeyPressed

    private void txtMNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMNKeyPressed

    private void txtBIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBIDKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
        String bid = txtBID.getText().trim();

        if (bid.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Book ID cannot be empty", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try
        {
            pst = con.prepareStatement("SELECT * FROM book WHERE id = ?");
            pst.setString(1, bid);
            rs = pst.executeQuery();

            if (!rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "Book not found", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else 
            {
                String bookName = rs.getString("bname");
                txtBN.setText(bookName.trim());
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);           
        }
    }
    }//GEN-LAST:event_txtBIDKeyPressed

    private void txtBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBNActionPerformed
             
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DSissuedate;
    private com.toedter.calendar.JDateChooser DSreturndate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIssueBook;
    private javax.swing.JTextField txtBID;
    private javax.swing.JTextField txtBN;
    private javax.swing.JTextField txtMID;
    private javax.swing.JTextField txtMN;
    // End of variables declaration//GEN-END:variables
}
