package controller;

import javax.swing.table.DefaultTableModel;
import model.MReturn_Book;
import java.sql.ResultSet;

public class CReturn_Book 
{

    public void addReturnBook(String mid, String membername, String bookname, String returndate, String elapdays, String fine) 
    {
        MReturn_Book MAddReturnBook = new MReturn_Book();
        MAddReturnBook.addReturnBook(mid,membername,bookname,returndate,elapdays,fine);
    }

    public void loadReturnBooks(DefaultTableModel model) 
    {
        MReturn_Book MLoadIssueBooks = new MReturn_Book();
        MLoadIssueBooks.loadReturnBooks(model);
    }

    public ResultSet getMemberBookDetails(String memberId)
    {
        MReturn_Book MSearchMember = new MReturn_Book();
        return MSearchMember.getMemberBookDetails(memberId);
    }
}