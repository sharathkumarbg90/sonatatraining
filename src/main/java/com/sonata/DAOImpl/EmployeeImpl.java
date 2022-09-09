package com.sonata.DAOImpl;
//import java.security.PKCS12Attribute;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.DAO.EmployeeIntf;
import com.sonata.eModel.Employee;
public class EmployeeImpl implements EmployeeIntf {
	DBConnection db = new DBConnection();
	int row = 0;
	public int save(Object object) {
		Employee p1 = (Employee) object;
		try {
			PreparedStatement s1 = db.getConnection().prepareStatement("Insert into employee values(?,?,?)");
			s1.setInt(1, p1.getEmpID());
			s1.setString(2, p1.getEmpName());
			s1.setDouble(3,p1.getEmpSal());
			row = s1.executeUpdate();
			db.closeconnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	
	

}
