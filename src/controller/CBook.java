package controller;
import model.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CBook
{
   
    public void addbook(String bname, String category, String author, String publisher, String content, int no, int edition) 
    {
        MBook Maddbook = new MBook();
        Maddbook.addbook(bname, category, author, publisher, content, no, edition);
    }

    public void deleteBook(int id) 
    {
        MBook Maddbook = new MBook();
        Maddbook.deleteBook(id);
    }

    public void loadBooks(DefaultTableModel model)
    {
        MBook Maddbook = new MBook();
        Maddbook.loadBooks(model);
    }

    public void updateBook(int id, String bname, String category, String author, String publisher, String content, int no, int edition)
    {
        MBook Maddbook = new MBook();
        Maddbook.updateBook(id, bname, category, author, publisher, content, no, edition);
    }

    public ResultSet searchBookById(int bookId) throws SQLException 
    {
        MBook MSearchBook = new MBook();
        return MSearchBook.searchBookById(bookId);
    }
}