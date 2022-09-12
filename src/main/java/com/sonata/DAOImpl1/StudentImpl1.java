package com.sonata.DAOImpl1;

//import java.security.PKCS12Attribute;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sonata.DAO1.Student1Intf;
import com.sonata.model1.Student1;

public class StudentImpl1 implements Student1Intf{
		DBConnection1 db = new DBConnection1();
	int row = 0;
	public int save(Object object) {
		Student1 p1 = (Student1) object ;
		try {
			PreparedStatement s1 = db.getConnection().prepareStatement("insert into student1 values(?,?)");
					
			s1.setInt(1,p1.getId());
			s1.setNString(2, p1.getName());
			row = s1.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}
	@Override
	public List<Student1> getData() {
		// TODO Auto-generated method stub
		return null;
	}
	
}