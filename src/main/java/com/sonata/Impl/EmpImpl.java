package com.sonata.Impl;

import com.sonata.Intf.EmpIntf;
import com.sonata.Model.Employee;


public class EmpImpl implements EmpIntf {

	@Override
	public double yearlySal(Employee e3) {
		double ySal;
		ySal = e3.getEmpSal()*12;
		return ySal;
	}

	@Override
	public double appSal(Employee e1) {
		double aSal;
		if(e1.getEmpSal()<10000) {
			aSal = 5000;
		
		}else {
			aSal = 1000;
		}
		return aSal;
	}

}
