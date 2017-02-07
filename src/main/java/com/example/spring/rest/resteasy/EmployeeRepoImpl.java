package com.example.spring.rest.resteasy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EmployeeRepoImpl implements EmployeeRepo {

	@Override
	public Map<String, String> getEmpDetails(String id) {

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id", id);
		map.put("name", "Tharindu");
		map.put("location", "Kelaniya");

		return map;
	}
	
	
	
}
