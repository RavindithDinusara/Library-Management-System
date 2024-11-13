package lms;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Book extends javax.swing.JFrame {

    public Book() {
        initComponents();
        connect();
        Book_Load();
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
        
    public void Book_Load()
    {
        int a;
        try 
        {
            pst=con.prepareStatement("select * from book");
            rs=pst.executeQuery();
            
            ResultSetMetaData rsd=rs.getMetaData();
            a=rsd.getColumnCount();
            
            DefaultTableModel d=(DefaultTableModel)tblBook.getModel();
            d.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2=new Vector();
                
                for(int i=1;i<=a;i++)
                {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("bname"));
                    v2.add(rs.getString("catname"));
                    v2.add(rs.getString("author"));
                    v2.add(rs.getString("publisher"));
                    v2.add(rs.getString("content"));
                    v2.add(rs.getString("pages"));
                    v2.add(rs.getString("edition"));
                }
                d.addRow(v2);
            }                
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error loading book data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcontent = new javax.swing.JTextField();
        txtNOP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBedition = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW BOOK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtBname, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 29, 206, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel2.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 206, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Author");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel2.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 206, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publisher");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel2.add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 206, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Content");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 31, -1, -1));

        txtcontent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontentActionPerformed(evt);
            }
        });
        jPanel2.add(txtcontent, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 24, 190, 40));

        txtNOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOPActionPerformed(evt);
            }
        });
        jPanel2.add(txtNOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 78, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No of Pages");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book Edition");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        txtBedition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeditionActionPerformed(evt);
            }
        });
        jPanel2.add(txtBedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 118, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 760, 200));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel3.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 105, 39));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 108, 39));

        btndelete.setBackground(new java.awt.Color(204, 0, 51));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 100, 39));

        btncancel.setBackground(new java.awt.Color(51, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel3.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 99, 39));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 760, 61));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Book Name", "Author", "Publisher", "Content", "No of pages", "Edition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBook);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 742, 202));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 760, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            
    String bname = txtBname.getText().trim();
    String category = txtCategory.getText().trim();
    String author = txtAuthor.getText().trim();
    String publisher = txtPublisher.getText().trim();
    String content = txtcontent.getText().trim();
    String no = txtNOP.getText().trim();
    String edition = txtBedition.getText().trim();

    if (bname.isEmpty() || category.isEmpty() || author.isEmpty() || publisher.isEmpty() || content.isEmpty() || no.isEmpty() || edition.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        int pages = Integer.parseInt(no);
        if (pages <= 0) 
        {
            JOptionPane.showMessageDialog(this, "Number of pages must be a positive integer", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } 
    catch (NumberFormatException e)
    {
        JOptionPane.showMessageDialog(this, "Number of pages must be a valid integer", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        pst = con.prepareStatement("INSERT INTO book(bname, catname, author, publisher, content, pages, edition) VALUES (?, ?, ?, ?, ?, ?, ?)");
        pst.setString(1, bname);
        pst.setString(2, category);
        pst.setString(3, author);
        pst.setString(4, publisher);
        pst.setString(5, content);
        pst.setInt(6, Integer.parseInt(no));
        pst.setString(7, edition);

        int i = pst.executeUpdate();

        if (i == 1) {
            JOptionPane.showMessageDialog(this, "Book Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtBname.setText("");
            txtCategory.setText("");
            txtAuthor.setText("");
            txtPublisher.setText("");            
            txtcontent.setText("");
            txtNOP.setText("");
            txtBedition.setText("");
            Book_Load();
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Error adding book", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
        
        DefaultTableModel d1=(DefaultTableModel)tblBook.getModel();
        int selectIndex=tblBook.getSelectedRow();
        
        int id=Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        txtBname.setText(d1.getValueAt(selectIndex, 1).toString());
        txtCategory.setText(d1.getValueAt(selectIndex, 2).toString());
        txtAuthor.setText(d1.getValueAt(selectIndex, 3).toString());
        txtPublisher.setText(d1.getValueAt(selectIndex, 4).toString());
        txtcontent.setText(d1.getValueAt(selectIndex, 5).toString());
        txtNOP.setText(d1.getValueAt(selectIndex, 6).toString());
        txtBedition.setText(d1.getValueAt(selectIndex, 7).toString());
               
        btnadd.setEnabled(false);
  
    }//GEN-LAST:event_tblBookMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
    DefaultTableModel tableModel = (DefaultTableModel) tblBook.getModel();
    int selectedIndex = tblBook.getSelectedRow();

    if (selectedIndex == -1) 
    {
        JOptionPane.showMessageDialog(this, "Please select a book to delete", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION)
    {
        return;
    }

    try 
    {
        pst = con.prepareStatement("DELETE FROM book WHERE id = ?");
        pst.setInt(1, id);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Book Deleted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtBname.setText("");
            txtCategory.setText("");
            txtAuthor.setText("");
            txtPublisher.setText("");
            txtcontent.setText("");
            txtNOP.setText("");
            txtBedition.setText("");
            txtBname.requestFocus();
            Book_Load();
            btnadd.setEnabled(true);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Error deleting book", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtcontentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontentActionPerformed

    private void txtNOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOPActionPerformed

    private void txtBeditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBeditionActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) tblBook.getModel();
    int selectedIndex = tblBook.getSelectedRow();

    if (selectedIndex == -1) 
    {
        JOptionPane.showMessageDialog(this, "Please select a book to update", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());

    String bname = txtBname.getText().trim();
    String category = txtCategory.getText().trim();
    String author = txtAuthor.getText().trim();
    String publisher = txtPublisher.getText().trim();
    String content = txtcontent.getText().trim();
    String no = txtNOP.getText().trim();
    String edition = txtBedition.getText().trim();

    if (bname.isEmpty() || category.isEmpty() || author.isEmpty() || publisher.isEmpty() || content.isEmpty() || no.isEmpty() || edition.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        int pages = Integer.parseInt(no);
        if (pages <= 0) 
        {
            JOptionPane.showMessageDialog(this, "Number of pages must be a positive integer", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } 
    catch (NumberFormatException e) 
    {
        JOptionPane.showMessageDialog(this, "Number of pages must be a valid integer", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        pst = con.prepareStatement("UPDATE book SET bname = ?, catname = ?, author = ?, publisher = ?, content = ?, pages = ?, edition = ? WHERE id = ?");
        pst.setString(1, bname);
        pst.setString(2, category);
        pst.setString(3, author);
        pst.setString(4, publisher);
        pst.setString(5, content);
        pst.setInt(6, Integer.parseInt(no));
        pst.setString(7, edition);
        pst.setInt(8, id);

        int result = pst.executeUpdate();

        if (result == 1) 
        {
            JOptionPane.showMessageDialog(this, "Book Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtBname.setText("");
            txtCategory.setText("");
            txtAuthor.setText("");
            txtPublisher.setText("");
            txtcontent.setText("");
            txtNOP.setText("");
            txtBedition.setText("");
            txtBname.requestFocus();           
            Book_Load();
            btnadd.setEnabled(true);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Error updating book", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBook;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBedition;
    private javax.swing.JTextField txtBname;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtNOP;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtcontent;
    // End of variables declaration//GEN-END:variables
}
