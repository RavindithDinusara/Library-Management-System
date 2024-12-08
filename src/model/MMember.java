package model;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MMember 
{  
    public void addMember(String name, String address, String telephone, String gender)
    {
    Statement st = null;
    try
    {
        st = DBConnection.createDBConnection().createStatement();
        
        if (name.isEmpty() || address.isEmpty() || telephone.isEmpty() || gender.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String check = "SELECT COUNT(*) FROM member WHERE name='" + name + "'";
        ResultSet rs = st.executeQuery(check);
        rs.next();
        if (rs.getInt(1) > 0)
        {
            JOptionPane.showMessageDialog(null, "Member with the same details already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to add this member?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) 
        {
            return;
        }

        String sql = "INSERT INTO member (name, address, tel, gender) VALUES ('" 
                     + name + "', '" 
                     + address + "', '" 
                     + telephone + "', '" 
                     + gender + "')";
        st.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "Member added successfully!");
    } 
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Error adding member: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
}
    public void updateMember(int id, String name, String address, String telephone, String gender) {
    Statement st = null;
    try 
    {
        st = DBConnection.createDBConnection().createStatement();
        
        if (name.isEmpty() || address.isEmpty() || telephone.isEmpty() || gender.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String checkSql = "SELECT COUNT(*) FROM member WHERE name='" + name + "' AND address='" + address + "' AND tel='" + telephone + "' AND gender='" + gender + "' AND id != " + id;
        ResultSet rs = st.executeQuery(checkSql);
        rs.next();
        if (rs.getInt(1) > 0) 
        {
            JOptionPane.showMessageDialog(null, "Another member with the same details already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this member?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION)
        {
            return;
        }
        
        String sql = "UPDATE member SET name='" + name + "', address='" + address + "', tel='" + telephone + "', gender='" + gender + "' WHERE id=" + id;
        int i = st.executeUpdate(sql);
        
        if (i == 1) 
        {
            JOptionPane.showMessageDialog(null, "Member updated successfully!");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Error updating member");
        }
    }
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
    
}

    public void deleteMember(int id) 
    {
    Statement st = null;
    try 
    {
        st = DBConnection.createDBConnection().createStatement();
        
        String checkSql = "SELECT COUNT(*) FROM member WHERE id=" + id;
        ResultSet rs = st.executeQuery(checkSql);
        rs.next();
        if (rs.getInt(1) == 0) 
        {
            JOptionPane.showMessageDialog(null, "Member not found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this member?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION)
        {
            return;
        }

        String sql = "DELETE FROM member WHERE id=" + id;
        int i = st.executeUpdate(sql);
        
        if (i == 1) 
        {
            JOptionPane.showMessageDialog(null, "Member deleted successfully!");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Error deleting member");
        }
    } 
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
}
    public void loadMembers(DefaultTableModel model) 
    {
        Statement st = null;
        ResultSet rs = null;
        try 
        {
            st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM member");
            
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
            JOptionPane.showMessageDialog(null, "Error loading members: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    public ResultSet searchMemberById(int memberId) throws SQLException 
    {
        Statement st = DBConnection.createDBConnection().createStatement();
        return st.executeQuery("SELECT * FROM member WHERE id = " + memberId);
    }
}