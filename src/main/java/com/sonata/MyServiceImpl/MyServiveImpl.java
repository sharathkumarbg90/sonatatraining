package com.sonata.MyServiceImpl;
import java.util.ArrayList;
import java.util.List;

import com.sonata.MyService.MyServiveIntf;

public class MyServiveImpl {
	private MyServiveIntf myService;
	MyServiveImpl() {}
	MyServiveImpl(MyServiveIntf mySer) {
		this.myService = mySer;
		
	}
	public List<String> retriveRelated(String user) {
		List<String> filteredValue = new ArrayList<String>();
		List<String> allToDo = myService.retrieveUsers(user);
        for(String all : allToDo) {
            if(all.contains("Spring")) {
                filteredValue.add(all);
            }
        }
        return filteredValue;
    }
}






