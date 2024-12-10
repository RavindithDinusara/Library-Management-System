package view;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import controller.CIssue_Book;

public class VIssue_Book extends javax.swing.JFrame 
{
    public VIssue_Book() 
    {
        setSize(947,654);
        initComponents();
        IssueBook_Load();       
    }
    CIssue_Book issueBookController = new CIssue_Book();
    
    public void IssueBook_Load() 
    {
        DefaultTableModel model = (DefaultTableModel) tblIssueBook.getModel();
        issueBookController.loadIssueBooks(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIssueBook = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        DSissuedate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        DSreturndate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBID = new javax.swing.JTextField();
        txtMID = new javax.swing.JTextField();
        txtBN = new javax.swing.JTextField();
        txtMN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                 ISSUE BOOK");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 950, 70));

        tblIssueBook.setBackground(new java.awt.Color(0, 0, 0));
        tblIssueBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        tblIssueBook.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblIssueBook.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIssueBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIssueBook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 810, 160));

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ISSUE");
        btnadd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 260, 50));

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Close");
        btncancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 260, 50));

        DSissuedate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(DSissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Issue Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        DSreturndate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(DSreturndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Book ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txtBID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtBID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBIDActionPerformed(evt);
            }
        });
        txtBID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtBID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, 30));

        txtMID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtMID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, 30));

        txtBN.setBackground(new java.awt.Color(204, 204, 204));
        txtBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBNKeyPressed(evt);
            }
        });
        jPanel1.add(txtBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 200, 30));

        txtMN.setBackground(new java.awt.Color(204, 204, 204));
        txtMN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMNKeyPressed(evt);
            }
        });
        jPanel1.add(txtMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Member ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/BackGR.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 947, 654));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            
    String mid = txtMID.getText();
    String bookid = txtBID.getText();
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    String issuedate = date_format.format(DSissuedate.getDate());
    SimpleDateFormat date_format1 = new SimpleDateFormat("yyyy-MM-dd");
    String returndate = date_format1.format(DSreturndate.getDate());

    try 
    {
        CIssue_Book add = new CIssue_Book();
        add.addIssueBook(mid, bookid, issuedate, returndate);

        IssueBook_Load();

        txtMID.setText("");
        txtBID.setText("");
        txtMN.setText("");
        txtBN.setText("");
        DSissuedate.setDate(null);
        DSreturndate.setDate(null);
        txtMID.requestFocus();
    } 
    catch (Exception e) 
    {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblIssueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIssueBookMouseClicked

    }//GEN-LAST:event_tblIssueBookMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        VMain m = new VMain();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtMIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMIDKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        String mid = txtMID.getText();
        try 
        {
            CIssue_Book controller = new CIssue_Book();
            ResultSet rs = controller.searchMemberById(mid);

            if (rs.next() == false) 
            {
                JOptionPane.showMessageDialog(this, "Member ID not Found");
            } 
            else 
            {
                String membername = rs.getString("name");
                txtMN.setText(membername.trim());
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(VIssue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    }//GEN-LAST:event_txtMIDKeyPressed

    private void txtBNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBNKeyPressed

    }//GEN-LAST:event_txtBNKeyPressed

    private void txtMNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMNKeyPressed

    }//GEN-LAST:event_txtMNKeyPressed

    private void txtBIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBIDKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
        String bid = txtBID.getText();
        try 
        {
            CIssue_Book controller = new CIssue_Book();
            ResultSet rs = controller.searchBookById(bid);

            if (rs.next() == false) 
            {
                JOptionPane.showMessageDialog(this, "Book not Found");
            } 
            else
            {
                String bookname = rs.getString("bname");
                txtBN.setText(bookname.trim());
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(VIssue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_txtBIDKeyPressed

    private void txtBIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBIDActionPerformed

    }//GEN-LAST:event_txtBIDActionPerformed
             
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
