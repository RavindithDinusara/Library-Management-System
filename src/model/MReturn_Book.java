package model;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MReturn_Book 
{
    public void addReturnBook(String mid, String membername, String bookname, String returndate, String elapdays, String fine) 
    {
        
    Statement st = null;
    try
    {
        st = DBConnection.createDBConnection().createStatement();

        if (mid.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Enter Member ID", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to return this book?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) 
        {
            return;
        }

        String sql = "INSERT INTO returnbook (mid, mname, bname, returndate, elp, fine) VALUES ('" 
                     + mid + "', '" 
                     + membername + "', '" 
                     + bookname + "', '" 
                     + returndate + "', '" 
                     + elapdays + "', '" 
                     + fine + "')";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Successfully Returned");

        String deleteSql = "DELETE FROM issuebook WHERE member_id = '" + mid + "'";
        st.executeUpdate(deleteSql);
    } 
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Error returning book: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void loadReturnBooks(DefaultTableModel model)
    {
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM returnbook");
            
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
            JOptionPane.showMessageDialog(null, "Error loading return books: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }
    public ResultSet getMemberBookDetails(String memberId) 
    {
        Statement st = null;
        ResultSet rs = null;
        try 
        {
            st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("SELECT m.name, b.bname, i.return_date, DATEDIFF(now(), i.return_date) AS elap " +
                    "FROM issuebook i " +
                    "JOIN member m ON i.member_id = m.id " +
                    "JOIN book b ON i.book_id = b.id " +
                    "WHERE i.member_id = '" + memberId + "'");
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error fetching member book details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
}