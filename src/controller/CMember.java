package controller;
import model.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CMember 
{
    
    public void addMember(String name, String address, String telephone, String gender)
    {
        MMember MAddMember = new MMember();
        MAddMember.addMember(name, address, telephone, gender);
    }

    public void updateMember(int id, String name, String address, String telephone, String gender) 
    {
        MMember MUpdateMember = new MMember();
        MUpdateMember.updateMember(id, name, address, telephone, gender);
    }

    public void deleteMember(int id) 
    {
        MMember MDeleteMember = new MMember();
        MDeleteMember.deleteMember(id);
    }

    public void loadMembers(DefaultTableModel model)
    {
        MMember MLoadMembers = new MMember();
        MLoadMembers.loadMembers(model);
    }

    public ResultSet searchMemberById(int memberId) throws SQLException 
    {
        MMember MSearchMember = new MMember();
        return MSearchMember.searchMemberById(memberId);
    }
}