package com.example.spring.rest.resteasy;

import java.util.Map;

public interface EmployeeRepo {
	
	Map<String,String> getEmpDetails(String id);
	
}
