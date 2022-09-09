package com.sonata.MyService;

import java.util.Arrays;
import java.util.List;

public class MyServiceStub implements MyServiveIntf {
	public List<String> retrieveUsers (String user) {
		return Arrays.asList("Learn Spring MVC", "Leasrn Spring", "Learn to Dance");
	}
}