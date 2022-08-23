package com.sonata.one;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.Impl.EmpImpl;
import com.sonata.Model.Employee;

public class CallEmpExe {
	
	
	@Test 
	public void ytest() {
		Employee e1 = new Employee();
		EmpImpl e2 = new EmpImpl();
		e1.setEmpSal(100);
		double a=e2.yearlySal(e1);
		double b=e2.appSal(e1);
		Assertions.assertEquals(1200,a );
		Assertions.assertEquals(5000,b );

	}
	}

