package com.sonata.test.two;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.eModel.Employee;



public class EmpDBTest {
	Employee e1 = new Employee();
	EmployeeImpl ep1 = new EmployeeImpl();
	
	@Test
	public void Test1 () {
		e1.setEmpID(102);
		e1.setEmpName("Sharath");
		e1.setEmpSal(30000.00);
		assertEquals(0, ep1.save(e1));
		
	}
	@Test
	public void Test2 () {
		e1.setEmpID(104);
		e1.setEmpName("Jay");
		e1.setEmpSal(30000.00);
		assertEquals(0, ep1.save(e1));
		
	}
}
