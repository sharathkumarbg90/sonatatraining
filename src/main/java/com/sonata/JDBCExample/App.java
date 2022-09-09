package com.sonata.JDBCExample;

import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.eModel.Employee;

public class App {

	public static void main(String[] args) {
		Employee s1 = new Employee();
		s1.setEmpID(13);
		s1.setEmpName("Roopa");
		s1.setEmpSal(1234.55);
		
		EmployeeImpl p1 = new EmployeeImpl();
		int a1 = p1.save(s1);
		System.out.println(a1);
		

	}

}
