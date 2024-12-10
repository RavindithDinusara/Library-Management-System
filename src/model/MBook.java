package model;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MBook 
{  
    public void addbook(String bname, String category, String author, String publisher, String content, int no, int edition)
    {
    
        Statement st = null;
    try
    {
        st = DBConnection.createDBConnection().createStatement();

        String check = "SELECT COUNT(*) FROM book WHERE bname='" + bname +"'";
        ResultSet rs = st.executeQuery(check);
        rs.next();
        if (rs.getInt(1) > 0) 
        {
            JOptionPane.showMessageDialog(null, "Book with the same details already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO book (bname, catname, author, publisher, content, pages, edition) VALUES ('" 
                     + bname + "', '" 
                     + category + "', '" 
                     + author + "', '" 
                     + publisher + "', '" 
                     + content + "', " 
                     + no + ", " 
                     + edition + ")";
        st.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "Book added successfully!");
    }
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Error adding book: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public void updateBook(int id, String bname, String category, String author, String publisher, String content, int no, int edition) {
    Statement st = null;
    try {
        st = DBConnection.createDBConnection().createStatement();
        
        if (bname.isEmpty() || category.isEmpty() || author.isEmpty() || publisher.isEmpty() || content.isEmpty() || no <= 0 || edition <= 0) 
        {
            JOptionPane.showMessageDialog(null, "All fields must be filled out and valid", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String checkSql = "SELECT COUNT(*) FROM book WHERE bname='" + bname + "' AND catname='" + category + "' AND author='" + author + "' AND publisher='" + publisher + "' AND content='" + content + "' AND pages=" + no + " AND edition=" + edition + " AND id != " + id;
        ResultSet rs = st.executeQuery(checkSql);
        rs.next();
        
        if (rs.getInt(1) > 0) 
        {
            JOptionPane.showMessageDialog(null, "Another book with the same details already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this book?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.NO_OPTION) {
            return;
        }

        String sql = "UPDATE book SET bname='" + bname + "', catname='" + category + "', author='" + author + "', publisher='" + publisher + "', content='" + content + "', pages=" + no + ", edition=" + edition + " WHERE id=" + id;
        int i = st.executeUpdate(sql);
        
        if (i == 1) 
        {
            JOptionPane.showMessageDialog(null, "Book updated successfully");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Error updating book");
        }
    } 
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void deleteBook(int id)
    {
    Statement st = null;
    try 
    {
        st = DBConnection.createDBConnection().createStatement();

        String checkSql = "SELECT COUNT(*) FROM book WHERE id=" + id;
        ResultSet rs = st.executeQuery(checkSql);
        rs.next();
        if (rs.getInt(1) == 0)
        {
            JOptionPane.showMessageDialog(null, "Book not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this book?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION)
        {
            return;
        }
        String sql = "DELETE FROM book WHERE id=" + id;
        int i = st.executeUpdate(sql);
        
        if (i == 1)
        {
            JOptionPane.showMessageDialog(null, "Book deleted successfully");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Error deleting book");
        }
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }     
}
    public void loadBooks(DefaultTableModel model) 
    {
        Statement st = null;
        ResultSet rs = null;
        try 
        {
            st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM book");
            
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
            JOptionPane.showMessageDialog(null, "Error loading books: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    public ResultSet getBookDetails(int bookId) 
    {
        Statement st = null;
        ResultSet rs = null;
        try
        {
            st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM book WHERE id = " + bookId);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error fetching book details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public ResultSet searchBookById(int bookId) throws SQLException 
    {
        Statement st = DBConnection.createDBConnection().createStatement();
        return st.executeQuery("SELECT * FROM book WHERE id = " + bookId);
    }
}