package view;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import controller.CBook;
import model.DBConnection;

public class VBook extends javax.swing.JFrame
{

    public VBook() 
    {
        setSize(947, 654);
        initComponents();
        Book_Load();       
    }
    CBook bookController = new CBook();
         
    public void Book_Load()
    {
        DefaultTableModel model = (DefaultTableModel) tblBook.getModel();
        bookController.loadBooks(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcontent = new javax.swing.JTextField();
        txtNOP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBedition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                              ADD NEW BOOK");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 950, 60));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Search Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Author");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtBname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtBname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publisher");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAuthor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtPublisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPublisher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 220, 30));

        btnadd.setBackground(new java.awt.Color(0, 102, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 250, 39));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 250, 39));

        btndelete.setBackground(new java.awt.Color(204, 0, 51));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 250, 39));

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
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 250, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Content");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        txtcontent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcontent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtcontent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontentActionPerformed(evt);
            }
        });
        jPanel1.add(txtcontent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 220, 40));

        txtNOP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNOP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtNOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOPActionPerformed(evt);
            }
        });
        jPanel1.add(txtNOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No of Pages");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book Edition");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        txtBedition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBedition.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtBedition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeditionActionPerformed(evt);
            }
        });
        jPanel1.add(txtBedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 220, 30));

        tblBook.setBackground(new java.awt.Color(0, 0, 0));
        tblBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblBook.setForeground(new java.awt.Color(255, 255, 255));
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
        tblBook.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblBook.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 820, 170));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/BackGR.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
            
    String bname = txtBname.getText();
    String category = txtCategory.getText();
    String author = txtAuthor.getText();
    String publisher = txtPublisher.getText();
    String content = txtcontent.getText();
    String noStr = txtNOP.getText();
    String editionStr = txtBedition.getText();

    if (bname.isEmpty() || category.isEmpty() || author.isEmpty() || publisher.isEmpty() || content.isEmpty() || noStr.isEmpty() || editionStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    int no;
    int edition;

    try 
    {
        no = Integer.parseInt(noStr);
        edition = Integer.parseInt(editionStr);
    } 
    catch (NumberFormatException e) 
    {
        JOptionPane.showMessageDialog(this, "Number of pages and edition must be integers", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this book?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION)
    {
        return;
    }

    CBook add = new CBook();
    add.addbook(bname, category, author, publisher, content, no, edition);
    Book_Load();

    txtBname.setText("");
    txtCategory.setText("");
    txtAuthor.setText("");
    txtPublisher.setText("");
    txtcontent.setText("");
    txtNOP.setText("");
    txtBedition.setText("");
    txtBname.requestFocus();
    }//GEN-LAST:event_btnaddActionPerformed

    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
       
    }//GEN-LAST:event_tblBookMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
    String id = txtSearch.getText().trim();
    if (id.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Please enter a book ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        int bookId = Integer.parseInt(id);

        CBook delete = new CBook();
        delete.deleteBook(bookId);

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
    catch (NumberFormatException e) 
    {
        JOptionPane.showMessageDialog(this, "Invalid book ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        VMain m = new VMain();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtcontentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontentActionPerformed

    }//GEN-LAST:event_txtcontentActionPerformed

    private void txtNOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOPActionPerformed

    }//GEN-LAST:event_txtNOPActionPerformed

    private void txtBeditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeditionActionPerformed

    }//GEN-LAST:event_txtBeditionActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
    String id = txtSearch.getText().trim();
    if (id.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Please enter a book ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try
    {
        int bookId = Integer.parseInt(id);
        Statement st = DBConnection.createDBConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM book WHERE id = " + bookId);

        if (rs.next())
        {
            String bname = txtBname.getText();
            String category = txtCategory.getText();
            String author = txtAuthor.getText();
            String publisher = txtPublisher.getText();
            String content = txtcontent.getText();
            String noStr = txtNOP.getText();
            String editionStr = txtBedition.getText();

            int no;
            int edition;

            try 
            {
                no = Integer.parseInt(noStr);
                edition = Integer.parseInt(editionStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Number of pages and edition must be integers", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            CBook controller = new CBook();
            controller.updateBook(bookId, bname, category, author, publisher, content, no, edition);

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
            JOptionPane.showMessageDialog(this, "Book not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (NumberFormatException e)
    {
        JOptionPane.showMessageDialog(this, "Invalid book ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
    } 
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    String id = txtSearch.getText().trim();

    if (id.isEmpty()) 
    {
        JOptionPane.showMessageDialog(this, "Please enter a book ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try 
    {
        int bookId = Integer.parseInt(id);
        CBook controller = new CBook();
        ResultSet rs = controller.searchBookById(bookId);

        if (rs.next()) 
        {
            txtBname.setText(rs.getString("bname"));
            txtCategory.setText(rs.getString("catname"));
            txtAuthor.setText(rs.getString("author"));
            txtPublisher.setText(rs.getString("publisher"));
            txtcontent.setText(rs.getString("content"));
            txtNOP.setText(rs.getString("pages"));
            txtBedition.setText(rs.getString("edition"));
            btnadd.setEnabled(false);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Book not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (NumberFormatException e) 
    {
        JOptionPane.showMessageDialog(this, "Invalid book ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
    } 
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_txtSearchActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBook;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBedition;
    private javax.swing.JTextField txtBname;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtNOP;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtcontent;
    // End of variables declaration//GEN-END:variables
}
