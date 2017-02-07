package com.example.spring.rest.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/employee")
public class ResteasyApplication extends Application {
	
	private static Set<Object> singletons = new HashSet<>();
	
	public ResteasyApplication() {
		singletons.add(new ResteasyService());
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
}
