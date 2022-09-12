package com.sonata.JDBCExampleMaven;

import com.sonata.DAOImpl1.StudentImpl1;
import com.sonata.model1.Student1;


public class App {
	 public static void main( String[] args )
	    {
	    	
	    	Student1 s1 = new Student1();
	    	s1.setId(13);
	    	s1.setName("Roopa");
	    	
	    	StudentImpl1 p1 = new StudentImpl1();
	    	int a1 = p1.save(s1);    	
	    	System.out.println(a1);
	    }

}
