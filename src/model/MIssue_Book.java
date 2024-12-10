package model;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MIssue_Book 
{  
    public void addIssueBook(String mid, String bookid, String issuedate, String returndate)
    {
        
    Statement st = null;
    try 
    {
        st = DBConnection.createDBConnection().createStatement();

        if (mid.isEmpty() || bookid.isEmpty() || issuedate.isEmpty() || returndate.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String check = "SELECT COUNT(*)FROM issuebook WHERE member_id='" + mid +"'";
        ResultSet rs = st.executeQuery(check);
        rs.next();
        if (rs.getInt(1) > 0)
        {
            JOptionPane.showMessageDialog(null, "Book Already Issued For  Member!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to issue this book?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) 
        {
            return;
        }
        String sql = "INSERT INTO issuebook (member_id, book_id, issue_date, return_date) VALUES ('" 
                     + mid + "', '" 
                     + bookid + "', '" 
                     + issuedate + "', '" 
                     + returndate + "')";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Successfully Issued");
    }
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Error issuing book: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
}
    public void loadIssueBooks(DefaultTableModel model) 
    {
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("SELECT i.id, m.name, b.bname, i.issue_date, i.return_date FROM issuebook i JOIN member m ON i.member_id = m.id JOIN book b ON i.book_id = b.id");
            
            ResultSetMetaData rsd = rs.getMetaData();
            int columnCount = rsd.getColumnCount();
            
            model.setRowCount(0);
            
            while (rs.next()) 
            {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) 
                {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error loading issue books: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }
    public ResultSet searchBookById(String bid) throws SQLException
    {
        Statement st = DBConnection.createDBConnection().createStatement();
        return st.executeQuery("SELECT * FROM book WHERE id='" + bid + "'");
    }
    public ResultSet searchMemberById(String mid) throws SQLException 
    {
        Statement st = DBConnection.createDBConnection().createStatement();
        return st.executeQuery("SELECT * FROM member WHERE id='" + mid + "'");
        
    }
}