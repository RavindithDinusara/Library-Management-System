package controller;

import model.MIssue_Book;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CIssue_Book
{   
    public void addIssueBook(String mid, String bookid, String issuedate, String returndate) 
    {
        MIssue_Book MAddIssueBook = new MIssue_Book();
        MAddIssueBook.addIssueBook(mid, bookid, issuedate, returndate);
    }

    public void loadIssueBooks(DefaultTableModel model) 
    {
        MIssue_Book MLoadIssueBooks = new MIssue_Book();
        MLoadIssueBooks.loadIssueBooks(model);
    }

    public ResultSet searchBookById(String bid) throws SQLException 
    {
        MIssue_Book MSearchBook = new MIssue_Book();
        return MSearchBook.searchBookById(bid);
    }
    public ResultSet searchMemberById(String mid) throws SQLException 
    {
        MIssue_Book MSearchMember = new MIssue_Book();
        return MSearchMember.searchMemberById(mid);
    }
}