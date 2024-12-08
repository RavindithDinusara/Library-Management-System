package view;

import controller.CReturn_Book;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

public class VReturn_Book extends javax.swing.JFrame 
{
    public VReturn_Book() 
    {
        setSize(947, 654);
        initComponents();
        ReturnBook_Load();
    }
    CReturn_Book returnBookController = new CReturn_Book();

    public void ReturnBook_Load() 
    {
        DefaultTableModel model = (DefaultTableModel) tblReturnBook.getModel();
        returnBookController.loadReturnBooks(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturnBook = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtElap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFine = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblReturndate = new javax.swing.JLabel();
        lblBook = new javax.swing.JLabel();
        lblMN = new javax.swing.JLabel();
        txtMID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                 RETURN BOOK");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 960, -1));

        tblReturnBook.setBackground(new java.awt.Color(0, 0, 0));
        tblReturnBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblReturnBook.setForeground(new java.awt.Color(255, 255, 255));
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
        tblReturnBook.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblReturnBook.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblReturnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReturnBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReturnBook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 850, 220));

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Return");
        btnadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 260, 43));

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
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 260, 43));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Days Elap");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 110, -1));

        txtElap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtElap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtElap, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 260, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fine");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 70, -1));

        txtFine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 260, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Name      :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book                      :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return date          :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        lblReturndate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReturndate.setForeground(new java.awt.Color(255, 255, 255));
        lblReturndate.setText("______________________");
        jPanel1.add(lblReturndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        lblBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBook.setForeground(new java.awt.Color(255, 255, 255));
        lblBook.setText("______________________");
        jPanel1.add(lblBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        lblMN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMN.setForeground(new java.awt.Color(255, 255, 255));
        lblMN.setText("______________________");
        jPanel1.add(lblMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        txtMID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtMID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMIDKeyPressed(evt);
            }
        });
        jPanel1.add(txtMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Member ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/BackGR.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, 950, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -10, 947, 654));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            
    String mid = txtMID.getText();
    String membername = lblMN.getText();
    String bookname = lblBook.getText();
    String returndate = lblReturndate.getText();
    String elapdays = txtElap.getText();
    String fine = txtFine.getText();

    try 
    {
        returnBookController.addReturnBook(mid, membername, bookname, returndate, elapdays, fine);
        ReturnBook_Load();

        txtMID.setText("");
        lblMN.setText("");
        lblBook.setText("");
        lblReturndate.setText("");
        txtElap.setText("");
        txtFine.setText("");
        txtMID.requestFocus();
    } 
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblReturnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReturnBookMouseClicked
  
    }//GEN-LAST:event_tblReturnBookMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        VMain m = new VMain();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtMIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMIDKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
            String memberId = txtMID.getText();
            try 
            {
                CReturn_Book controller = new CReturn_Book();
                ResultSet rs = controller.getMemberBookDetails(memberId);
                
                if (!rs.next())
                {
                    JOptionPane.showMessageDialog(this, "Member ID not Found");
                }
                else
                {
                    String membername = rs.getString("m.name");
                    String bname = rs.getString("b.bname");
                    lblMN.setText(membername.trim());
                    lblBook.setText(bname.trim());
                    String date = rs.getString("i.return_date");
                    lblReturndate.setText(date);
                    String elp = rs.getString("elap");
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
            catch (ArithmeticException ex1)
            {
                JOptionPane.showMessageDialog(null, "Calculation Error: " + ex1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
            catch (SQLException ex2) 
            {
                JOptionPane.showMessageDialog(null, "Error loading members: " + ex2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
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
